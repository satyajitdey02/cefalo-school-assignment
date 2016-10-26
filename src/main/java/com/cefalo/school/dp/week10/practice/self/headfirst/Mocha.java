package com.cefalo.school.dp.week10.practice.self.headfirst;

/**
 * Created by satyajit on 10/26/2016.
 */
public class Mocha extends BeverageDecorator {
  Beverage beverage;

  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescriptions() {
    return beverage.getDescriptions() + ", " + "Mocha";
  }

  @Override
  public double getCost() {
    return beverage.getCost() + 0.7;
  }
}
