package com.cefalo.school.dp.command.pattern.assignment.command;

import com.cefalo.school.dp.command.pattern.assignment.entity.Entity;
import com.cefalo.school.dp.command.pattern.assignment.receiver.DAO;

import java.util.Map;

/**
 * Created by satyajit on 11/11/2016.
 */
public class Update<T extends Entity> extends Command<T> {

  public Update(DAO dao) {
    this.dao = dao;
  }

  @Override
  public T execute(T t) {
    return dao.update(t);
  }

  @Override
  public Map<Integer, T> read() {
    throw new UnsupportedOperationException("Read is not supported from UPDATE command.");
  }

  @Override
  public void undo(T t) {
    execute(t);
  }

  @Override
  public void redo(T t) {
    execute(t);
  }
}
