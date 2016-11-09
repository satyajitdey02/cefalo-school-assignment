package com.cefalo.school.dp.week08.assignment.builder;

import com.cefalo.school.dp.week08.assignment.component.basic.Corridor;
import com.cefalo.school.dp.week08.assignment.component.basic.Floor;
import com.cefalo.school.dp.week08.assignment.component.basic.Handrails;
import com.cefalo.school.dp.week08.assignment.component.basic.Stairs;
import com.cefalo.school.dp.week08.assignment.component.complex.Balcony;
import com.cefalo.school.dp.week08.assignment.component.complex.Storey;
import com.cefalo.school.dp.week08.assignment.component.measurement.Dimensions;
import com.cefalo.school.dp.week08.assignment.director.RoomBuilderDirector;

/**
 * Created by satyajit on 11/10/16.
 */
public class SGStoreyBuilder extends StoreyBuilder{
  @Override
  public void buildNewStorey() {
    builder = new Storey.Builder(1);
  }

  @Override
  public void buildStairs() {
    builder.stairs(new Stairs.Builder("Quarter Shaped", new Dimensions(50.0, 20.0, 1.5), "Concrete+Brick+Steel")
        .external(true).handrails(new Handrails("Steel", new Dimensions(100.0, 0.0, 4.0), "Steel")).build());
  }

  @Override
  public void buildRooms() {
    RoomBuilderDirector roomBuilderDirector = new RoomBuilderDirector();

    RoomBuilder roomBuilder = new SGLivingRoomBuilder();
    roomBuilderDirector.setRoomBuilder(roomBuilder);
    roomBuilderDirector.constructRoom();
    builder.room(roomBuilder.getRoom());

    roomBuilder = new SGDrawingRoomBuilder();
    roomBuilderDirector.setRoomBuilder(roomBuilder);
    roomBuilderDirector.constructRoom();
    builder.room(roomBuilder.getRoom());

    roomBuilder = new SGDiningRoomBuilder();
    roomBuilderDirector.setRoomBuilder(roomBuilder);
    roomBuilderDirector.constructRoom();
    builder.room(roomBuilder.getRoom());

    roomBuilder = new SGBathRoomBuilder();
    roomBuilderDirector.setRoomBuilder(roomBuilder);
    roomBuilderDirector.constructRoom();
    builder.room(roomBuilder.getRoom());
  }

  @Override
  public void buildCorridor() {
    builder.corridor(new Corridor("Concrete+Brick+Steel", new Dimensions(12.0, 4.0, 0.0), "Concrete+Brick+Steel"));
  }

  @Override
  public void buildBalconies() {
    builder.balcony(new Balcony(new Floor("Glass+Steel",
        new Dimensions(8.0, 3.0, 4.0), "Glass+Steel"),
        new Handrails("Steel", new Dimensions(12.0, 0.0, 4.0), "Steel")));
  }
}
