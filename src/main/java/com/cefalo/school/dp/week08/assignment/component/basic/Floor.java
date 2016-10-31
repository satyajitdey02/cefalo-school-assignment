package com.cefalo.school.dp.week08.assignment.component.basic;

/**
 * Created by satyajit on 10/30/16.
 */
public class Floor extends Component {

  public Floor(String type, Dimensions dimensions, String materials) {
    super(type, dimensions, materials);
  }

  @Override
  public Component build() {
    return null;
  }

  @Override
  public String toString() {
    return String.format("%s made floor.", this.materials);
  }
}
