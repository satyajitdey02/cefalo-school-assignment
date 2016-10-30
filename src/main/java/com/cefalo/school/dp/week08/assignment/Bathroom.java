package com.cefalo.school.dp.week08.assignment;

import com.cefalo.school.dp.week08.assignment.component.Ceiling;
import com.cefalo.school.dp.week08.assignment.component.Floor;
import com.cefalo.school.dp.week08.assignment.component.Wall;

import java.util.List;

/**
 * Created by satyajit on 10/31/16.
 */
public class Bathroom extends Room {
  private String shower;
  private String bathtub;

  public Bathroom(Floor floor, Ceiling ceiling, List<Wall> walls, String shower, String bathtub) {
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
}
