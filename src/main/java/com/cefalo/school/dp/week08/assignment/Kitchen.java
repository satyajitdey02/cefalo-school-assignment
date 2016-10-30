package com.cefalo.school.dp.week08.assignment;

import com.cefalo.school.dp.week08.assignment.component.Ceiling;
import com.cefalo.school.dp.week08.assignment.component.Floor;
import com.cefalo.school.dp.week08.assignment.component.Wall;

import java.util.List;

/**
 * Created by satyajit on 10/31/16.
 */
public class Kitchen extends Room {
  public Kitchen(Floor floor, Ceiling ceiling, List<Wall> walls) {
    super(floor, ceiling, walls);
  }
}
