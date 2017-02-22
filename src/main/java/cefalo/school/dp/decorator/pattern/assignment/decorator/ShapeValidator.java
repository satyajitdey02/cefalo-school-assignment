package cefalo.school.dp.decorator.pattern.assignment.decorator;

import cefalo.school.dp.decorator.pattern.assignment.exception.InvalidShapeException;
import cefalo.school.dp.decorator.pattern.assignment.shape.Shape;

/**
 * Created by satyajit on 11/13/16.
 */
public abstract class ShapeValidator extends ShapeDecorator {

  public ShapeValidator(Shape shape) {
    this.shape = shape;
  }

  @Override
  public void draw() throws InvalidShapeException {
    if(!validate()) {
     throw new InvalidShapeException("Shape can't be drawn with the given vertices.\n");
    }

    shape.draw();
  }

  public abstract boolean validate();
}
