package com.cefalo.school.dp.week08.assignment.component.basic;

/**
 * Created by satyajit on 10/30/16.
 */
public class Wall extends Component {

  /*Optional Fields*/
  private Window window;
  private Door door;

  public Wall(String type, Dimensions dimensions, String materials) {
    super(type, dimensions, materials);
  }

  @Override
  public Component build() {
    return null;
  }

  @Override
  public String toString() {
    return String.format("%s made %s wall. Doors: %s, Window: %s",
        this.materials, this.type, this.door.toString(), this.window.toString());
  }
}
