package com.cefalo.school.dp.week10.assignment.shape;

import com.cefalo.school.dp.week10.assignment.exception.InvalidShapeException;

/**
 * Created by satyajit on 11/13/16.
 */
public class Rectangle extends Shape {

  public Rectangle(Point... points) {
    super(points);
  }

  @Override
  public void draw() throws InvalidShapeException {
    if (points.size() == 2) {
      System.out.println(String.format("Rectangle[D1(%.2f,%.2f), D2(%.2f,%.2f)] Drawn.\n",
          points.get(0).getX(), points.get(0).getY(),
          points.get(1).getX(), points.get(1).getY()));
    }

    if (points.size() == 4) {
      System.out.println(String.format("Rectangle[A(%.2f,%.2f), B(%.2f,%.2f), " +
              "C(%.2f,%.2f), D(%.2f,%.2f)] Drawn.\n",
          points.get(0).getX(), points.get(0).getY(),
          points.get(1).getX(), points.get(1).getY(),
          points.get(2).getX(), points.get(2).getY(),
          points.get(3).getX(), points.get(3).getY()));
    }
  }
}
