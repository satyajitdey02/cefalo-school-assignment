package com.cefalo.school.dp.week08.assignment.component;

/**
 * Created by satyajit on 10/30/16.
 */
public class Floor {
  private float length;
  private float width;
  private String materials;

  public Floor(float length, float width, String materials) {
    this.length = length;
    this.width = width;
    this.materials = materials;
  }

  public String getMaterials() {
    return materials;
  }

  public void setMaterials(String materials) {
    this.materials = materials;
  }

  public float getLength() {
    return length;
  }

  public void setLength(float length) {
    this.length = length;
  }

  public float getWidth() {
    return width;
  }

  public void setWidth(float width) {
    this.width = width;
  }

  @Override
  public String toString() {
    return String.format("%s made floor.", this.materials);
  }
}
