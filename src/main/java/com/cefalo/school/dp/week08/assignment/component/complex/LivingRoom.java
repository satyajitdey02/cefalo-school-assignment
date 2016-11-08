package com.cefalo.school.dp.week08.assignment.component.complex;

import com.cefalo.school.dp.week08.assignment.component.basic.Ceiling;
import com.cefalo.school.dp.week08.assignment.component.basic.Floor;
import com.cefalo.school.dp.week08.assignment.component.basic.Wall;

import java.util.List;

/**
 * Created by satyajit on 10/31/2016.
 */
public class LivingRoom extends Room {

  public LivingRoom() {
  }

  public LivingRoom(Floor floor, Ceiling ceiling, List<Wall> walls, String firePlace) {
    super(floor, ceiling, walls);
  }

  @Override
  public void details() {
    getFloor().details();
    getCeiling().details();

    for(Wall wall : getWalls()) {
      wall.details();
    }
  }
}
