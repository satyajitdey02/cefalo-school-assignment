package cefalo.school.dp.decorator.pattern.practice.self.headfirst;

/**
 * Created by satyajit on 10/26/2016.
 */
public class Decaf extends Beverage {

  public Decaf() {
    descriptions = "Decaf";
  }

  @Override
  public double getCost() {
    return 0;
  }
}
