package com.cefalo.school.dp.week12.assignment.receiver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by satyajit on 11/11/2016.
 */
public class DAO {

  protected List<Entity> entities = new ArrayList<Entity>();

  public Entity save(Entity entity) {
    entity.setId(entities.size() + 1);
    entities.add(entity);

    return entity;
  }

  public List<Entity> find() {
    return entities;
  }

  public Entity update(Entity entity) {
    return save(entity);
  }

  public void remove(Entity entity) {
    entities.remove(entity);
  }
}
