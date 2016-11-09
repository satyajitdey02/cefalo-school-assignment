package com.cefalo.school.dp.week08.assignment.director;

import com.cefalo.school.dp.week08.assignment.builder.HouseBuilder;
import com.cefalo.school.dp.week08.assignment.component.complex.House;

/**
 * Created by satyajit on 10/31/2016.
 */
public class HouseBuildingDirector {
  private HouseBuilder houseBuilder;

  public void setHouseBuilder(HouseBuilder houseBuilder) {
    this.houseBuilder = houseBuilder;
  }

  public House getHouse() {
    return houseBuilder.getHouse();
  }

  public void constructHouse() {
    houseBuilder.buildNewHouse();
    houseBuilder.buildFoundation();
    houseBuilder.buildStoreys();
    houseBuilder.buildRoof();
  }
}
