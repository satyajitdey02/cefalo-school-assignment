package com.cefalo.school.dp.command.pattern.presentation;

/**
 * Created by satyajit on 10/6/2016.
 */
public interface Delivery {
  void nextDelivery(OverCounter counter, DeliveryType deliveryType);
}
