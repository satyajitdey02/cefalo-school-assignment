package cefalo.school.dp.decorator.pattern.assignment.shape;

import cefalo.school.dp.decorator.pattern.assignment.exception.InvalidShapeException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by satyajit on 11/13/16.
 */
public abstract class Shape {

  protected List<Point> points = new ArrayList<Point>();

  public Shape(Point... points) {
    this.points = new ArrayList<Point>(Arrays.asList(points));
  }

  public abstract void draw() throws InvalidShapeException;

  public List<Point> getPoints() {
    return points;
  }
}
