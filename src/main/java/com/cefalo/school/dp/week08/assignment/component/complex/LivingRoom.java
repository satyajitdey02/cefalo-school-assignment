package com.cefalo.school.dp.week08.assignment.component.complex;

import com.cefalo.school.dp.week08.assignment.component.basic.Ceiling;
import com.cefalo.school.dp.week08.assignment.component.basic.Floor;
import com.cefalo.school.dp.week08.assignment.component.basic.Wall;

import java.util.List;

/**
 * Created by satyajit on 10/31/2016.
 */
public class LivingRoom extends Room {

  public static class Builder extends Room.Builder {

    public Builder() {

    }

    public LivingRoom build() {
      return new LivingRoom(this);
    }
  }

  private LivingRoom(Builder builder) {
    super(builder);
  }

  @Override
  public void details() {
    getFloor().details();
    getCeiling().details();

    for(Wall wall : getWalls()) {
      wall.details();
    }
  }
}
