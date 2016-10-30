package com.cefalo.school.dp.week08.assignment.component;

/**
 * Created by satyajit on 10/31/16.
 */
public abstract class Component {
  protected String type;
  protected Dimensions dimensions;
  protected String materials;

  public Component(String type, Dimensions dimensions, String materials) {
    this.type = type;
    this.dimensions = dimensions;
    this.materials = materials;
  }

  public abstract Component build();
}
