package com.cefalo.school.dp.week08.assignment.component.builder;

import com.cefalo.school.dp.week08.assignment.component.complex.Storey;

/**
 * Created by satyajit on 11/1/16.
 */
public abstract class StoreyBuilder {

  protected Storey storey;
  protected RoomBuilder roomBuilder;

  public Storey getStorey() {
    return this.storey;
  }

  public void setRoomBuilder(RoomBuilder roomBuilder) {
    this.roomBuilder = roomBuilder;
  }

  public void buildNewStorey() {
    this.storey = new Storey();
  }

  public abstract void buildStairs();

  public abstract void buildRooms();

  public abstract void buildCorridor();

  public abstract void buildBalconies();
}
