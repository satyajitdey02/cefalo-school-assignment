package com.cefalo.school.dp.week08.assignment.component.complex;

import com.cefalo.school.dp.week08.assignment.component.basic.Ceiling;
import com.cefalo.school.dp.week08.assignment.component.basic.Floor;
import com.cefalo.school.dp.week08.assignment.component.basic.Wall;

import java.util.List;

/**
 * Created by satyajit on 10/31/16.
 */
public class DiningRoom extends Room {

  private String basin;
  private String burner;

  public DiningRoom(Floor floor, Ceiling ceiling, List<Wall> walls, String basin, String burner) {
    super(floor, ceiling, walls);
    this.basin = basin;
    this.burner = burner;
  }

  public String getBasin() {
    return basin;
  }

  public void setBasin(String basin) {
    this.basin = basin;
  }

  public String getBurner() {
    return burner;
  }

  public void setBurner(String burner) {
    this.burner = burner;
  }

  @Override
  public Room build() {
    return null;
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
