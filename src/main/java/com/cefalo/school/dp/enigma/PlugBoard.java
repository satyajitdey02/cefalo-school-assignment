package com.cefalo.school.dp.enigma;

import java.util.HashMap;

/**
 * Created by satyajit on 10/22/16.
 */
public class PlugBoard extends HashMap<Integer, Integer> {

  public PlugBoard() {
    for (int i = 1; i <= 26; i++) {
      put(i, i);
    }

  }

  public Integer getOutput(int index) {
    return this.get(index);
  }
}
