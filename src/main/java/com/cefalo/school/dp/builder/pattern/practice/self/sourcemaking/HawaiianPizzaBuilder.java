package com.cefalo.school.dp.builder.pattern.practice.self.sourcemaking;

/**
 * Created by satyajit on 10/29/2016.
 */
/*Concrete Builder*/
class HawaiianPizzaBuilder extends PizzaBuilder {
  public void buildDough() {
    pizza.setDough("cross");
  }

  public void buildSauce() {
    pizza.setSauce("mild");
  }

  public void buildTopping() {
    pizza.setTopping("ham+pineapple");
  }
}
