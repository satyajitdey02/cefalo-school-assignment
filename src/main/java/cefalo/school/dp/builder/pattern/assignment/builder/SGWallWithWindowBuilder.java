package cefalo.school.dp.builder.pattern.assignment.builder;

import cefalo.school.dp.builder.pattern.assignment.component.basic.Wall;
import cefalo.school.dp.builder.pattern.assignment.component.basic.Window;
import cefalo.school.dp.builder.pattern.assignment.component.measurement.Dimensions;

/**
 * Created by satyajit on 11/10/16.
 * Steel and Glass Builder
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