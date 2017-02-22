package cefalo.school.dp.decorator.pattern.assignment.shape;

/**
 * Created by satyajit on 11/13/16.
 */
public class Triangle extends Shape {

  public Triangle(Point... points) {
    super(points);
  }

  @Override
  public void draw() {
    System.out.println(String.format("Triangle[A(%.2f,%.2f), B(%.2f,%.2f), C(%.2f,%.2f)] Drawn.\n",
        points.get(0).getX(), points.get(0).getY(),
        points.get(1).getX(), points.get(1).getY(),
        points.get(2).getX(), points.get(2).getY()));
  }
}
