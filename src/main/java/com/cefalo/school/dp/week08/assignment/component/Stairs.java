package com.cefalo.school.dp.week08.assignment.component;

/**
 * Created by satyajit on 10/31/16.
 */
public class Stairs {
  private String type;
  private Dimensions dimensions;
  private String materials;

  /*Optional Fields*/
  private boolean external = true;
  private String handrails;

  public Stairs(String type, String materials, String handrails) {
    this.type = type;
    this.materials = materials;
    this.handrails = handrails;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public boolean isExternal() {
    return external;
  }

  public void setExternal(boolean external) {
    this.external = external;
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

  public String getHandrails() {
    return handrails;
  }

  public void setHandrails(String handrails) {
    this.handrails = handrails;
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
