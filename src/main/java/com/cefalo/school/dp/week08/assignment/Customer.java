package com.cefalo.school.dp.week08.assignment;

import com.cefalo.school.dp.week08.assignment.component.builder.ConcreteBrickHouseBuilder;
import com.cefalo.school.dp.week08.assignment.component.builder.HouseBuilder;
import com.cefalo.school.dp.week08.assignment.component.complex.House;
import com.cefalo.school.dp.week08.assignment.component.director.HouseBuildingDirector;

/**
 * Created by satyajit on 10/31/2016.
 */
public class Customer {
  public static void main(String[] args) {
   /* Waiter waiter = new Waiter();
    PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
    PizzaBuilder  spicyPizzaBuilder= new SpicyPizzaBuilder();

    waiter.setPizzaBuilder(hawaiianPizzaBuilder);
    waiter.constructPizza();

    Pizza pizza = waiter.getPizza();
    System.out.println(pizza.toString());*/

    HouseBuildingDirector houseBuildingDirector = new HouseBuildingDirector();
    HouseBuilder houseBuilder = new ConcreteBrickHouseBuilder();
    houseBuildingDirector.setHouseBuilder(houseBuilder);
    houseBuildingDirector.constructHouse();

    House house = houseBuilder.getHouse();
    System.out.println("My House: " + house.toString());
  }
}
