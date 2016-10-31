package com.cefalo.school.dp.week08.assignment.component.basic;

import com.cefalo.school.dp.week08.assignment.component.Buildable;
import com.cefalo.school.dp.week08.assignment.component.Component;
import com.cefalo.school.dp.week08.assignment.component.measurement.Dimensions;

/**
 * Created by satyajit on 10/31/16.
 */
public class Ceiling extends Component implements Buildable {

  public Ceiling(String type, Dimensions dimensions, String materials) {
    super(type, dimensions, materials);
  }

  @Override
  public Component build() {
    return null;
  }

  @Override
  public void details() {

  }

  @Override
  public String toString() {
    return super.toString();
  }
}