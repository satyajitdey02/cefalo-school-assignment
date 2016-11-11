package com.cefalo.school.dp.week12.assignment.Invoker;

import com.cefalo.school.dp.week12.assignment.command.*;
import com.cefalo.school.dp.week12.assignment.command.Void;
import com.cefalo.school.dp.week12.assignment.entity.Entity;
import com.cefalo.school.dp.week12.assignment.history.HistoricalData;
import com.cefalo.school.dp.week12.assignment.history.History;

import java.util.Map;

/**
 * Created by satyajit on 11/11/2016.
 */
public class DatabaseManager<T extends Entity> {

  private T t;
  private Command<T> command;
  private Command<T> noCommand = new Void<T>();

  private History<T> undos = new History<T>();
  private History<T> redos = new History<T>();

  public DatabaseManager() {
    resetUndos();
    resetRedos();
  }

  public DatabaseManager(Command<T> command) {
    this.command = command;
    resetUndos();
    resetRedos();
  }

  public void setCommand(Command<T> command) {
    this.command = command;
  }

  public T saveRecord(T t) {
    T result = command.execute(t);
    Command<T> deleteCommand = new Delete<T>((this.command).getDao());

    HistoricalData<T> historicalData = new HistoricalData<>(result, deleteCommand);
    undos.pushHistory(historicalData);

    return result;
  }

  public Map<Integer, T> readRecords() {
    return command.read();
  }

  public T updateRecord(T t) {
    T currentData = this.command.getDao().find().get(t.getId());
    T result = command.execute(t);
    Command<T> updateCommand = new Update<T>(this.command.getDao());

    HistoricalData<T> historicalData = new HistoricalData<>(currentData, updateCommand);
    undos.pushHistory(historicalData);

    return result;
  }

  public void deleteRecord(T t) {
    T result = command.execute(t);
    Command<T> createCommand = new Create<>(this.command.getDao());

    HistoricalData<T> historicalData = new HistoricalData<>(t, createCommand);
    undos.pushHistory(historicalData);
  }

  public void undoOperation() {
    if (undos.empty()) {
      resetUndos();
    }

    HistoricalData<T> historicalData = undos.pop();
    T historicalCommandData = historicalData.getT();
    Command<T> historicalCommand = historicalData.getCommand();
    historicalCommand.execute(historicalCommandData);

    redos.push(historicalData);
  }

  public void redoOperation() {
    if (redos.empty()) {
      resetRedos();
    }

    HistoricalData<T> historicalData = redos.pop();
    T commandData = historicalData.getT();
    Command<T> command = historicalData.getCommand();
    command.execute(commandData);

    undos.push(historicalData);
  }

  private void resetUndos() {
    undos.pushHistory(new HistoricalData<T>(null, noCommand));
  }

  private void resetRedos() {
    redos.pushHistory(new HistoricalData<T>(null, noCommand));
  }
}
