package cefalo.school.dp.decorator.pattern.assignment.decorator;

import cefalo.school.dp.decorator.pattern.assignment.utils.GeometryUtils;
import cefalo.school.dp.decorator.pattern.assignment.shape.Point;
import cefalo.school.dp.decorator.pattern.assignment.shape.Shape;

import java.util.List;

/**
 * Created by satyajit on 11/13/16.
 */
public class CircleValidator extends ShapeValidator {

  public CircleValidator(Shape shape) {
    super(shape);
  }

  @Override
  public boolean validate() {
    List<Point> shapePoints = shape.getPoints();
    //Circle should have a centre point and a point on its perimeter
    if (shapePoints.size() == 2) {
      return GeometryUtils.calculateLength(shapePoints.get(0), shapePoints.get(1)) > 0;
    }

    return false;
  }
}