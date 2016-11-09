package com.cefalo.school.dp.week08.assignment;

import com.cefalo.school.dp.week08.assignment.builder.CBHouseBuilder;
import com.cefalo.school.dp.week08.assignment.builder.HouseBuilder;
import com.cefalo.school.dp.week08.assignment.builder.SGHouseBuilder;
import com.cefalo.school.dp.week08.assignment.component.complex.House;
import com.cefalo.school.dp.week08.assignment.director.HouseBuildingDirector;
import com.cefalo.school.dp.week08.assignment.exception.WrongArchitectureException;

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
