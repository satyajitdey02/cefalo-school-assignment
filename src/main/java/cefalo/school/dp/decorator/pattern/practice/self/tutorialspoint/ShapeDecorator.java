package cefalo.school.dp.decorator.pattern.practice.self.tutorialspoint;

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
