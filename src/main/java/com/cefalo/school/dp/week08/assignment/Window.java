package com.cefalo.school.dp.week08.assignment;

/**
 * Created by satyajit on 10/30/16.
 */
public class Window {
private String type;
  private String materials;

  public Window(String type, String materials) {
    this.type = type;
    this.materials = materials;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getMaterials() {
    return materials;
  }

  public void setMaterials(String materials) {
    this.materials = materials;
  }

  @Override
  public String toString() {
    return String.format("%s made %s window.");
  }
}
