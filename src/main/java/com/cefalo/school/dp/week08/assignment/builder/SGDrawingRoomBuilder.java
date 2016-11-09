package com.cefalo.school.dp.week08.assignment.builder;

import com.cefalo.school.dp.week08.assignment.component.basic.Ceiling;
import com.cefalo.school.dp.week08.assignment.component.basic.Column;
import com.cefalo.school.dp.week08.assignment.component.basic.Floor;
import com.cefalo.school.dp.week08.assignment.component.complex.DrawingRoom;
import com.cefalo.school.dp.week08.assignment.component.measurement.Dimensions;
import com.cefalo.school.dp.week08.assignment.director.WallBuilderDirector;

/**
 * Created by satyajit on 11/10/16.
 */
public class SGDrawingRoomBuilder extends RoomBuilder {

  public SGDrawingRoomBuilder() {
    builder = new DrawingRoom.Builder();
  }

  @Override
  public void buildFloor() {
    builder.floor(new Floor("Steel+Brick+Glass",
        new Dimensions(8.0, 8.0, 0.0), "Steel+Brick+Glass"));
  }

  @Override
  public void buildColumns() {
    builder.column(new Column("Steel+Brick+Glass", new Dimensions(1.5, 1.5, 10.0), "Steel+Brick+Glass"))
        .column(new Column("Steel+Brick+Glass", new Dimensions(1.5, 1.5, 10.0), "Steel+Brick+Glass"))
        .column(new Column("Steel+Brick+Glass", new Dimensions(1.5, 1.5, 10.0), "Steel+Brick+Glass"))
        .column(new Column("Steel+Brick+Glass", new Dimensions(1.5, 1.5, 10.0), "Steel+Brick+Glass"));
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
    builder.ceiling(new Ceiling("Steel+Brick+Glass",
        new Dimensions(8.0, 8.0, 0.0), "Steel+Brick+Glass"));
  }

  @Override
  public void buildRoomSpecificSetup() {
    ((DrawingRoom.Builder) builder).fireplace("Fireplace");
  }
}
