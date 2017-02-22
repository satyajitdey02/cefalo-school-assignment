package cefalo.school.dp.builder.pattern.assignment.director;

import cefalo.school.dp.builder.pattern.assignment.builder.HouseBuilder;
import cefalo.school.dp.builder.pattern.assignment.component.complex.House;

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
    houseBuilder.installUtilities();
    houseBuilder.decorateHouse();
  }
}
