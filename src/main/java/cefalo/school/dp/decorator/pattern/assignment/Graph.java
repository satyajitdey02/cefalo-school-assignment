package cefalo.school.dp.decorator.pattern.assignment;

import cefalo.school.dp.decorator.pattern.assignment.decorator.CircleValidator;
import cefalo.school.dp.decorator.pattern.assignment.decorator.LineValidator;
import cefalo.school.dp.decorator.pattern.assignment.decorator.RectangleValidator;
import cefalo.school.dp.decorator.pattern.assignment.decorator.TriangleValidator;
import cefalo.school.dp.decorator.pattern.assignment.exception.InvalidShapeException;
import cefalo.school.dp.decorator.pattern.assignment.shape.*;

/**
 * Created by satyajit on 11/13/16.
 */
public class Graph {
  public static void main(String[] args) {

    /*Draw Line*/
    try {
      System.out.println("Drawing Line without validation checking:");
      Shape line = new Line(new Point(0.0, 0.0), new Point(5.0, 5.0));
      line.draw();

      System.out.println("Drawing Line with validation checking:");
      line = new LineValidator(line);
      line.draw();
    } catch (InvalidShapeException ise) {
      System.out.println(ise.getMessage());
    }

    try {
      System.out.println("Drawing Line with validation checking:");
      Shape invalidLine = new LineValidator(new Circle(new Point(10.0, 5.0), new Point(10.0, 5.0)));
      invalidLine.draw();
    } catch (InvalidShapeException ise) {
      System.out.println(ise.getMessage());
    }

    try {
      System.out.println("Drawing Triangle without validation checking:");
      Shape triangle = new Triangle(new Point(0.0, 0.0), new Point(10.0, 5.0), new Point(0.0, 10.0));
      triangle.draw();

      System.out.println("Drawing Triangle with validation checking:");
      triangle = new TriangleValidator(triangle);
      triangle.draw();
    } catch (InvalidShapeException ise) {
      System.out.println(ise.getMessage());
    }

    try {
      System.out.println("Drawing Rectangle without validation checking:");
      Shape rectangle = new Rectangle(new Point(0.0, 0.0), new Point(10.0, 10.0));
      rectangle.draw();

      System.out.println("Drawing Rectangle with validation checking:");
      rectangle = new RectangleValidator(rectangle);
      rectangle.draw();
    } catch (InvalidShapeException ise) {
      System.out.println(ise.getMessage());
    }

    try {
      System.out.println("Drawing Triangle with validation checking:");
      Shape invalidTriangle = new TriangleValidator(new Triangle(new Point(0.0, 0.0),
          new Point(0.0, 5.0), new Point(0.0, 10.0)));
      invalidTriangle.draw();
    } catch (InvalidShapeException ise) {
      System.out.println(ise.getMessage());
    }

    try {
      System.out.println("Drawing Circle without validation checking:");
      Shape circle = new Circle(new Point(0.0, 0.0), new Point(5.0, 5.0));
      circle.draw();

      System.out.println("Drawing Circle with validation checking:");
      circle = new CircleValidator(circle);
      circle.draw();
    } catch (InvalidShapeException ise) {
      System.out.println(ise.getMessage());
    }

    try {
      System.out.println("Drawing Circle with validation checking:");
      Shape invalidCircle = new CircleValidator(new Circle(new Point(5.0, 5.0), new Point(5.0, 5.0)));
      invalidCircle.draw();
    } catch (InvalidShapeException ise) {
      System.out.println(ise.getMessage());
    }
  }
}
