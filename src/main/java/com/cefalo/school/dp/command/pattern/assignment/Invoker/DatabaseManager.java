package com.cefalo.school.dp.command.pattern.assignment.Invoker;

import com.cefalo.school.dp.command.pattern.assignment.command.Command;
import com.cefalo.school.dp.command.pattern.assignment.command.Void;
import com.cefalo.school.dp.command.pattern.assignment.entity.Entity;
import com.cefalo.school.dp.command.pattern.assignment.history.HistoricalData;
import com.cefalo.school.dp.command.pattern.assignment.history.History;

import java.util.Map;

/**
 * Created by satyajit on 11/11/2016.
 */
public class DatabaseManager<T extends Entity> {

  private T t;
  private Command<T> command;
  private Command<T> noCommand = new Void<T>();

  private final History<T> undos = new History<T>();
  private final History<T> redos = new History<T>();

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
    HistoricalData<T> historicalData = new HistoricalData<>(result, command);
    undos.pushHistory(historicalData);

    return result;
  }

  public Map<Integer, T> readRecords() {
    return command.read();
  }

  public T updateRecord(T t) {
    T currentData = this.command.getDao().find().get(t.getId());
    T result = command.execute(t);

    HistoricalData<T> historicalData = new HistoricalData<>(currentData, this.command);
    undos.pushHistory(historicalData);

    return result;
  }

  public void deleteRecord(T t) {
    T result = command.execute(t);
    HistoricalData<T> historicalData = new HistoricalData<>(t, command);
    undos.pushHistory(historicalData);
  }

  public void undoOperation() {
    HistoricalData<T> historicalData = undos.pop();
    if (historicalData == null) {
      return;
    }

    T historicalCommandData = historicalData.getT();
    if(historicalCommandData == null) {
      return;
    }

    Command<T> historicalCommand = historicalData.getCommand();
    if(historicalData.getCommand() == null) {
      return;
    }

    T currentData = this.command.getDao().find().get(historicalCommandData.getId());
    historicalCommand.undo(historicalCommandData);

    historicalData.setT(currentData);
    redos.pushHistory(historicalData);
  }

  public void redoOperation() {
    HistoricalData<T> historicalData = redos.pop();
    if (historicalData == null) {
      return;
    }

    T historicalCommandData = historicalData.getT();
    if(historicalCommandData == null) {
      return;
    }

    Command<T> historicalCommand = historicalData.getCommand();
    if(historicalData.getCommand() == null) {
      return;
    }

    T currentData = this.command.getDao().find().get(historicalCommandData.getId());
    historicalCommand.redo(historicalCommandData);

    historicalData.setT(currentData);
    undos.pushHistory(historicalData);
  }

  private void resetUndos() {
    undos.pushHistory(new HistoricalData<T>(null, noCommand));
  }

  private void resetRedos() {
    redos.pushHistory(new HistoricalData<T>(null, noCommand));
  }
}
