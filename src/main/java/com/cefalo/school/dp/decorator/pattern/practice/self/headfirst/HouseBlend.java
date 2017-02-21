package com.cefalo.school.dp.decorator.pattern.practice.self.headfirst;

/**
 * Created by satyajit on 10/26/2016.
 */
public class HouseBlend extends Beverage {
  public HouseBlend() {
    descriptions = "House Blend";
  }

  @Override
  public double getCost() {
    return 1.0;
  }
}
