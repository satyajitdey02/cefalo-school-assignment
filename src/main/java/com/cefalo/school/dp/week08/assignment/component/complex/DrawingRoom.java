package com.cefalo.school.dp.week08.assignment.component.complex;

import com.cefalo.school.dp.week08.assignment.component.Component;
import com.cefalo.school.dp.week08.assignment.component.basic.Ceiling;
import com.cefalo.school.dp.week08.assignment.component.basic.Floor;
import com.cefalo.school.dp.week08.assignment.component.basic.Wall;

import java.util.List;

/**
 * Created by satyajit on 10/31/2016.
 */
public class DrawingRoom extends Room {

  private String firePlace;

  public DrawingRoom() {

  }

  public DrawingRoom(Floor floor, Ceiling ceiling, List<Wall> walls, String firePlace) {
    super(floor, ceiling, walls);
    this.firePlace = firePlace;
  }

  public String getFirePlace() {
    return firePlace;
  }

  public void setFirePlace(String firePlace) {
    this.firePlace = firePlace;
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
