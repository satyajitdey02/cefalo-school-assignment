package com.cefalo.school.dp.week08.assignment.component.builder;

import com.cefalo.school.dp.week08.assignment.component.basic.Corridor;
import com.cefalo.school.dp.week08.assignment.component.basic.Floor;
import com.cefalo.school.dp.week08.assignment.component.basic.Handrails;
import com.cefalo.school.dp.week08.assignment.component.basic.Stairs;
import com.cefalo.school.dp.week08.assignment.component.complex.Balcony;
import com.cefalo.school.dp.week08.assignment.component.director.RoomBuilderDirector;
import com.cefalo.school.dp.week08.assignment.component.measurement.Dimensions;

/**
 * Created by satyajit on 11/1/16.
 */
public class ConcreteBrickStoreyBuilder extends StoreyBuilder {
  @Override
  public void buildStairs() {
    storey.setStairs(new Stairs.Builder("Quarter Shaped", new Dimensions(50.0, 20.0, 1.5), "Concrete+Brick")
        .external(true).handrails(new Handrails("Wooden", new Dimensions(100.0, 0.0, 4.0), "Wood")).build());
  }

  @Override
  public void buildRooms() {
    RoomBuilderDirector roomBuilderDirector = new RoomBuilderDirector();

    RoomBuilder roomBuilder = new ConcreteBrickLivingRoomBuilder();
    roomBuilderDirector.setRoomBuilder(roomBuilder);
    roomBuilderDirector.constructRoom();
    storey.getRooms().add(roomBuilder.getRoom());

    roomBuilder = new ConcreteBrickDrawingRoomBuilder();
    roomBuilderDirector.setRoomBuilder(roomBuilder);
    roomBuilderDirector.constructRoom();
    storey.getRooms().add(roomBuilder.getRoom());

    roomBuilder = new ConcreteBrickDiningRoomBuilder();
    roomBuilderDirector.setRoomBuilder(roomBuilder);
    roomBuilderDirector.constructRoom();
    storey.getRooms().add(roomBuilder.getRoom());

    roomBuilder = new ConcreteBrickBathRoomBuilder();
    roomBuilderDirector.setRoomBuilder(roomBuilder);
    roomBuilderDirector.constructRoom();
    storey.getRooms().add(roomBuilder.getRoom());
  }

  @Override
  public void buildCorridor() {
    storey.setCorridor(new Corridor("Concrete+Brick", new Dimensions(12.0, 4.0, 0.0), "Concrete+Brick"));
  }

  @Override
  public void buildBalconies() {
    storey.getBalconies().add(new Balcony(new Floor("Concrete+Brick",
        new Dimensions(8.0, 3.0, 4.0), "Concrete+Brick"),
        new Handrails("Wooden", new Dimensions(12.0, 0.0, 4.0), "Wood")));
  }
}
