package cefalo.school.dp.command.pattern.assignment.command;

import cefalo.school.dp.command.pattern.assignment.entity.Entity;
import cefalo.school.dp.command.pattern.assignment.receiver.DAO;

import java.util.Map;

/**
 * Created by satyajit on 11/11/2016.
 */
public class Create<T extends Entity> extends Command<T> {

  public Create(DAO<T> dao) {
    this.dao = dao;
  }

  @Override
  public T execute(T t) {
    return dao.save(t);
  }

  @Override
  public Map<Integer, T> read() {
    throw new UnsupportedOperationException("Read is not supported from CREATE command.");
  }

  @Override
  public void undo(T t) {
    dao.remove(t);
  }

  @Override
  public void redo(T t) {
    execute(t);
  }
}
