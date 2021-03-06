package cefalo.school.dp.builder.pattern.assignment.builder;

import cefalo.school.dp.builder.pattern.assignment.component.basic.Corridor;
import cefalo.school.dp.builder.pattern.assignment.component.basic.Floor;
import cefalo.school.dp.builder.pattern.assignment.component.basic.Handrails;
import cefalo.school.dp.builder.pattern.assignment.component.basic.Stairs;
import cefalo.school.dp.builder.pattern.assignment.component.complex.Balcony;
import cefalo.school.dp.builder.pattern.assignment.component.complex.Storey;
import cefalo.school.dp.builder.pattern.assignment.component.measurement.Dimensions;
import cefalo.school.dp.builder.pattern.assignment.director.RoomBuilderDirector;

/**
 * Created by satyajit on 11/10/16.
 * Steel and Glass Builder
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
