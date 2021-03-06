package cefalo.school.dp.builder.pattern.assignment.component.basic;

import cefalo.school.dp.builder.pattern.assignment.component.Buildable;
import cefalo.school.dp.builder.pattern.assignment.component.Component;
import cefalo.school.dp.builder.pattern.assignment.component.measurement.Dimensions;
import cefalo.school.dp.builder.pattern.assignment.component.measurement.MeasurementValidator;
import cefalo.school.dp.builder.pattern.assignment.exception.WrongArchitectureException;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by satyajit on 10/30/16.
 */
public class Wall extends Component implements Buildable {

  private List<Window> windows = new ArrayList<Window>();
  private List<Door> doors = new ArrayList<Door>();

  public static class Builder {
    /*Mandatory Fields*/
    private String bType;
    private Dimensions bDimensions;
    private String bMaterials;

    /*Optional Fields*/
    private List<Window> bWindows = new ArrayList<Window>();
    private List<Door> bDoors = new ArrayList<Door>();

    public Builder(Wall wall) {

    }

    public Builder(String type, Dimensions dimensions, String materials) {
      this.bType = type;
      this.bDimensions = dimensions;
      this.bMaterials = materials;
    }

    public Builder window(Window window) {
      this.bWindows.add(window);
      return this;
    }

    public Builder windows(List<Window> windows) {
      this.bWindows.addAll(windows);
      return this;
    }

    public Builder door(Door door) {
      this.bDoors.add(door);
      return this;
    }

    public Builder doors(List<Door> doors) {
      this.bDoors.addAll(doors);
      return this;
    }

    public Wall build() {
      return new Wall(this);
    }
  }

  private Wall(Builder builder) {
    this.type = builder.bType;
    this.dimensions = builder.bDimensions;
    this.materials = builder.bMaterials;
    this.windows = builder.bWindows;
    this.doors = builder.bDoors;
  }

  public List<Window> getWindows() {
    return windows;
  }

  public List<Door> getDoors() {
    return doors;
  }

  @Override
  public void details() {
    System.out.println(String.format("Type: %s.\nDimensions: %s X %s X %s.\nMaterials: %s",
        this.type, this.dimensions.getLength(), this.dimensions.getWidth(),
        this.dimensions.getHeight(), this.materials));

    for (Window window : this.windows) {
      window.details();
    }

    for (Door door : this.doors) {
      door.details();
    }

    System.out.println("\nWall built.");
  }

  @Override
  public void validate() throws WrongArchitectureException {
    if (StringUtils.isBlank(type)) {
      throw new WrongArchitectureException("The Walls type must be defined.");
    }

    if (!MeasurementValidator.validateDimensions(dimensions)) {
      throw new WrongArchitectureException("The Walls dimension is invalid.");
    }

    if (StringUtils.isBlank(materials)) {
      throw new WrongArchitectureException("The Walls materials must be defined.");
    }

    if (!windows.isEmpty()) {
      for (Window window : windows) {
        window.validate();
      }
    }

    if (!doors.isEmpty()) {
      for (Door door : doors) {
        door.validate();
      }
    }
  }
}
