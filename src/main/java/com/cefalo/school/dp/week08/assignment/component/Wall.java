package com.cefalo.school.dp.week08.assignment.component;

import com.cefalo.school.dp.week08.assignment.Window;

/**
 * Created by satyajit on 10/30/16.
 */
public class Wall {
  private String type;
  private Dimensions dimensions;
  private String materials;

  /*Optional Fields*/
  private Window window;
  private Door door;

  public Wall(String type, String materials) {
    this.type = type;
    this.materials = materials;
  }

  public String getMaterials() {
    return materials;
  }

  public void setMaterials(String materials) {
    this.materials = materials;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Dimensions getDimensions() {
    return dimensions;
  }

  public void setDimensions(Dimensions dimensions) {
    this.dimensions = dimensions;
  }

  public Window getWindow() {
    return window;
  }

  public void setWindow(Window window) {
    this.window = window;
  }

  public Door getDoor() {
    return door;
  }

  public void setDoor(Door door) {
    this.door = door;
  }

  @Override
  public String toString() {
    return String.format("%s made %s wall. Doors: %s, Window: %s",
        this.materials, this.type, this.door.toString(), this.window.toString());
  }
}
