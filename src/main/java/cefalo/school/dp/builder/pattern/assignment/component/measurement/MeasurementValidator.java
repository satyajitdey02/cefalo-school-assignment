package cefalo.school.dp.builder.pattern.assignment.component.measurement;

/**
 * Created by satyajit on 11/9/16.
 */
public class MeasurementValidator {

  private MeasurementValidator() {

  }

  public static boolean validateDimensions(Dimensions dimensions) {
    if(dimensions == null) {
      return false;
    }

    if(dimensions.getLength() <= 0.0 &&
        dimensions.getWidth() <= 0.0 &&
        dimensions.getHeight() <= 0.0) {
      return false;
    }

    return true;
  }
}
