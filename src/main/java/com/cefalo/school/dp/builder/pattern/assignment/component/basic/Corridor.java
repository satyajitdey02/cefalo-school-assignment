package com.cefalo.school.dp.builder.pattern.assignment.component.basic;

import com.cefalo.school.dp.builder.pattern.assignment.component.measurement.Dimensions;
import com.cefalo.school.dp.builder.pattern.assignment.component.measurement.MeasurementValidator;
import com.cefalo.school.dp.builder.pattern.assignment.component.Buildable;
import com.cefalo.school.dp.builder.pattern.assignment.component.Component;
import com.cefalo.school.dp.builder.pattern.assignment.exception.WrongArchitectureException;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by satyajit on 11/1/16.
 */
public class Corridor extends Component implements Buildable {

  public Corridor(String type, Dimensions dimensions, String materials) {
    super(type, dimensions, materials);
  }

  @Override
  public void details() {
    System.out.println(String.format("Type: %s.\nDimensions: %s X %s X %s.\nMaterials: %s",
        this.type, this.dimensions.getLength(), this.dimensions.getWidth(),
        this.dimensions.getHeight(), this.materials));
    System.out.println("\nCorridor built.");
  }

  @Override
  public void validate() throws WrongArchitectureException {
    if(StringUtils.isBlank(type)) {
      throw new WrongArchitectureException("The Corridor type must be defined.");
    }

    if(!MeasurementValidator.validateDimensions(dimensions)) {
      throw new WrongArchitectureException("The Corridor dimension is invalid.");
    }

    if(StringUtils.isBlank(materials)) {
      throw new WrongArchitectureException("The Corridor materials must be defined.");
    }
  }
}
