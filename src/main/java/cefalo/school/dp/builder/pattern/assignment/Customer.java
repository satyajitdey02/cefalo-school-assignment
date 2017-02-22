package cefalo.school.dp.builder.pattern.assignment;

import cefalo.school.dp.builder.pattern.assignment.builder.HouseBuilder;
import cefalo.school.dp.builder.pattern.assignment.component.complex.House;
import cefalo.school.dp.builder.pattern.assignment.director.HouseBuildingDirector;
import cefalo.school.dp.builder.pattern.assignment.exception.WrongArchitectureException;
import cefalo.school.dp.builder.pattern.assignment.builder.CBHouseBuilder;
import cefalo.school.dp.builder.pattern.assignment.builder.SGHouseBuilder;

/**
 * Created by satyajit on 10/31/2016.
 */
public class Customer {

  public static void main(String[] args) {
    try {
      HouseBuildingDirector houseBuildingDirector = new HouseBuildingDirector();
      HouseBuilder houseBuilder = new CBHouseBuilder();
      houseBuildingDirector.setHouseBuilder(houseBuilder);
      houseBuildingDirector.constructHouse();

      House house = houseBuilder.getHouse();
      house.validate();
      house.details();

      System.out.println("---------------------------------------");

      houseBuilder = new SGHouseBuilder();
      houseBuildingDirector.setHouseBuilder(houseBuilder);
      houseBuildingDirector.constructHouse();

      house = houseBuilder.getHouse();
      house.validate();
      house.details();

    } catch (WrongArchitectureException wae) {
      wae.printStackTrace();
    }
  }
}
