package com.cefalo.school.dp.week08.assignment.component.basic;

import com.cefalo.school.dp.week08.assignment.component.Component;
import com.cefalo.school.dp.week08.assignment.component.measurement.Dimensions;

/**
 * Created by satyajit on 10/31/16.
 */
public class Handrails extends Component  {

  public Handrails(String type, Dimensions dimensions, String materials) {
    super(type, dimensions, materials);
  }

  @Override
  public void details() {
    System.out.println("\nHandrails built.");
    System.out.println(String.format("Type: %s.\nDimensions: %s X %s X %s.\nMaterials: %s",
        this.type, this.dimensions.getLength(), this.dimensions.getWidth(),
        this.dimensions.getHeight(), this.materials));
  }
}
