package com.cefalo.school.dp.state.pattern.assignment;

/**
 * Created by satyajit on 10/6/2016.
 */
public class ThirdDelivery implements Delivery {
  @Override
  public void nextDelivery(OverCounter counter, DeliveryType deliveryType) {
    if (DeliveryValidator.isValid(deliveryType)) {
      System.out.println("Third Ball Finished!");
      counter.setDelivery(new FourthDelivery());
      return;
    }

    System.out.println(deliveryType.getValue() + " Ball!");
    counter.setDelivery(this);

  }
}
