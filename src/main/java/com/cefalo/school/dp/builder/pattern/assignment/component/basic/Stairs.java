package com.cefalo.school.dp.builder.pattern.assignment.component.basic;

import com.cefalo.school.dp.builder.pattern.assignment.component.Buildable;
import com.cefalo.school.dp.builder.pattern.assignment.component.Component;
import com.cefalo.school.dp.builder.pattern.assignment.component.measurement.Dimensions;
import com.cefalo.school.dp.builder.pattern.assignment.component.measurement.MeasurementValidator;
import com.cefalo.school.dp.builder.pattern.assignment.exception.WrongArchitectureException;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by satyajit on 10/31/16.
 */
public class Stairs extends Component implements Buildable {

  private boolean external = true;
  private Handrails handrails;

  public static class Builder {
    /*Mandatory Fields*/
    private String bType;
    private Dimensions bDimensions;
    private String bMaterials;

    /*Optional Fields*/
    private boolean bExternal;
    private Handrails bHandrails;

    public Builder(String type, Dimensions dimensions, String materials) {
      this.bType = type;
      this.bDimensions = dimensions;
      this.bMaterials = materials;
    }

    public Builder external(boolean external) {
      this.bExternal = external;
      return this;
    }

    public Builder handrails(Handrails handrails) {
      this.bHandrails = handrails;
      return this;
    }

    public Stairs build() {
      return new Stairs(this);
    }
  }

  private Stairs(Builder builder) {
    this.type = builder.bType;
    this.dimensions = builder.bDimensions;
    this.materials = builder.bMaterials;
    this.external = builder.bExternal;
    this.handrails = builder.bHandrails;
  }

  public boolean isExternal() {
    return external;
  }

  public Handrails getHandrails() {
    return handrails;
  }

  @Override
  public void details() {
    System.out.println(String.format("Type: %s.\nDimensions: %s X %s X %s.\nMaterials: %s",
        this.type, this.dimensions.getLength(), this.dimensions.getWidth(), this.dimensions.getHeight(), this.materials));

    if (handrails != null) {
      handrails.details();
    }
    System.out.println(String.format("\n%s stairs built.", external ? "External" : "Internal"));
  }

  @Override
  public void validate() throws WrongArchitectureException {
    if(StringUtils.isBlank(type)) {
      throw new WrongArchitectureException("The Stairs type must be defined.");
    }

    if(!MeasurementValidator.validateDimensions(dimensions)) {
      throw new WrongArchitectureException("The Stairs dimension is invalid.");
    }

    if(StringUtils.isBlank(materials)) {
      throw new WrongArchitectureException("The Stairs materials must be defined.");
    }

    handrails.validate();
  }
}
