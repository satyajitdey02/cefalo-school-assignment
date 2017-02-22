package cefalo.school.dp.decorator.pattern.practice.self.headfirst;

/**
 * Created by satyajit on 10/26/2016.
 */
public class App {
  public static void main(String[] args) {
    Beverage darkRoast = new DarkRoast();
    System.out.println(darkRoast.getDescriptions() + " -> " + darkRoast.getCost());

    darkRoast = new Milk(darkRoast);
    System.out.println(darkRoast.getDescriptions() + " -> " + darkRoast.getCost());

    darkRoast = new Mocha(darkRoast);
    System.out.println(darkRoast.getDescriptions() + " -> " + darkRoast.getCost());

    darkRoast = new Soy(darkRoast);
    System.out.println(darkRoast.getDescriptions() + " -> " + darkRoast.getCost());

    darkRoast = new Whip(darkRoast);
    System.out.println(darkRoast.getDescriptions() + " -> " + darkRoast.getCost());
  }
}
