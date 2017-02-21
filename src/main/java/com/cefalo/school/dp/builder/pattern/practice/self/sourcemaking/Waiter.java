package com.cefalo.school.dp.builder.pattern.practice.self.sourcemaking;

/**
 * Created by satyajit on 10/29/2016.
 */
/*The Director*/
class Waiter {
  private PizzaBuilder pizzaBuilder;

  public void setPizzaBuilder(PizzaBuilder pb) {
    pizzaBuilder = pb;
  }

  public Pizza getPizza() {
    return pizzaBuilder.getPizza();
  }

  public void constructPizza() {
    pizzaBuilder.createNewPizzaProduct();
    pizzaBuilder.buildDough();
    pizzaBuilder.buildSauce();
    pizzaBuilder.buildTopping();
  }
}
