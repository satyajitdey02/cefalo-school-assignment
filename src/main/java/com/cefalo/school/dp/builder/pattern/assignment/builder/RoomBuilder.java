package com.cefalo.school.dp.builder.pattern.assignment.builder;

import com.cefalo.school.dp.builder.pattern.assignment.component.complex.Room;

/**
 * Created by satyajit on 11/1/16.
 */
public abstract class RoomBuilder {

  protected  Room.Builder builder;
  protected WallBuilder wallBuilder;

  public Room getRoom() {
    return builder.build();
  }

  public void setWallBuilder(WallBuilder wallBuilder) {
    this.wallBuilder = wallBuilder;
  }

  public abstract void buildFloor();

  public abstract void buildColumns();

  public abstract void buildWalls();

  public abstract void buildCeiling();

  public void buildRoomSpecificSetup() {

  }
}
