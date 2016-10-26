package com.cefalo.school.dp.week10.practice.self.headfirst;

/**
 * Created by satyajit on 10/26/2016.
 */
public abstract class Beverage {
  protected String descriptions = "Unknown Description";

  public String getDescriptions() {
    return descriptions;
  }

  public abstract double getCost();
}
