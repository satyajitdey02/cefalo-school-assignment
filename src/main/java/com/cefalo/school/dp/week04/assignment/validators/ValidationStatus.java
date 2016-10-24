package com.cefalo.school.dp.week04.assignment.validators;

/**
 * Created by satyajit on 10/24/2016.
 */
public enum ValidationStatus {
  ERROR("Error"),
  WARNING("Warning"),
  SUCCESS("Success");

  String value;

  ValidationStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return this.value;
  }
}
