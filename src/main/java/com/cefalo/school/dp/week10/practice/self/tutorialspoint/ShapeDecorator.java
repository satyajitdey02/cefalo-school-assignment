package com.cefalo.school.dp.week10.practice.self.tutorialspoint;

/**
 * Created by satyajit on 10/25/2016.
 */
public abstract class ShapeDecorator implements Shape {
  protected Shape decoratedShape;

  public ShapeDecorator(Shape decoratedShape){
    this.decoratedShape = decoratedShape;
  }

  public void draw(){
    decoratedShape.draw();
  }
}
