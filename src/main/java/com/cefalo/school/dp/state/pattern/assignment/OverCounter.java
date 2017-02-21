package com.cefalo.school.dp.state.pattern.assignment;

/**
 * Created by satyajit on 10/6/2016.
 */
public class OverCounter {
  private Delivery delivery;

  public OverCounter() {
    this.delivery = new FirstDelivery();
  }

  public OverCounter(Delivery delivery) {
    this.delivery = delivery;
  }

  public Delivery getDelivery() {
    return delivery;
  }

  public void setDelivery(Delivery delivery) {
    this.delivery = delivery;
  }

  public void count(DeliveryType deliveryType) {
    this.delivery.nextDelivery(this, deliveryType);
  }
}
