package com.cefalo.school.dp.week03.assignment;

/**
 * Created by satyajit on 10/6/2016.
 */
public class FirstDelivery implements Delivery {
  @Override
  public void nextDelivery(OverCounter counter, DeliveryType deliveryType) {
    if (DeliveryValidator.isValid(deliveryType)) {
      System.out.println("First Ball Finished!");
      counter.setDelivery(new SecondDelivery());
      return;
    }

    counter.setDelivery(this);
    System.out.println(deliveryType.getValue() + " Ball!");

  }
}
