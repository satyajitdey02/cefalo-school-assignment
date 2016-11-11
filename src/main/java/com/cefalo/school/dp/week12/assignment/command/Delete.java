package com.cefalo.school.dp.week12.assignment.command;

import com.cefalo.school.dp.week12.assignment.entity.Entity;
import com.cefalo.school.dp.week12.assignment.receiver.DAO;

import java.util.Map;

/**
 * Created by satyajit on 11/11/2016.
 */
public class Delete<T extends Entity> extends Command<T> {

  public Delete(DAO<T> dao) {
    this.dao = dao;
  }

  @Override
  public T execute(T t) {
    dao.remove(t);
    return null;
  }

  @Override
  public Map<Integer, T> read() {
    throw new UnsupportedOperationException("Read is not supported from DELETE command.");
  }

  @Override
  public void undo(T t) {
    dao.save(t);
  }

  @Override
  public void redo(T t) {
    execute(t);
  }
}
