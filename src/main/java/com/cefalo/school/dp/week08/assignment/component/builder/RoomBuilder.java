package com.cefalo.school.dp.week08.assignment.component.builder;

import com.cefalo.school.dp.week08.assignment.component.basic.Wall;
import com.cefalo.school.dp.week08.assignment.component.complex.Room;

/**
 * Created by satyajit on 11/1/16.
 */
public abstract class RoomBuilder {

  protected Room room;
  protected WallBuilder wallBuilder;

  public Room getRoom() {
    return this.room;
  }

  public void setWallBuilder(WallBuilder wallBuilder) {
    this.wallBuilder = wallBuilder;
  }

  public abstract void buildFloor();

  public abstract void buildColumns();

  public abstract void buildWalls();

  public abstract void buildCeiling();

  public void buildRoomSpecificSetup() {
    System.out.println("Typical Room.");
  }
}
