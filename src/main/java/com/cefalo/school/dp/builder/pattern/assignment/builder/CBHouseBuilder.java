package com.cefalo.school.dp.builder.pattern.assignment.builder;

import com.cefalo.school.dp.builder.pattern.assignment.component.basic.Foundation;
import com.cefalo.school.dp.builder.pattern.assignment.component.basic.Roof;
import com.cefalo.school.dp.builder.pattern.assignment.component.complex.House;
import com.cefalo.school.dp.builder.pattern.assignment.component.decoration.HouseUtilities;
import com.cefalo.school.dp.builder.pattern.assignment.component.measurement.Dimensions;
import com.cefalo.school.dp.builder.pattern.assignment.director.StoreyBuilderDirector;

/**
 * Created by satyajit on 10/31/2016.
 * Concrete and Brick Builder
 */
public class CBHouseBuilder extends HouseBuilder {

  @Override
  public void buildNewHouse() {
    builder = new House.Builder();
  }

  @Override
  public void buildFoundation() {
    builder.foundation(new Foundation("Concrete Block Foundation",
        new Dimensions(300.0, 100.0, 75.0), "Concrete+Bricks"));
  }

  @Override
  public void buildStoreys() {
    StoreyBuilderDirector storeyBuilderDirector = new StoreyBuilderDirector();
    StoreyBuilder storeyBuilder = new CBStoreyBuilder();
    storeyBuilderDirector.setStoreyBuilder(storeyBuilder);
    storeyBuilderDirector.constructStorey();

    builder.storey(storeyBuilder.getStorey());
  }

  @Override
  public void buildRoof() {
    builder.roof(new Roof("Flat Roof", new Dimensions(200.0, 100.0, 1.0), "Concrete+Brick"));
  }

  @Override
  public void installUtilities() {
    builder.houseUtilities(new HouseUtilities.Builder().gas("NLG").
        electricity("Solar").telephone("T&T").internet("AOL").build());
  }
}
