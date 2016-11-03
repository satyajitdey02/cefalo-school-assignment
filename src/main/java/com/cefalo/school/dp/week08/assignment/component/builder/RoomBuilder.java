package com.cefalo.school.dp.week08.assignment.component.builder;

import com.cefalo.school.dp.week08.assignment.component.complex.Room;

/**
 * Created by satyajit on 11/1/16.
 */
public abstract class RoomBuilder {

  protected Room room;

  public Room getRoom() {
    return this.room;
  }

  /*For the dynamic binding of the room-Living room, Dining room etc.*/
  public void setRoom(Room room) {
    this.room = room;
  }

  public abstract void buildFloor();

  public abstract void buildColumns();

  public abstract void buildWalls();

  public abstract void buildCeiling();
}
