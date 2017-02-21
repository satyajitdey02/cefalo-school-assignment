package com.cefalo.school.dp.builder.pattern.assignment.builder;

import com.cefalo.school.dp.builder.pattern.assignment.component.basic.Wall;
import com.cefalo.school.dp.builder.pattern.assignment.component.measurement.Dimensions;

/**
 * Created by satyajit on 11/7/16.
 * * Concrete and Brick Builder
 */
public class CBWallBuilder extends WallBuilder {

  @Override
  public void buildNewWall() {
    builder = new Wall.Builder("Concrete+Brick", new Dimensions(8.0, 1.0, 8.0), "Concrete+Brick");
  }

  @Override
  public void buildWindow() {

  }

  @Override
  public void buildDoor() {

  }
}
