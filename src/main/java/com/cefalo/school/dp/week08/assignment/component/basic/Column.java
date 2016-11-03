package com.cefalo.school.dp.week08.assignment.component.basic;

import com.cefalo.school.dp.week08.assignment.component.Buildable;
import com.cefalo.school.dp.week08.assignment.component.Component;
import com.cefalo.school.dp.week08.assignment.component.measurement.Dimensions;

/**
 * Created by satyajit on 11/3/16.
 */
public class Column extends Component implements Buildable {

  public Column(String type, Dimensions dimensions, String materials) {
    super(type, dimensions, materials);
  }

  @Override
  public Component build() {
    return this;
  }

  @Override
  public void details() {
    System.out.println(String.format("%s made %s column.", this.materials, this.type));
  }
}
