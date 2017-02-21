package com.cefalo.school.dp.decorator.pattern.assignment.utils;

import com.cefalo.school.dp.decorator.pattern.assignment.shape.Point;

/**
 * Created by satyajit on 11/13/16.
 */
public class GeometryUtils {

  private GeometryUtils() {
  }

  public static double calculateLength(Point a, Point b) {
    return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) +
        Math.pow(b.getY() - a.getY(), 2));
  }

  public static double calculateTriangleArea(Point a, Point b, Point c) {
    double aX = a.getX();
    double aY = a.getY();
    double bX = b.getX();
    double bY = b.getY();
    double cX = c.getX();
    double cY = c.getY();

    return Math.abs((aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY)) / 2);
  }
}
