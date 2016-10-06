package com.cefalo.school.dp.week03.assignment;

import org.apache.commons.lang.StringUtils;

import java.util.Scanner;

/**
 * Created by satyajit on 10/6/2016.
 */
public class Umpire {
  public static void main(String[] args) {
    printBanner();
    /*Init the Over Counter*/
    OverCounter counter = new OverCounter();

    do {
      System.out.print("INPUT: ");
      try {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (StringUtils.isNotBlank(input)) {
          DeliveryType deliveryType = DeliveryType.fromString(input.trim());
          if (deliveryType == null) {
            System.out.println(input + " is not a valid INPUT");
            continue;
          }

          counter.count(deliveryType);
        }
      } catch (Exception exp) {
        exp.printStackTrace();
      }
    } while (true);
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
