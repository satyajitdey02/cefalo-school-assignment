package cefalo.school.dp.decorator.pattern.practice.self.headfirst;

/**
 * Created by satyajit on 10/26/2016.
 */
public class Whip extends BeverageDecorator {

  Beverage beverage;

  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescriptions() {
    return beverage.getDescriptions() + ", " + "Whip";
  }

  @Override
  public double getCost() {
    return beverage.getCost() + 1.2;
  }
}
