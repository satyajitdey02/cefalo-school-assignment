package com.cefalo.school.dp.state.pattern.assignment;

/**
 * Created by satyajit on 10/6/2016.
 */
public class FinalDelivery implements Delivery {
  @Override
  public void nextDelivery(OverCounter counter, DeliveryType deliveryType) {
    if (DeliveryValidator.isValid(deliveryType)) {
      System.out.println("Over Finished!");
      counter.setDelivery(new FirstDelivery());
      return;
    }

    counter.setDelivery(this);
    System.out.println(deliveryType.getValue() + " Ball!");

  }
}
