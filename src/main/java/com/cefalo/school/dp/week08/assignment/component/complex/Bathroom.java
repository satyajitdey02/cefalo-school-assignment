package com.cefalo.school.dp.week08.assignment.component.complex;

import com.cefalo.school.dp.week08.assignment.component.Component;
import com.cefalo.school.dp.week08.assignment.component.basic.Ceiling;
import com.cefalo.school.dp.week08.assignment.component.basic.Floor;
import com.cefalo.school.dp.week08.assignment.component.basic.Wall;

import java.util.List;

/**
 * Created by satyajit on 10/31/16.
 */
public class BathRoom extends Room {

  private String shower;
  private String bathtub;

  public BathRoom(Floor floor, Ceiling ceiling, List<Wall> walls, String shower, String bathtub) {
    super(floor, ceiling, walls);
    this.shower = shower;
    this.bathtub = bathtub;
  }

  public String getShower() {
    return shower;
  }

  public void setShower(String shower) {
    this.shower = shower;
  }

  public String getBathtub() {
    return bathtub;
  }

  public void setBathtub(String bathtub) {
    this.bathtub = bathtub;
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
