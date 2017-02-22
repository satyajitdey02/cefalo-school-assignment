package cefalo.school.dp.command.pattern.assignment.command;

import cefalo.school.dp.command.pattern.assignment.entity.Entity;
import cefalo.school.dp.command.pattern.assignment.receiver.DAO;

import java.util.Map;

/**
 * Created by satyajit on 11/11/2016.
 */
public class Read<T extends Entity> extends Command<T> {

  public Read(DAO<T> dao) {
    this.dao = dao;
  }

  @Override
  public T execute(T t) {
    throw new UnsupportedOperationException("Execute is not supported from READ Command.");
  }

  @Override
  public Map<Integer, T> read() {
    return dao.find();
  }

  @Override
  public void undo(T t) {
    throw new UnsupportedOperationException("Undo is not supported from READ Command.");
  }

  @Override
  public void redo(T t) {
    throw new UnsupportedOperationException("Redo is not supported from READ Command.");
  }
}
