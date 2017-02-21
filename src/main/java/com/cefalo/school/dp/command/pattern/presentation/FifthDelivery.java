package com.cefalo.school.dp.command.pattern.presentation;

/**
 * Created by satyajit on 10/6/2016.
 */
public class FifthDelivery implements Delivery {
  @Override
  public void nextDelivery(OverCounter counter, DeliveryType deliveryType) {
    if (DeliveryValidator.isValid(deliveryType)) {
      System.out.println("Fifth Ball Finished!");
      counter.setDelivery(new FinalDelivery());
      return;
    }

    counter.setDelivery(this);
    System.out.println(deliveryType.getValue() + " Ball!");

  }
}
