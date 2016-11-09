package com.cefalo.school.dp.week08.assignment.component.complex;

import com.cefalo.school.dp.week08.assignment.exception.WrongArchitectureException;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by satyajit on 10/31/16.
 */
public class BathRoom extends Room {

  private String shower;
  private String bathtub;

  public static class Builder extends Room.Builder {

    private String bShower;
    private String bBathtub;

    public Builder() {
    }

    public Builder shower(String shower) {
      this.bShower = shower;
      return this;
    }

    public Builder bathtub(String bathtub) {
      this.bBathtub = bathtub;
      return this;
    }

    public BathRoom build() {
      return new BathRoom(this);
    }
  }

  private BathRoom(Builder builder) {
    super(builder);
    this.shower = builder.bShower;
    this.bathtub = builder.bBathtub;
  }

  public String getShower() {
    return shower;
  }

  public String getBathtub() {
    return bathtub;
  }

  @Override
  public void details() {
    super.details();
    System.out.println(String.format("Shower: %s. Bathtub: %s.", shower, bathtub));
  }

  @Override
  public void validate() throws WrongArchitectureException {
    super.validate();
    if(StringUtils.isBlank(shower) && StringUtils.isBlank(bathtub)) {
      throw new WrongArchitectureException("At least one shower or bathtub need to be placed in a bathroom");
    }
  }
}
