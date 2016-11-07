package com.cefalo.school.dp.week08.assignment.component.builder;

import com.cefalo.school.dp.week08.assignment.component.basic.Door;
import com.cefalo.school.dp.week08.assignment.component.basic.Window;
import com.cefalo.school.dp.week08.assignment.component.measurement.Dimensions;

/**
 * Created by satyajit on 11/7/16.
 */
public class ConcreteBrickWallWithDoorWindowBuilder extends WallBuilder {
  @Override
  public void buildWindow() {
    this.wall.getWindows().add(new Window("Glass+Steel",
        new Dimensions(0.0,4.0, 4.0), "Glass+Steel"));
  }

  @Override
  public void buildDoor() {
    this.wall.getDoors().add(new Door("Wood",
        new Dimensions(0.0,4.0, 8.0), "Wood"));
  }
}
