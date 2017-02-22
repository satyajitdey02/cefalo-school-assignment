package cefalo.school.dp.builder.pattern.practice.self.sourcemaking;

/**
 * Created by satyajit on 10/29/2016.
 */
/*Concrete Builder*/
class SpicyPizzaBuilder extends PizzaBuilder {
  public void buildDough() {
    pizza.setDough("pan baked");
  }

  public void buildSauce() {
    pizza.setSauce("hot");
  }

  public void buildTopping() {
    pizza.setTopping("pepperoni+salami");
  }
}
