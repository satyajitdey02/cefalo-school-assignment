package com.cefalo.school.dp.week08.assignment.component.basic;

import com.cefalo.school.dp.week08.assignment.component.Buildable;
import com.cefalo.school.dp.week08.assignment.component.Component;
import com.cefalo.school.dp.week08.assignment.component.measurement.Dimensions;
import com.cefalo.school.dp.week08.assignment.component.measurement.MeasurementValidator;
import com.cefalo.school.dp.week08.assignment.exception.WrongArchitectureException;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by satyajit on 10/30/16.
 */
public class Floor extends Component implements Buildable {

  public Floor(String type, Dimensions dimensions, String materials) {
    super(type, dimensions, materials);
  }

  @Override
  public void details() {
    System.out.println("\nFloor built.");
    System.out.println(String.format("Type: %s.\nDimensions: %s X %s X %s.\nMaterials: %s",
        this.type, this.dimensions.getLength(), this.dimensions.getWidth(),
        this.dimensions.getHeight(), this.materials));
  }

  @Override
  public void validate() throws WrongArchitectureException {
    if(StringUtils.isBlank(type)) {
      throw new WrongArchitectureException("The Floor type must be defined.");
    }

    if(!MeasurementValidator.validateDimensions(dimensions)) {
      throw new WrongArchitectureException("The Floor dimension is invalid.");
    }

    if(StringUtils.isBlank(materials)) {
      throw new WrongArchitectureException("The Floor materials must be defined.");
    }
  }
}
