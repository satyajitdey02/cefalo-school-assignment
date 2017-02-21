package com.cefalo.school.dp.builder.pattern.assignment.builder;

import com.cefalo.school.dp.builder.pattern.assignment.component.basic.Fence;
import com.cefalo.school.dp.builder.pattern.assignment.component.complex.House;
import com.cefalo.school.dp.builder.pattern.assignment.component.decoration.GardenLandscape;
import com.cefalo.school.dp.builder.pattern.assignment.component.decoration.Interior;
import com.cefalo.school.dp.builder.pattern.assignment.component.measurement.Dimensions;

/**
 * Created by satyajit on 10/31/2016.
 */
public abstract class HouseBuilder {

  protected House.Builder builder;
  protected StoreyBuilder storeyBuilder;

  public House getHouse() {
    return builder.build();
  }

  public void setStoreyBuilder(StoreyBuilder storeyBuilder) {
    this.storeyBuilder = storeyBuilder;
  }

  public abstract void buildNewHouse();

  public abstract void buildFoundation();

  public abstract void buildStoreys();

  public abstract void buildRoof();

  public abstract void installUtilities();

  public void decorateHouse() {
    builder.gardenLandscape(new GardenLandscape.Builder().lawn("Green Lawn").walkWays("Curvy Walkways")
        .outdoorLighting("White Lights").mailBox("Mail Box")
        .fence(new Fence("Wood", new Dimensions(4.0, 0.0, 3.0), "Wood"))
        .fence(new Fence("Wood", new Dimensions(4.0, 0.0, 3.0), "Wood"))
        .fence(new Fence("Wood", new Dimensions(4.0, 0.0, 3.0), "Wood"))
        .fence(new Fence("Wood", new Dimensions(4.0, 0.0, 3.0), "Wood"))
        .fence(new Fence("Wood", new Dimensions(4.0, 0.0, 3.0), "Wood"))
        .fence(new Fence("Wood", new Dimensions(4.0, 0.0, 3.0), "Wood"))
        .fence(new Fence("Wood", new Dimensions(4.0, 0.0, 3.0), "Wood")).build());

    builder.interior(new Interior.Builder().interiorColor("White").carpets("Carpets")
        .curtains("Curtains").paintings("Portrait+Landscape").lighting("Lighting").build());
  }
}
