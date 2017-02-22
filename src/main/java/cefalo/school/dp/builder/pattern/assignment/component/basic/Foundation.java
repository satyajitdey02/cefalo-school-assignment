package cefalo.school.dp.builder.pattern.assignment.component.basic;

import cefalo.school.dp.builder.pattern.assignment.component.Buildable;
import cefalo.school.dp.builder.pattern.assignment.component.Component;
import cefalo.school.dp.builder.pattern.assignment.component.measurement.Dimensions;
import cefalo.school.dp.builder.pattern.assignment.component.measurement.MeasurementValidator;
import cefalo.school.dp.builder.pattern.assignment.exception.WrongArchitectureException;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by satyajit on 10/31/2016.
 */
public class Foundation extends Component implements Buildable {

  public Foundation(String type, Dimensions dimensions, String materials) {
    super(type, dimensions, materials);
  }

  @Override
  public void details() {
    System.out.println(String.format("Type: %s.\nDimensions: %s X %s X %s.\nMaterials: %s",
        this.type, this.dimensions.getLength(), this.dimensions.getWidth(),
        this.dimensions.getHeight(), this.materials));
    System.out.println("\nFoundation built.");
  }

  @Override
  public void validate() throws WrongArchitectureException {
    if(StringUtils.isBlank(type)) {
      throw new WrongArchitectureException("The Foundation type must be defined.");
    }

    if(!MeasurementValidator.validateDimensions(dimensions)) {
      throw new WrongArchitectureException("The Foundation dimension is invalid.");
    }

    if(StringUtils.isBlank(materials)) {
      throw new WrongArchitectureException("The Foundation materials must be defined.");
    }
  }
}
