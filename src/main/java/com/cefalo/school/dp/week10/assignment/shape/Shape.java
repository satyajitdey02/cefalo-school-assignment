package com.cefalo.school.dp.week10.assignment.shape;

import com.cefalo.school.dp.week10.assignment.exception.InvalidShapeException;

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
