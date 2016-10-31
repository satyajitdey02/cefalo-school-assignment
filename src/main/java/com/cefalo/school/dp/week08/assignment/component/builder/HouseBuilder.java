package com.cefalo.school.dp.week08.assignment.component.builder;

import com.cefalo.school.dp.week08.assignment.component.complex.House;

/**
 * Created by satyajit on 10/31/2016.
 */
public abstract class HouseBuilder {

  protected House house;

  public House getHouse() {
    return house;
  }

  public void startBuildingNewHouse() {
    this.house = new House();
  }

  public abstract void buildFoundation();

  public abstract void buildStoreys();

  public abstract void buildRoof();
}