package com.cefalo.school.dp.decorator.pattern.practice.self.headfirst;

/**
 * Created by satyajit on 10/26/2016.
 */
public class DarkRoast extends Beverage {

  public DarkRoast() {
    descriptions = "Dark Roast";
  }

  @Override
  public double getCost() {
    return 1.5;
  }
}
