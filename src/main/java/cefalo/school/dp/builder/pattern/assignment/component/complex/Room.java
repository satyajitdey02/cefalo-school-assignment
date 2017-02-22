package cefalo.school.dp.builder.pattern.assignment.component.complex;

import cefalo.school.dp.builder.pattern.assignment.component.Buildable;
import cefalo.school.dp.builder.pattern.assignment.component.Component;
import cefalo.school.dp.builder.pattern.assignment.component.basic.Ceiling;
import cefalo.school.dp.builder.pattern.assignment.component.basic.Column;
import cefalo.school.dp.builder.pattern.assignment.component.basic.Floor;
import cefalo.school.dp.builder.pattern.assignment.component.basic.Wall;
import cefalo.school.dp.builder.pattern.assignment.exception.WrongArchitectureException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by satyajit on 10/30/16.
 */
public class Room extends Component implements Buildable {

  protected Floor floor;
  protected Ceiling ceiling;
  protected List<Column> columns = new ArrayList<Column>();
  protected List<Wall> walls = new ArrayList<Wall>();

  public static class Builder {
    private Floor bFloor;
    private Ceiling bCeiling;
    private List<Column> bColumns = new ArrayList<Column>();
    private List<Wall> bWalls = new ArrayList<Wall>();

    public Builder() {
    }

    public Builder floor(Floor floor) {
      this.bFloor = floor;
      return this;
    }

    public Builder ceiling(Ceiling ceiling) {
      this.bCeiling = ceiling;
      return this;
    }

    public Builder column(Column column) {
      this.bColumns.add(column);
      return this;
    }

    public Builder columns(List<Column> columns) {
      this.bColumns.addAll(columns);
      return this;
    }

    public Builder wall(Wall wall) {
      this.bWalls.add(wall);
      return this;
    }

    public Builder walls(List<Wall> walls) {
      this.bWalls.addAll(walls);
      return this;
    }

    public Room build() {
      return new Room(this);
    }
  }

  protected Room(Builder builder) {
    this.floor = builder.bFloor;
    this.ceiling = builder.bCeiling;
    this.columns = builder.bColumns;
    this.walls = builder.bWalls;
  }

  protected Builder newBuilder() {
    return new Builder();
  }

  public Floor getFloor() {
    return floor;
  }

  public Ceiling getCeiling() {
    return ceiling;
  }

  public List<Column> getColumns() {
    return columns;
  }

  public List<Wall> getWalls() {
    return walls;
  }

  @Override
  public void details() {
    this.floor.details();

    for(Column column : columns) {
      column.details();
    }

    for (Wall wall : getWalls()) {
      wall.details();
    }

    this.ceiling.details();
  }

  @Override
  public void validate() throws WrongArchitectureException {
    floor.validate();
    if(columns.isEmpty()) {
      throw new WrongArchitectureException("Room columns are not defined.");
    }

    for(Column column : columns) {
      column.validate();
    }

    if(walls.isEmpty()) {
      throw new WrongArchitectureException("Room walls are not defined.");
    }

    for(Wall wall: walls) {
      wall.validate();
    }

    ceiling.validate();
  }
}
