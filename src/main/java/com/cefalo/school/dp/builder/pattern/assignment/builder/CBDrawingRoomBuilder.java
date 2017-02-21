package com.cefalo.school.dp.builder.pattern.assignment.builder;

import com.cefalo.school.dp.builder.pattern.assignment.component.basic.Floor;
import com.cefalo.school.dp.builder.pattern.assignment.component.complex.DrawingRoom;
import com.cefalo.school.dp.builder.pattern.assignment.component.measurement.Dimensions;
import com.cefalo.school.dp.builder.pattern.assignment.director.WallBuilderDirector;
import com.cefalo.school.dp.builder.pattern.assignment.component.basic.Ceiling;
import com.cefalo.school.dp.builder.pattern.assignment.component.basic.Column;

/**
 * Created by satyajit on 11/8/16.
 * * Concrete and Brick Builder
 */
public class CBDrawingRoomBuilder extends RoomBuilder {

  public CBDrawingRoomBuilder() {
    builder = new DrawingRoom.Builder();
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

  @Override
  public void buildRoomSpecificSetup() {
    ((DrawingRoom.Builder) builder).fireplace("Fireplace");
  }
}
