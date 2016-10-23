package com.cefalo.school.dp.week04.assignment.fx.models;

/**
 * Created by satyajit on 10/24/16.
 */
public class FxComboItem {
  private int key;
  private String value;

  public FxComboItem(int key, String value) {
    this.key = key;
    this.value = value;
  }

  public int getKey() {
    return key;
  }

  public void setKey(int key) {
    this.key = key;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
