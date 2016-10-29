package com.cefalo.school.dp.week08.practice.self.sourcemaking;

/**
 * Created by satyajit on 10/29/2016.
 */
/*Client*/
class BuilderExample {
  public static void main(String[] args) {
    Waiter waiter = new Waiter();
    PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
    PizzaBuilder  spicyPizzaBuilder= new SpicyPizzaBuilder();

    waiter.setPizzaBuilder(hawaiianPizzaBuilder);
    waiter.constructPizza();

    Pizza pizza = waiter.getPizza();
    System.out.println(pizza.toString());

    waiter.setPizzaBuilder(spicyPizzaBuilder);
    waiter.constructPizza();

    pizza = waiter.getPizza();
    System.out.println(pizza.toString());
  }
}

