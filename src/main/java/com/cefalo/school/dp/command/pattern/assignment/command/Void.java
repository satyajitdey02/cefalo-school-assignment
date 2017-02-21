package com.cefalo.school.dp.command.pattern.assignment.command;

import com.cefalo.school.dp.command.pattern.assignment.entity.Entity;

import java.util.Map;

/**
 * Created by satyajit on 11/11/2016.
 */
public class Void<T extends Entity> extends Command<T> {

  public Void() {
  }

  @Override
  public T execute(T t) {
    throw new UnsupportedOperationException("Execute is not supported from NO Command.");
  }

  @Override
  public Map<Integer, T> read() {
    throw new UnsupportedOperationException("Read is not supported from NO command.");
  }

  @Override
  public void undo(T t) {
    System.out.println("Nothing to Undo.");
  }

  @Override
  public void redo(T t) {
    System.out.println("Nothing to Redo.");
  }
}
