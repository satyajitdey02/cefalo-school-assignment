package com.cefalo.school.dp.week08.assignment.builder;

import com.cefalo.school.dp.week08.assignment.component.basic.Ceiling;
import com.cefalo.school.dp.week08.assignment.component.basic.Column;
import com.cefalo.school.dp.week08.assignment.component.basic.Floor;
import com.cefalo.school.dp.week08.assignment.component.complex.BathRoom;
import com.cefalo.school.dp.week08.assignment.component.measurement.Dimensions;
import com.cefalo.school.dp.week08.assignment.director.WallBuilderDirector;

/**
 * Created by satyajit on 11/10/16.
 */
public class SGBathRoomBuilder extends RoomBuilder {

  public SGBathRoomBuilder() {
    builder = new BathRoom.Builder();
  }

  @Override
  public void buildFloor() {
    builder.floor(new Floor("Concrete+Brick",
        new Dimensions(8.0, 8.0, 0.0), "Concrete+Brick"));
  }

  @Override
  public void buildColumns() {
    builder.column(new Column("Concrete+Brick+Steel", new Dimensions(1.5, 1.5, 10.0), "Concrete+Brick+Steel"))
        .column(new Column("Concrete+Brick+Steel", new Dimensions(1.5, 1.5, 10.0), "Concrete+Brick+Steel"))
        .column(new Column("Concrete+Brick+Steel", new Dimensions(1.5, 1.5, 10.0), "Concrete+Brick+Steel"))
        .column(new Column("Concrete+Brick+Steel", new Dimensions(1.5, 1.5, 10.0), "Concrete+Brick+Steel"));
  }

  @Override
  public void buildWalls() {
    WallBuilderDirector wallBuilderDirector = new WallBuilderDirector();
    WallBuilder wallBuilder = new SGWallBuilder();
    wallBuilderDirector.setWallBuilder(wallBuilder);

    wallBuilderDirector.constructWall();
    builder.wall(wallBuilder.getWall());

    wallBuilderDirector.constructWall();
    builder.wall(wallBuilder.getWall());

    wallBuilder = new SGWallWithDoorBuilder();
    wallBuilderDirector.setWallBuilder(wallBuilder);
    wallBuilderDirector.constructWall();
    builder.wall(wallBuilder.getWall());


    wallBuilder = new SGWallWithWindowBuilder();
    wallBuilderDirector.setWallBuilder(wallBuilder);
    wallBuilderDirector.constructWall();
    builder.wall(wallBuilder.getWall());
  }

  @Override
  public void buildCeiling() {
    builder.ceiling(new Ceiling("Glass+Steel",
        new Dimensions(8.0, 8.0, 0.0), "Glass+Steel"));
  }

  @Override
  public void buildRoomSpecificSetup() {
    ((BathRoom.Builder) builder).shower("Shower");
    ((BathRoom.Builder) builder).bathtub("Bathtub");
  }
}
