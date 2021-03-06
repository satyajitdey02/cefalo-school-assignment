package cefalo.school.dp.builder.pattern.assignment.component.complex;

import cefalo.school.dp.builder.pattern.assignment.exception.WrongArchitectureException;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by satyajit on 10/31/16.
 */
public class DiningRoom extends Room {

  private String cabinet;

  public static class Builder extends Room.Builder {

    private String bCabinet;

    public Builder() {
    }

    public Builder cabinet(String cabinet) {
      this.bCabinet = cabinet;
      return this;
    }

    public DiningRoom build() {
      return new DiningRoom(this);
    }
  }

  private DiningRoom(Builder builder) {
    super(builder);
    this.cabinet = builder.bCabinet;
  }

  public String getCabinet() {
    return this.cabinet;
  }

  @Override
  public void details() {
    super.details();
    System.out.println(String.format("Cabinet: %s.", cabinet));
  }

  @Override
  public void validate() throws WrongArchitectureException {
    super.validate();
    if(StringUtils.isBlank(cabinet)) {
      throw new WrongArchitectureException("Cabinet is missing in Dining room.");
    }
  }
}
