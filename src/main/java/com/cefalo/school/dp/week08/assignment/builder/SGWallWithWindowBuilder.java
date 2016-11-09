package com.cefalo.school.dp.week08.assignment.builder;

import com.cefalo.school.dp.week08.assignment.component.basic.Wall;
import com.cefalo.school.dp.week08.assignment.component.basic.Window;
import com.cefalo.school.dp.week08.assignment.component.measurement.Dimensions;

/**
 * Created by satyajit on 11/10/16.
 */
public class SGWallWithWindowBuilder extends WallBuilder {

  @Override
  public void buildNewWall() {
    builder = new Wall.Builder("Steel+Glass", new Dimensions(8.0, 1.0, 8.0), "Steel+Glass");
  }

  @Override
  public void buildWindow() {
    builder.window(new Window("Glass", new Dimensions(0.0, 4.0, 4.0), "Glass"));
  }

  @Override
  public void buildDoor() {

  }
}