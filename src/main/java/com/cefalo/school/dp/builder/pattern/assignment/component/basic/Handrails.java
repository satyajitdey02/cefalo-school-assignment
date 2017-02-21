package com.cefalo.school.dp.builder.pattern.assignment.component.basic;

import com.cefalo.school.dp.builder.pattern.assignment.component.Buildable;
import com.cefalo.school.dp.builder.pattern.assignment.component.measurement.Dimensions;
import com.cefalo.school.dp.builder.pattern.assignment.component.measurement.MeasurementValidator;
import com.cefalo.school.dp.builder.pattern.assignment.component.Component;
import com.cefalo.school.dp.builder.pattern.assignment.exception.WrongArchitectureException;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by satyajit on 10/31/16.
 */
public class Handrails extends Component implements Buildable {

  public Handrails(String type, Dimensions dimensions, String materials) {
    super(type, dimensions, materials);
  }

  @Override
  public void details() {
    System.out.println(String.format("Type: %s.\nDimensions: %s X %s X %s.\nMaterials: %s",
        this.type, this.dimensions.getLength(), this.dimensions.getWidth(),
        this.dimensions.getHeight(), this.materials));
    System.out.println("\nHandrails built.");
  }

  @Override
  public void validate() throws WrongArchitectureException {
    if(StringUtils.isBlank(type)) {
      throw new WrongArchitectureException("The Handrails type must be defined.");
    }

    if(!MeasurementValidator.validateDimensions(dimensions)) {
      throw new WrongArchitectureException("The Handrails dimension is invalid.");
    }

    if(StringUtils.isBlank(materials)) {
      throw new WrongArchitectureException("The Handrails materials must be defined.");
    }
  }
}