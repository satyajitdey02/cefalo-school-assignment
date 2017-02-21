package com.cefalo.school.dp.builder.pattern.assignment.builder;

import com.cefalo.school.dp.builder.pattern.assignment.component.basic.Wall;
import com.cefalo.school.dp.builder.pattern.assignment.component.measurement.Dimensions;

/**
 * Created by satyajit on 11/10/16.
 * Steel and Glass Builder
 */
public class SGWallBuilder extends WallBuilder {

  @Override
  public void buildNewWall() {
    builder = new Wall.Builder("Steel+Glass", new Dimensions(8.0, 1.0, 8.0), "Steel+Glass");
  }

  @Override
  public void buildWindow() {

  }

  @Override
  public void buildDoor() {

  }
}