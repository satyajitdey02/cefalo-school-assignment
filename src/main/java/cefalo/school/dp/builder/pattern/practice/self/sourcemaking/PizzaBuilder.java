package cefalo.school.dp.builder.pattern.practice.self.sourcemaking;

/**
 * Created by satyajit on 10/29/2016.
 */
/*Abstract Builder*/
abstract class PizzaBuilder {
  protected Pizza pizza;

  public Pizza getPizza() {
    return pizza;
  }

  public void createNewPizzaProduct() {
    pizza = new Pizza();
  }

  public abstract void buildDough();

  public abstract void buildSauce();

  public abstract void buildTopping();
}
