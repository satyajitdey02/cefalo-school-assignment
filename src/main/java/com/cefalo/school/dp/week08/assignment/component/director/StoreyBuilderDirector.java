package com.cefalo.school.dp.week08.assignment.component.director;

import com.cefalo.school.dp.week08.assignment.component.builder.HouseBuilder;
import com.cefalo.school.dp.week08.assignment.component.builder.StoreyBuilder;
import com.cefalo.school.dp.week08.assignment.component.complex.House;
import com.cefalo.school.dp.week08.assignment.component.complex.Storey;

/**
 * Created by satyajit on 11/1/16.
 */
public class StoreyBuilderDirector {
  private StoreyBuilder storeyBuilder;

  public void setStoreyBuilder(StoreyBuilder storeyBuilder) {
    this.storeyBuilder = storeyBuilder;
  }

  public Storey getStory() {
    return storeyBuilder.getStorey();
  }

  public void constructStorey() {
    storeyBuilder.buildNewStorey();
    storeyBuilder.buildStairs();
    storeyBuilder.buildRooms();
    storeyBuilder.buildCorridor();
    storeyBuilder.buildBalconies();
  }
}
