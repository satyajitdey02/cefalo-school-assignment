package cefalo.school.dp.builder.pattern.assignment.builder;

import cefalo.school.dp.builder.pattern.assignment.component.complex.Storey;

/**
 * Created by satyajit on 11/1/16.
 */
public abstract class StoreyBuilder {

  protected Storey.Builder builder;
  protected RoomBuilder roomBuilder;

  public Storey getStorey() {
    return builder.build();
  }

  public void setRoomBuilder(RoomBuilder roomBuilder) {
    this.roomBuilder = roomBuilder;
  }

  public abstract void buildNewStorey();

  public abstract void buildStairs();

  public abstract void buildRooms();

  public abstract void buildCorridor();

  public abstract void buildBalconies();
}
