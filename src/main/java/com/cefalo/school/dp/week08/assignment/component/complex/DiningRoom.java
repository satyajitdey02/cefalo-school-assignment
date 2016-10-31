package com.cefalo.school.dp.week08.assignment.component.complex;

import com.cefalo.school.dp.week08.assignment.component.Component;
import com.cefalo.school.dp.week08.assignment.component.basic.Ceiling;
import com.cefalo.school.dp.week08.assignment.component.basic.Floor;
import com.cefalo.school.dp.week08.assignment.component.basic.Wall;

import java.util.List;

/**
 * Created by satyajit on 10/31/16.
 */
public class DiningRoom extends Room {

  private String cabinet;

  public DiningRoom(Floor floor, Ceiling ceiling, List<Wall> walls, String cabinet) {
    super(floor, ceiling, walls);
    this.cabinet = cabinet;
  }

  public String getCabinet() {
    return cabinet;
  }

  public void setCabinet(String cabinet) {
    this.cabinet = cabinet;
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
