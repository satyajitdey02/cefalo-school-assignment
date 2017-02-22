package cefalo.school.dp.builder.pattern.assignment.director;

import cefalo.school.dp.builder.pattern.assignment.builder.WallBuilder;
import cefalo.school.dp.builder.pattern.assignment.component.basic.Wall;

/**
 * Created by satyajit on 11/8/16.
 */
public class WallBuilderDirector {
  private WallBuilder wallBuilder;

  public void setWallBuilder(WallBuilder wallBuilder) {
    this.wallBuilder = wallBuilder;
  }

  public Wall getWall() {
    return wallBuilder.getWall();
  }

  public void constructWall() {
    wallBuilder.buildNewWall();
    wallBuilder.buildDoor();
    wallBuilder.buildWindow();
  }
}
