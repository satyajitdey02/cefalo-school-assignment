package com.cefalo.school.dp.week10.assignment.decorator;

import com.cefalo.school.dp.week10.assignment.exception.InvalidShapeException;
import com.cefalo.school.dp.week10.assignment.shape.Shape;

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
