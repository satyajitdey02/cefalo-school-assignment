package com.cefalo.school.dp.week08.assignment.builder;

import com.cefalo.school.dp.week08.assignment.component.basic.*;
import com.cefalo.school.dp.week08.assignment.director.StoreyBuilderDirector;
import com.cefalo.school.dp.week08.assignment.component.measurement.Dimensions;

/**
 * Created by satyajit on 10/31/2016.
 */
public class ConcreteBrickHouseBuilder extends HouseBuilder {

  @Override
  public void buildFoundation() {
    house.setFoundation(new Foundation("Concrete Block Foundation",
        new Dimensions(300.0, 100.0, 75.0), "Concrete+Bricks"));
  }

  @Override
  public void buildStoreys() {
    StoreyBuilderDirector storeyBuilderDirector = new StoreyBuilderDirector();
    StoreyBuilder storeyBuilder = new ConcreteBrickStoreyBuilder();
    storeyBuilderDirector.setStoreyBuilder(storeyBuilder);
    storeyBuilderDirector.constructStorey();

    house.getStoreys().add(storeyBuilder.getStorey());
  }

  @Override
  public void buildRoof() {
    Roof roof = new Roof("Flat Roof", new Dimensions(200.0, 100.0, 1.0), "Concrete+Brick");
    house.setRoof(roof);
  }
}
