package com.cefalo.school.dp.week08.assignment.component;

/**
 * Created by satyajit on 10/31/16.
 */
public class Handrails {
  private String type;
  private Dimensions dimensions;
  private String materials;

  public Handrails(String type, Dimensions dimensions, String materials) {
    this.type = type;
    this.dimensions = dimensions;
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

  public String getMaterials() {
    return materials;
  }

  public void setMaterials(String materials) {
    this.materials = materials;
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
