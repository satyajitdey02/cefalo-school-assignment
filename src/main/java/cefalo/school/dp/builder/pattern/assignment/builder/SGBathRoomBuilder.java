package cefalo.school.dp.builder.pattern.assignment.builder;

import cefalo.school.dp.builder.pattern.assignment.component.basic.Floor;
import cefalo.school.dp.builder.pattern.assignment.component.complex.BathRoom;
import cefalo.school.dp.builder.pattern.assignment.director.WallBuilderDirector;
import cefalo.school.dp.builder.pattern.assignment.component.basic.Ceiling;
import cefalo.school.dp.builder.pattern.assignment.component.basic.Column;
import cefalo.school.dp.builder.pattern.assignment.component.measurement.Dimensions;

/**
 * Created by satyajit on 11/10/16.
 * Steel and Glass Builder
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
