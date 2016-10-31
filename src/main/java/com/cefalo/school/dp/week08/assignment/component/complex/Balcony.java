package com.cefalo.school.dp.week08.assignment.component.complex;

import com.cefalo.school.dp.week08.assignment.component.Buildable;
import com.cefalo.school.dp.week08.assignment.component.Component;
import com.cefalo.school.dp.week08.assignment.component.basic.Floor;
import com.cefalo.school.dp.week08.assignment.component.basic.Handrails;

/**
 * Created by satyajit on 10/31/16.
 */
public class Balcony implements Buildable{

  private Floor floor;
  private Handrails handrails;

  public Balcony(Floor floor, Handrails handrails) {
    this.floor = floor;
    this.handrails = handrails;
  }

  public Floor getFloor() {
    return floor;
  }

  public void setFloor(Floor floor) {
    this.floor = floor;
  }

  public Handrails getHandrails() {
    return handrails;
  }

  public void setHandrails(Handrails handrails) {
    this.handrails = handrails;
  }

  @Override
  public Component build() {
    return null;
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
