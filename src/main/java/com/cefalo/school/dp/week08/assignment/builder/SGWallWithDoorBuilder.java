package com.cefalo.school.dp.week08.assignment.builder;

import com.cefalo.school.dp.week08.assignment.component.basic.Door;
import com.cefalo.school.dp.week08.assignment.component.basic.Wall;
import com.cefalo.school.dp.week08.assignment.component.measurement.Dimensions;

/**
 * Created by satyajit on 11/10/16.
 */
public class SGWallWithDoorBuilder extends WallBuilder {

  @Override
  public void buildNewWall() {
    builder = new Wall.Builder("Steel+Glass", new Dimensions(8.0, 1.0, 8.0), "Steel+Glass");
  }

  @Override
  public void buildWindow() {

  }

  @Override
  public void buildDoor() {
    builder.door(new Door("Glass", new Dimensions(0.0,4.0, 8.0), "Glass"));

  }
}