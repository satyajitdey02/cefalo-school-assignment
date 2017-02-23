package cefalo.school.dp.state.pattern.assignment;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

/**
 * Created by satyajit on 10/6/2016.
 */
public class Umpire {
  public static void main(String[] args) throws Exception {
    printBanner();
    /*Init the Over Counter*/
    OverCounter counter = new OverCounter();
    Scanner scanner = new Scanner(System.in);
    try {
      while (scanner.hasNext()) {
        String input = scanner.nextLine();
        if (StringUtils.isNotBlank(input)) {
          DeliveryType deliveryType = DeliveryType.fromString(input.trim().toUpperCase());
          if (deliveryType == null) {
            System.out.println(input + " is not a valid INPUT");
            continue;
          }
          counter.count(deliveryType);
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      scanner.close();
    }

  }

  private static void printBanner() {
    System.out.println("***Cricket Over Counter***");
    System.out.println("For counting OVER please input- ");
    System.out.println("V - For valid delivery counting.");
    System.out.println("WD - For Wide Ball Signalling.");
    System.out.println("NB - For No Ball Signalling.");
    System.out.println("WK - For giving OUT!");
    System.out.println("DB - For Dead Ball Signalling.");
  }
}
