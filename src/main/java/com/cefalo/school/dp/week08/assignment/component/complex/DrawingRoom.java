package com.cefalo.school.dp.week08.assignment.component.complex;

import com.cefalo.school.dp.week08.assignment.component.basic.Wall;

/**
 * Created by satyajit on 10/31/2016.
 */
public class DrawingRoom extends Room {

  private String firePlace;

  public static class Builder extends Room.Builder {

    private String bFirePlace;

    public Builder() {
    }

    public Builder fireplace(String firePlace) {
      this.bFirePlace = firePlace;
      return this;
    }

    public DrawingRoom build() {
      return new DrawingRoom(this);
    }
  }

  private DrawingRoom(Builder builder) {
    super(builder);
    this.firePlace = builder.bFirePlace;
  }

  public String getFirePlace() {
    return firePlace;
  }

  @Override
  public void details() {
    getFloor().details();
    getCeiling().details();

    for(Wall wall : getWalls()) {
      wall.details();
    }

    System.out.println(String.format("Fireplace: %s.", firePlace));
  }
}
