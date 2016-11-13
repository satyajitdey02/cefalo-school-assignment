package com.cefalo.school.dp.week10.assignment.decorator;

import com.cefalo.school.dp.week10.assignment.shape.Point;
import com.cefalo.school.dp.week10.assignment.shape.Shape;
import com.cefalo.school.dp.week10.assignment.utils.GeometryUtils;

import java.util.List;

/**
 * Created by satyajit on 11/13/16.
 */
public class TriangleValidator extends ShapeValidator {

  public TriangleValidator(Shape shape) {
    super(shape);
  }

  @Override
  public boolean validate() {
    List<Point> shapePoints = shape.getPoints();
    //Triangle should have 3 distinct points
    if (shapePoints.size() == 3) {
      return GeometryUtils.calculateTriangleArea(shapePoints.get(0),
          shapePoints.get(1), shapePoints.get(2)) > 0;
    }

    return false;
  }
}
