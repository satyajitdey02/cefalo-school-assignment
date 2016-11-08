package com.cefalo.school.dp.week08.assignment.component.builder;

import com.cefalo.school.dp.week08.assignment.component.basic.Wall;

/**
 * Created by satyajit on 11/3/16.
 */
public abstract class WallBuilder {

  protected Wall wall;

  public Wall getWall() {
    return wall;
  }

  public abstract void buildNewWall();

  public abstract void buildWindow();

  public abstract void buildDoor();
}
