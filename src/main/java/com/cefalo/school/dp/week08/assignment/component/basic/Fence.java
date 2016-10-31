package com.cefalo.school.dp.week08.assignment.component.basic;

import com.cefalo.school.dp.week08.assignment.component.Buildable;
import com.cefalo.school.dp.week08.assignment.component.Component;
import com.cefalo.school.dp.week08.assignment.component.measurement.Dimensions;

/**
 * Created by satyajit on 10/31/2016.
 */
public class Fence extends Component implements Buildable{

  public Fence(String type, Dimensions dimensions, String materials) {
    super(type, dimensions, materials);
  }

  @Override
  public void details() {

  }

  @Override
  public Component build() {
    return null;
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
