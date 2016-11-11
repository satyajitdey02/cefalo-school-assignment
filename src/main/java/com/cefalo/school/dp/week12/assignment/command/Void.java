package com.cefalo.school.dp.week12.assignment.command;

import com.cefalo.school.dp.week12.assignment.entity.Entity;

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
    throw new UnsupportedOperationException("Undo is not supported from NO command.");
  }

  @Override
  public void redo(T t) {
    throw new UnsupportedOperationException("Redo is not supported from NO command.");
  }
}
