package com.cefalo.school.dp.week12.assignment.command;

import com.cefalo.school.dp.week12.assignment.entity.Entity;
import com.cefalo.school.dp.week12.assignment.receiver.DAO;

import java.util.Map;

/**
 * Created by satyajit on 11/11/2016.
 */
public abstract class Command<T extends Entity> {

  protected DAO<T> dao;

  public abstract T execute(T t);

  public abstract Map<Integer, T> read();

  public DAO<T> getDao() {
    return dao;
  }
}
