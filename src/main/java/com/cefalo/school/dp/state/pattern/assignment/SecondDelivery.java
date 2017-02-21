package com.cefalo.school.dp.state.pattern.assignment;

/**
 * Created by satyajit on 10/6/2016.
 */
public class SecondDelivery implements Delivery {
  @Override
  public void nextDelivery(OverCounter counter, DeliveryType deliveryType) {
    if (DeliveryValidator.isValid(deliveryType)) {
      System.out.println("Second Ball Finished!");
      counter.setDelivery(new ThirdDelivery());
      return;
    }

    System.out.println(deliveryType.getValue() + " Ball!");
    counter.setDelivery(this);

  }
}
