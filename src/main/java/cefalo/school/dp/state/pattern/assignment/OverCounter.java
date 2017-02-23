package cefalo.school.dp.state.pattern.assignment;

/**
 * Created by satyajit on 10/6/2016.
 */
public class OverCounter {
  private Delivery delivery;

  public OverCounter() {
    this.delivery = new FirstDelivery();
  }

  public void setDelivery(Delivery delivery) {
    this.delivery = delivery;
  }

  public void count(DeliveryType deliveryType) {
    this.delivery.nextDelivery(this, deliveryType);
  }
}
