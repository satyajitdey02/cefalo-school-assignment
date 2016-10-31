package com.cefalo.school.dp.week08.assignment.component.basic;

import com.cefalo.school.dp.week08.assignment.component.Buildable;
import com.cefalo.school.dp.week08.assignment.component.Component;
import com.cefalo.school.dp.week08.assignment.component.measurement.Dimensions;

/**
 * Created by satyajit on 10/31/2016.
 */
public class Foundation extends Component implements Buildable {
  public Foundation(String type, Dimensions dimensions, String materials) {
    super(type, dimensions, materials);
  }

  @Override
  public Component build() {
    return null;
  }

  @Override
  public void details() {

  }
}