package com.cefalo.school.dp.week10.assignment.decorator;

import com.cefalo.school.dp.week10.assignment.shape.Point;
import com.cefalo.school.dp.week10.assignment.shape.Shape;
import com.cefalo.school.dp.week10.assignment.utils.GeometryUtils;

import java.util.List;

/**
 * Created by satyajit on 11/13/16.
 */
public class LineValidator extends ShapeValidator {

  public LineValidator(Shape shape) {
    super(shape);
  }

  @Override
  public boolean validate() {
    List<Point> shapePoints = shape.getPoints();
    //Line should have 2 distinct points
    if (shapePoints.size() == 2) {
      return GeometryUtils.calculateLength(shapePoints.get(0), shapePoints.get(1)) > 0;
    }

    return false;
  }
}
