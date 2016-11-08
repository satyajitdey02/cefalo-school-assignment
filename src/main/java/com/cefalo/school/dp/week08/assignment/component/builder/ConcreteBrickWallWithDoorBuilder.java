package com.cefalo.school.dp.week08.assignment.component.builder;

import com.cefalo.school.dp.week08.assignment.component.basic.Door;
import com.cefalo.school.dp.week08.assignment.component.basic.Wall;
import com.cefalo.school.dp.week08.assignment.component.basic.Window;
import com.cefalo.school.dp.week08.assignment.component.measurement.Dimensions;

/**
 * Created by satyajit on 11/7/16.
 */
public class ConcreteBrickWallWithDoorBuilder extends WallBuilder {

  @Override
  public void buildNewWall() {
    wall = new Wall("Concrete+Brick", new Dimensions(8.0, 1.0, 8.0), "Concrete+Brick");
  }

  @Override
  public void buildWindow() {

  }

  @Override
  public void buildDoor() {
    this.wall.getDoors().add(new Door("Wood",
        new Dimensions(0.0,4.0, 8.0), "Wood"));
  }
}
