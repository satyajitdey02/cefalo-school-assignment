package cefalo.school.dp.builder.pattern.assignment.builder;

import cefalo.school.dp.builder.pattern.assignment.component.basic.Foundation;
import cefalo.school.dp.builder.pattern.assignment.component.basic.Roof;
import cefalo.school.dp.builder.pattern.assignment.component.complex.House;
import cefalo.school.dp.builder.pattern.assignment.component.decoration.HouseUtilities;
import cefalo.school.dp.builder.pattern.assignment.component.measurement.Dimensions;
import cefalo.school.dp.builder.pattern.assignment.director.StoreyBuilderDirector;

/**
 * Created by satyajit on 11/10/16.
 * Steel and Glass Builder
 */
public class SGHouseBuilder extends HouseBuilder {
  @Override
  public void buildNewHouse() {
    builder = new House.Builder();
  }

  @Override
  public void buildFoundation() {
    builder.foundation(new Foundation("Concrete+Bricks+Steel Foundation",
        new Dimensions(300.0, 100.0, 75.0), "Concrete+Bricks+Steel"));
  }

  @Override
  public void buildStoreys() {
    StoreyBuilderDirector storeyBuilderDirector = new StoreyBuilderDirector();
    StoreyBuilder storeyBuilder = new SGStoreyBuilder();
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
