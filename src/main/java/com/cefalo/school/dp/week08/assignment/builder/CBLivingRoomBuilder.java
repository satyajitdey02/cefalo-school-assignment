package com.cefalo.school.dp.week08.assignment.builder;

import com.cefalo.school.dp.week08.assignment.component.basic.Ceiling;
import com.cefalo.school.dp.week08.assignment.component.basic.Column;
import com.cefalo.school.dp.week08.assignment.component.basic.Floor;
import com.cefalo.school.dp.week08.assignment.component.complex.LivingRoom;
import com.cefalo.school.dp.week08.assignment.director.WallBuilderDirector;
import com.cefalo.school.dp.week08.assignment.component.measurement.Dimensions;

/**
 * Created by satyajit on 11/3/16.
 */
public class CBLivingRoomBuilder extends RoomBuilder {

  public CBLivingRoomBuilder() {
    builder = new LivingRoom.Builder();
  }

  @Override
  public void buildFloor() {
    builder.floor(new Floor("Concrete+Brick",
        new Dimensions(8.0, 8.0, 0.0), "Concrete+Brick"));
  }

  @Override
  public void buildColumns() {
    builder.column(new Column("Concrete+Brick", new Dimensions(1.5, 1.5, 10.0), "Concrete+Brick"))
        .column(new Column("Concrete+Brick", new Dimensions(1.5, 1.5, 10.0), "Concrete+Brick"))
        .column(new Column("Concrete+Brick", new Dimensions(1.5, 1.5, 10.0), "Concrete+Brick"))
        .column(new Column("Concrete+Brick", new Dimensions(1.5, 1.5, 10.0), "Concrete+Brick"));
  }

  @Override
  public void buildWalls() {
    WallBuilderDirector wallBuilderDirector = new WallBuilderDirector();
    WallBuilder wallBuilder = new CBWallBuilder();
    wallBuilderDirector.setWallBuilder(wallBuilder);

    wallBuilderDirector.constructWall();
    builder.wall(wallBuilder.getWall());

    wallBuilderDirector.constructWall();
    builder.wall(wallBuilder.getWall());

    wallBuilder = new CBWallWithDoorBuilder();
    wallBuilderDirector.setWallBuilder(wallBuilder);
    wallBuilderDirector.constructWall();
    builder.wall(wallBuilder.getWall());


    wallBuilder = new CBWallWithWindowBuilder();
    wallBuilderDirector.setWallBuilder(wallBuilder);
    wallBuilderDirector.constructWall();
    builder.wall(wallBuilder.getWall());
  }

  @Override
  public void buildCeiling() {
    builder.ceiling(new Ceiling("Concrete+Brick",
        new Dimensions(8.0, 8.0, 0.0), "Concrete+Brick"));
  }
}