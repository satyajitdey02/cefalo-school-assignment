package com.cefalo.school.dp.week08.assignment.director;

import com.cefalo.school.dp.week08.assignment.builder.WallBuilder;
import com.cefalo.school.dp.week08.assignment.component.basic.Wall;

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
