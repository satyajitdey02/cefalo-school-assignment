package com.cefalo.school.dp.command.pattern.presentation;

/**
 * Created by satyajit on 10/6/2016.
 */
public class FourthDelivery implements Delivery {
  @Override
  public void nextDelivery(OverCounter counter, DeliveryType deliveryType) {
    if (DeliveryValidator.isValid(deliveryType)) {
      System.out.println("Fourth Ball Finished!");
      counter.setDelivery(new FifthDelivery());
      return;
    }

    System.out.println(deliveryType.getValue() + " Ball!");
    counter.setDelivery(this);
  }
}
