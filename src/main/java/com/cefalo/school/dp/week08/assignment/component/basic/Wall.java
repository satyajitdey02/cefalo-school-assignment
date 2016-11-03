package com.cefalo.school.dp.week08.assignment.component.basic;

import com.cefalo.school.dp.week08.assignment.component.Buildable;
import com.cefalo.school.dp.week08.assignment.component.Component;
import com.cefalo.school.dp.week08.assignment.component.measurement.Dimensions;

/**
 * Created by satyajit on 10/30/16.
 */
public class Wall extends Component implements Buildable {

  /*Optional Fields*/
  private Window window;
  private Door door;

  public Wall(String type, Dimensions dimensions, String materials) {
    super(type, dimensions, materials);
  }

  @Override
  public void details() {
    System.out.println(String.format("%s made %s wall. Doors: %s, Window: %s",
        this.materials, this.type, this.door.toString(), this.window.toString()));
  }

  @Override
  public Component build() {
    return this;
  }
}
