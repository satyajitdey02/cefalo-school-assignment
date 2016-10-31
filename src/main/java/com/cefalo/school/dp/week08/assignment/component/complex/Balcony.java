package com.cefalo.school.dp.week08.assignment.component.complex;

import com.cefalo.school.dp.week08.assignment.component.basic.Floor;

/**
 * Created by satyajit on 10/31/16.
 */
public class Balcony {

  private Floor floor;
  private String handrails;

  public Balcony(Floor floor, String handrails) {
    this.floor = floor;
    this.handrails = handrails;
  }

  public Floor getFloor() {
    return floor;
  }

  public void setFloor(Floor floor) {
    this.floor = floor;
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
