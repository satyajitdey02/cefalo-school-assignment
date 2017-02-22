package cefalo.school.dp.decorator.pattern.practice.self.headfirst;

/**
 * Created by satyajit on 10/26/2016.
 */
public class Espresso extends Beverage {

  public Espresso() {
    descriptions = "Espresso";
  }

  @Override
  public double getCost() {
    return 2.2;
  }
}
