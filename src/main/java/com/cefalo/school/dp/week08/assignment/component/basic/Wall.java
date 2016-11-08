package com.cefalo.school.dp.week08.assignment.component.basic;

import com.cefalo.school.dp.week08.assignment.component.Component;
import com.cefalo.school.dp.week08.assignment.component.measurement.Dimensions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by satyajit on 10/30/16.
 */
public class Wall extends Component {

  /*Optional Fields*/
  private List<Window> windows = new ArrayList<Window>();
  private List<Door> doors = new ArrayList<Door>();

  public Wall() {

  }

  public Wall(String type, Dimensions dimensions, String materials) {
    super(type, dimensions, materials);
  }

  public List<Window> getWindows() {
    return windows;
  }

  public void setWindows(List<Window> windows) {
    this.windows = windows;
  }

  public List<Door> getDoors() {
    return doors;
  }

  public void setDoors(List<Door> doors) {
    this.doors = doors;
  }

  @Override
  public void details() {
    System.out.println("Wall built.");
    System.out.println(String.format("Type: %s.\nDimensions: %s X %s X %s.\nMaterials: %s",
        this.type, this.dimensions.getLength(), this.dimensions.getWidth(),
        this.dimensions.getHeight(), this.materials));

    for(Window window : this.windows) {
      window.details();
    }

    for(Door door : this.doors) {
      door.details();
    }
  }
}
