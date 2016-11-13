package com.cefalo.school.dp.week10.assignment.decorator;

import com.cefalo.school.dp.week10.assignment.shape.Point;
import com.cefalo.school.dp.week10.assignment.shape.Shape;
import com.cefalo.school.dp.week10.assignment.utils.GeometryUtils;

import java.util.List;

/**
 * Created by satyajit on 11/13/16.
 */
public class RectangleValidator extends ShapeValidator {

  public RectangleValidator(Shape shape) {
    super(shape);
  }

  @Override
  public boolean validate() {
    List<Point> shapePoints = shape.getPoints();
    //Triangle should have either 2(diagonal) or 4 distinct points
    if (shapePoints.size() == 2) {
      double diagonalLength = GeometryUtils.calculateLength(shapePoints.get(0), shapePoints.get(1));
      return diagonalLength > 0;
    }

    if (shapePoints.size() == 4) {
      double height = GeometryUtils.calculateLength(shapePoints.get(0), shapePoints.get(1));
      double width = GeometryUtils.calculateLength(shapePoints.get(1), shapePoints.get(2));
      double diagonal = GeometryUtils.calculateLength(shapePoints.get(1), shapePoints.get(3));

      /*Might have double precision errors*/
      return Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2)) == diagonal;
    }

    return false;
  }
}
