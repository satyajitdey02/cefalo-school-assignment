package com.cefalo.school.dp.week08.assignment;

import com.cefalo.school.dp.week08.assignment.component.Ceiling;
import com.cefalo.school.dp.week08.assignment.component.Floor;
import com.cefalo.school.dp.week08.assignment.component.Wall;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by satyajit on 10/30/16.
 */
public class Room {
  private Floor floor;
  private Ceiling ceiling;
  private List<Wall> walls = new ArrayList<Wall>();

  public Room(Floor floor, Ceiling ceiling, List<Wall> walls) {
    this.floor = floor;
    this.ceiling = ceiling;
    this.walls = walls;
  }

  public Floor getFloor() {
    return floor;
  }

  public void setFloor(Floor floor) {
    this.floor = floor;
  }

  public Ceiling getCeiling() {
    return ceiling;
  }

  public void setCeiling(Ceiling ceiling) {
    this.ceiling = ceiling;
  }

  public List<Wall> getWalls() {
    return walls;
  }

  public void setWalls(List<Wall> walls) {
    this.walls = walls;
  }

  @Override
  public String toString() {
    //TODO: Make some informative Room info
    return toString();
  }
}
