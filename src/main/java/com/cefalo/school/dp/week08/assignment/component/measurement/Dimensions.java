package com.cefalo.school.dp.week08.assignment.component.measurement;

/**
 * Created by satyajit on 10/31/16.
 */
public class Dimensions {
  private float length;
  private float width;
  private float height;

  public Dimensions(float length, float width, float height) {
    this.length = length;
    this.width = width;
    this.height = height;
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

  public float getHeight() {
    return height;
  }

  public void setHeight(float height) {
    this.height = height;
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
