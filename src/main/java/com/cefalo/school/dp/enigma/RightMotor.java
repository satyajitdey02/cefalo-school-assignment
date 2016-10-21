package com.cefalo.school.dp.enigma;

import java.util.HashMap;

/**
 * Created by satyajit on 10/21/2016.
 */
public class RightMotor extends HashMap<Integer, Integer> {
  private Integer index;

  public RightMotor() {
    for (int i = 1; i <= 26; i++) {
      put(i, i);
    }
  }

  public Integer getOutput() {
    return this.get(this.index);
  }

  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }
}
