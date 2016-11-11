package com.cefalo.school.dp.week12.assignment.entity;

/**
 * Created by satyajit on 11/11/16.
 */
public class Entity {

  private int id;
  private String value;

  public Entity(String value) {
    this.value = value;
  }

  private Entity(int id, String value) {
    this.id = id;
    this.value = value;
  }

  public Entity(Entity entity) {
    this(entity.getId(), entity.getValue());
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }

    return this.id == ((Entity) obj).getId();
  }
}
