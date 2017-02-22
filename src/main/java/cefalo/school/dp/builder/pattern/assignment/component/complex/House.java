package cefalo.school.dp.builder.pattern.assignment.component.complex;

import cefalo.school.dp.builder.pattern.assignment.component.Buildable;
import cefalo.school.dp.builder.pattern.assignment.component.Component;
import cefalo.school.dp.builder.pattern.assignment.component.basic.Foundation;
import cefalo.school.dp.builder.pattern.assignment.component.basic.Roof;
import cefalo.school.dp.builder.pattern.assignment.component.decoration.GardenLandscape;
import cefalo.school.dp.builder.pattern.assignment.component.decoration.HouseUtilities;
import cefalo.school.dp.builder.pattern.assignment.component.decoration.Interior;
import cefalo.school.dp.builder.pattern.assignment.exception.WrongArchitectureException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by satyajit on 10/30/16.
 */
public class House extends Component implements Buildable {

  private Foundation foundation;
  private List<Storey> storeys = new ArrayList<Storey>();
  private Roof roof;

  private HouseUtilities houseUtilities;
  private Interior interior;
  private GardenLandscape gardenLandscape;


  public static class Builder {

    private Foundation bFoundation;
    private List<Storey> bStoreys = new ArrayList<Storey>();
    private Roof bRoof;

    private HouseUtilities bHouseUtilities;
    private Interior bInterior;
    private GardenLandscape bGardenLandscape;

    public Builder() {

    }

    public Builder foundation(Foundation foundation) {
      this.bFoundation = foundation;
      return this;
    }

    public Builder storey(Storey storey) {
      bStoreys.add(storey);
      return this;
    }

    public Builder storeys(List<Storey> storeys) {
      bStoreys.addAll(storeys);
      return this;
    }

    public Builder roof(Roof roof) {
      this.bRoof = roof;
      return this;
    }

    public Builder houseUtilities(HouseUtilities houseUtilities) {
      this.bHouseUtilities = houseUtilities;
      return this;
    }

    public Builder interior(Interior interior) {
      this.bInterior = interior;
      return this;
    }

    public Builder gardenLandscape(GardenLandscape gardenLandscape) {
      this.bGardenLandscape = gardenLandscape;
      return this;
    }

    public House build() {
      return new House(this);
    }
  }

  private House(Builder builder) {
    this.foundation = builder.bFoundation;
    this.storeys = builder.bStoreys;
    this.roof = builder.bRoof;
    this.houseUtilities = builder.bHouseUtilities;
    this.interior = builder.bInterior;
    this.gardenLandscape = builder.bGardenLandscape;
  }

  public Foundation getFoundation() {
    return foundation;
  }

  public List<Storey> getStoreys() {
    return storeys;
  }

  public Roof getRoof() {
    return roof;
  }

  public HouseUtilities getHouseUtilities() {
    return houseUtilities;
  }

  public Interior getInterior() {
    return interior;
  }

  public GardenLandscape getGardenLandscape() {
    return gardenLandscape;
  }

  @Override
  public void details() {
    foundation.details();
    for (Storey storey : this.storeys) {
      storey.details();
    }

    roof.details();
    houseUtilities.details();
    gardenLandscape.details();
    interior.details();

    System.out.println("\nHouse built.");
  }

  @Override
  public void validate() throws WrongArchitectureException {
    foundation.validate();
    if (this.storeys.isEmpty()) {
      throw new WrongArchitectureException("Storeys need to be defined to design a House.");
    }

    for (Storey storey : storeys) {
      storey.validate();
    }
    roof.validate();
  }
}
