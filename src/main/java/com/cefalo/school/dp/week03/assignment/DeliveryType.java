package com.cefalo.school.dp.week03.assignment;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by satyajit on 10/6/2016.
 */
public enum DeliveryType {
  VALID("V"), WIDE("WD"), NO_BALL("NB"), WICKET("WK"), DEAD_BALL("DB");

  String value;

  DeliveryType(String value) {
    this.value = value;
  }

  public String getValue() {
    return this.value;
  }

  public static DeliveryType fromString(String value) {
    if (StringUtils.isNotBlank(value)) {
      for (DeliveryType dt : DeliveryType.values()) {
        if (value.equalsIgnoreCase(dt.value)) {
          return dt;
        }
      }
    }

    return null;
  }
}
