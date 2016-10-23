package com.cefalo.school.dp.enigma;

import java.util.HashMap;

/**
 * Created by satyajit on 10/22/16.
 */
public class LeftRotor extends HashMap<Integer, Integer> {
  private Integer index;

  public LeftRotor() {
    for (int i = 1; i <= 26; i++) {
      put(i, i);
    }

    this.index = 1;
  }


  public Integer getOutput() {
    return this.get(this.index++);
  }

  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }
}
