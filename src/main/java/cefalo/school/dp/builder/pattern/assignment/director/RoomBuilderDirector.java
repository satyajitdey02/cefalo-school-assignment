package cefalo.school.dp.builder.pattern.assignment.director;

import cefalo.school.dp.builder.pattern.assignment.builder.RoomBuilder;
import cefalo.school.dp.builder.pattern.assignment.component.complex.Room;

/**
 * Created by satyajit on 11/1/16.
 */
public class RoomBuilderDirector {

  private RoomBuilder roomBuilder;

  public void setRoomBuilder(RoomBuilder roomBuilder) {
    this.roomBuilder = roomBuilder;
  }

  public Room getRoom() {
    return roomBuilder.getRoom();
  }

  public void constructRoom() {
    roomBuilder.buildFloor();
    roomBuilder.buildColumns();
    roomBuilder.buildWalls();
    roomBuilder.buildCeiling();
    roomBuilder.buildRoomSpecificSetup();
  }

}
