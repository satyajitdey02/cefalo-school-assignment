package com.cefalo.school.dp.week12.assignment.receiver;

import com.cefalo.school.dp.week12.assignment.entity.Entity;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by satyajit on 11/11/2016.
 */
public class DAO<T extends Entity> {

  private Map<Integer, T> entities = new HashMap<Integer, T>();

  public T save(T t) {
    t.setId(entities.size() + 1);
    entities.put(t.getId(), t);
    return t;
  }

  public Map<Integer, T> find() {
    return entities;
  }

  public T update(T t) {
    entities.put(t.getId(), t);
    return t;
  }

  public void remove(T t) {
    entities.remove(t.getId());
  }
}
