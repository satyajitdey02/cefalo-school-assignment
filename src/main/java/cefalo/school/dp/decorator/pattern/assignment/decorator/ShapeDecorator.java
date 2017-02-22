package cefalo.school.dp.decorator.pattern.assignment.decorator;

import cefalo.school.dp.decorator.pattern.assignment.shape.Shape;

/**
 * Created by satyajit on 11/13/16.
 */

/*Common decorator which cnot only be used for validation of the shape
but also to do some other things like coloring ,filling etc.*/
public abstract class ShapeDecorator extends Shape {
  protected Shape shape;
}
