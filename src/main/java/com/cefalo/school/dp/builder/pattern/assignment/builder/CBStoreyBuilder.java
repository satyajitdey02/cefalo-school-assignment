package com.cefalo.school.dp.builder.pattern.assignment.builder;

import com.cefalo.school.dp.builder.pattern.assignment.component.basic.Corridor;
import com.cefalo.school.dp.builder.pattern.assignment.component.basic.Floor;
import com.cefalo.school.dp.builder.pattern.assignment.component.basic.Handrails;
import com.cefalo.school.dp.builder.pattern.assignment.component.basic.Stairs;
import com.cefalo.school.dp.builder.pattern.assignment.component.complex.Balcony;
import com.cefalo.school.dp.builder.pattern.assignment.component.complex.Storey;
import com.cefalo.school.dp.builder.pattern.assignment.component.measurement.Dimensions;
import com.cefalo.school.dp.builder.pattern.assignment.director.RoomBuilderDirector;

/**
 * Created by satyajit on 11/1/16.
 * * Concrete and Brick Builder
 */
public class CBStoreyBuilder extends StoreyBuilder {

  @Override
  public void buildNewStorey() {
    builder = new Storey.Builder(1);
  }

  @Override
  public void buildStairs() {
    builder.stairs(new Stairs.Builder("Quarter Shaped", new Dimensions(50.0, 20.0, 1.5), "Concrete+Brick")
        .external(true).handrails(new Handrails("Wooden", new Dimensions(100.0, 0.0, 4.0), "Wood")).build());
  }

  @Override
  public void buildRooms() {
    RoomBuilderDirector roomBuilderDirector = new RoomBuilderDirector();

    RoomBuilder roomBuilder = new CBLivingRoomBuilder();
    roomBuilderDirector.setRoomBuilder(roomBuilder);
    roomBuilderDirector.constructRoom();
    builder.room(roomBuilder.getRoom());

    roomBuilder = new CBDrawingRoomBuilder();
    roomBuilderDirector.setRoomBuilder(roomBuilder);
    roomBuilderDirector.constructRoom();
    builder.room(roomBuilder.getRoom());

    roomBuilder = new CBDiningRoomBuilder();
    roomBuilderDirector.setRoomBuilder(roomBuilder);
    roomBuilderDirector.constructRoom();
    builder.room(roomBuilder.getRoom());

    roomBuilder = new CBBathRoomBuilder();
    roomBuilderDirector.setRoomBuilder(roomBuilder);
    roomBuilderDirector.constructRoom();
    builder.room(roomBuilder.getRoom());
  }

  @Override
  public void buildCorridor() {
    builder.corridor(new Corridor("Concrete+Brick", new Dimensions(12.0, 4.0, 0.0), "Concrete+Brick"));
  }

  @Override
  public void buildBalconies() {
    builder.balcony(new Balcony(new Floor("Concrete+Brick",
        new Dimensions(8.0, 3.0, 4.0), "Concrete+Brick"),
        new Handrails("Wooden", new Dimensions(12.0, 0.0, 4.0), "Wood")));
  }
}
