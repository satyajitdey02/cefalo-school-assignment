package cefalo.school.dp.decorator.pattern.assignment.shape;

import cefalo.school.dp.decorator.pattern.assignment.exception.InvalidShapeException;

/**
 * Created by satyajit on 11/13/16.
 */

/*Is not a shape though :)*/
public class Line extends Shape{

  public Line(Point... points) {
    super(points);
  }

  @Override
  public void draw() throws InvalidShapeException {
    System.out.println(String.format("Line[C(%.2f,%.2f), P(%.2f,%.2f)] Drawn.\n",
        points.get(0).getX(), points.get(0).getY(),
        points.get(1).getX(), points.get(1).getY()));
  }
}
