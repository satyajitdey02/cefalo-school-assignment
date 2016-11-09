package com.cefalo.school.dp.week08.assignment.builder;

import com.cefalo.school.dp.week08.assignment.component.basic.Foundation;
import com.cefalo.school.dp.week08.assignment.component.basic.Roof;
import com.cefalo.school.dp.week08.assignment.component.complex.House;
import com.cefalo.school.dp.week08.assignment.component.measurement.Dimensions;
import com.cefalo.school.dp.week08.assignment.director.StoreyBuilderDirector;

/**
 * Created by satyajit on 10/31/2016.
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
}
