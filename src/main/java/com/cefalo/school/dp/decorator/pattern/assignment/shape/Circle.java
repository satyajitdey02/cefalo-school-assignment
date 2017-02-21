package com.cefalo.school.dp.decorator.pattern.assignment.shape;

import com.cefalo.school.dp.decorator.pattern.assignment.exception.InvalidShapeException;

/**
 * Created by satyajit on 11/13/16.
 */
public class Circle extends Shape {

  public Circle(Point... points) {
    super(points);
  }

  @Override
  public void draw() throws InvalidShapeException {
    System.out.println(String.format("Circle[C(%.2f,%.2f), P(%.2f,%.2f)] Drawn.\n",
        points.get(0).getX(), points.get(0).getY(),
        points.get(1).getX(), points.get(1).getY()));

  }
}
