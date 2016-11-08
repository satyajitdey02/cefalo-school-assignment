package com.cefalo.school.dp.week08.assignment.component.builder;

import com.cefalo.school.dp.week08.assignment.component.basic.Ceiling;
import com.cefalo.school.dp.week08.assignment.component.basic.Column;
import com.cefalo.school.dp.week08.assignment.component.basic.Floor;
import com.cefalo.school.dp.week08.assignment.component.complex.DrawingRoom;
import com.cefalo.school.dp.week08.assignment.component.director.WallBuilderDirector;
import com.cefalo.school.dp.week08.assignment.component.measurement.Dimensions;

/**
 * Created by satyajit on 11/8/16.
 */
public class ConcreteBrickDrawingRoomBuilder extends RoomBuilder {

  public ConcreteBrickDrawingRoomBuilder() {
    this.room = new DrawingRoom();
  }

  @Override
  public void buildFloor() {
    this.room.setFloor(new Floor("Concrete+Brick",
        new Dimensions(20.0, 15.0, 0.0), "Concrete+Brick"));
  }

  @Override
  public void buildColumns() {
    this.room.getColumns().add(new Column("Concrete+Brick",
        new Dimensions(1.5, 1.5, 10.0), "Concrete+Brick"));
    this.room.getColumns().add(new Column("Concrete+Brick",
        new Dimensions(1.5, 1.5, 10.0), "Concrete+Brick"));
    this.room.getColumns().add(new Column("Concrete+Brick",
        new Dimensions(1.5, 1.5, 10.0), "Concrete+Brick"));
    this.room.getColumns().add(new Column("Concrete+Brick",
        new Dimensions(1.5, 1.5, 10.0), "Concrete+Brick"));
  }

  @Override
  public void buildWalls() {
    WallBuilderDirector wallBuilderDirector = new WallBuilderDirector();
    WallBuilder wallBuilder = new ConcreteBrickWallBuilder();
    wallBuilderDirector.setWallBuilder(wallBuilder);

    wallBuilderDirector.constructWall();
    this.room.getWalls().add(wallBuilder.getWall());

    wallBuilderDirector.constructWall();
    this.room.getWalls().add(wallBuilder.getWall());

    wallBuilder = new ConcreteBrickWallWithDoorBuilder();
    wallBuilderDirector.setWallBuilder(wallBuilder);
    wallBuilderDirector.constructWall();
    this.room.getWalls().add(wallBuilder.getWall());


    wallBuilder = new ConcreteBrickWallWithWindowBuilder();
    wallBuilderDirector.setWallBuilder(wallBuilder);
    wallBuilderDirector.constructWall();
    this.room.getWalls().add(wallBuilder.getWall());
  }

  @Override
  public void buildCeiling() {
    this.room.setCeiling(new Ceiling("Concrete+Brick",
        new Dimensions(20.0, 15.0, 0.0), "Concrete+Brick"));
  }

  @Override
  public void buildRoomSpecificSetup() {
    ((DrawingRoom)this.room).setFirePlace("Fireplace");
  }
}
