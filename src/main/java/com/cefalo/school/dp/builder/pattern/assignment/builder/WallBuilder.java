package com.cefalo.school.dp.builder.pattern.assignment.builder;

import com.cefalo.school.dp.builder.pattern.assignment.component.basic.Wall;

/**
 * Created by satyajit on 11/3/16.
 */
public abstract class WallBuilder {

  protected Wall.Builder builder;

  public Wall getWall() {
    return builder.build();
  }

  public abstract void buildNewWall();

  public abstract void buildWindow();

  public abstract void buildDoor();
}
