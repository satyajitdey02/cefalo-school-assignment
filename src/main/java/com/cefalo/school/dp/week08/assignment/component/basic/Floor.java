package com.cefalo.school.dp.week08.assignment.component.basic;

import com.cefalo.school.dp.week08.assignment.component.Component;
import com.cefalo.school.dp.week08.assignment.component.measurement.Dimensions;

/**
 * Created by satyajit on 10/30/16.
 */
public class Floor extends Component {

  public Floor(String type, Dimensions dimensions, String materials) {
    super(type, dimensions, materials);
  }

  @Override
  public void details() {

  }

  @Override
  public String toString() {
    return String.format("%s made floor.", this.materials);
  }
}
