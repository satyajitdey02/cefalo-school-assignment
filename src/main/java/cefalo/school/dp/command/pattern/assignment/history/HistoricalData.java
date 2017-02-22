package cefalo.school.dp.command.pattern.assignment.history;

import cefalo.school.dp.command.pattern.assignment.entity.Entity;
import cefalo.school.dp.command.pattern.assignment.command.Command;

/**
 * Created by satyajit on 11/12/16.
 */
public class HistoricalData<T extends Entity> {

  private T t;
  private Command<T> command;

  public HistoricalData(T t, Command<T> command) {
    this.t = t;
    this.command = command;
  }

  public T getT() {
    return t;
  }

  public void setT(T t) {
    this.t = t;
  }

  public Command<T> getCommand() {
    return command;
  }

  public void setCommand(Command<T> command) {
    this.command = command;
  }
}
