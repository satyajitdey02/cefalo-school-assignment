package cefalo.school.dp.state.pattern.assignment;

/**
 * Created by satyajit on 10/6/2016.
 */
public class DeliveryValidator {
  public static boolean isValid(DeliveryType deliveryType) {
    return deliveryType == DeliveryType.VALID || deliveryType == DeliveryType.WICKET;
  }
}
