package com.cefalo.school.dp.week08.assignment.component.complex;

import com.cefalo.school.dp.week08.assignment.component.basic.Ceiling;
import com.cefalo.school.dp.week08.assignment.component.basic.Floor;
import com.cefalo.school.dp.week08.assignment.component.basic.Wall;

import java.util.List;

/**
 * Created by satyajit on 10/31/16.
 */
public class DiningRoom extends Room {

  private String cabinet;

  public static class Builder extends Room.Builder {

    private String bCabinet;

    public Builder() {
    }

    public Builder cabinet(String cabinet) {
      this.bCabinet = cabinet;
      return this;
    }

    public DiningRoom build() {
      return new DiningRoom(this);
    }
  }

  private DiningRoom(Builder builder) {
    super(builder);
    this.cabinet = builder.bCabinet;
  }

  public String getCabinet() {
    return this.cabinet;
  }

  @Override
  public void details() {
    getFloor().details();
    getCeiling().details();

    for (Wall wall : getWalls()) {
      wall.details();
    }

    System.out.println(String.format("Cabinet: %s.", cabinet));
  }
}
