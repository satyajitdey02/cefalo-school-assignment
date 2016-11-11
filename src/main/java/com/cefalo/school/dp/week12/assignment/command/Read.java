package com.cefalo.school.dp.week12.assignment.command;

import com.cefalo.school.dp.week12.assignment.entity.Entity;
import com.cefalo.school.dp.week12.assignment.receiver.DAO;

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
}
