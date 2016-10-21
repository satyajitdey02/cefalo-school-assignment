package com.cefalo.school.dp.enigma;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by satyajit on 10/21/2016.
 */
public class Enigma {
  public static void main(String[] args) {
    Integer input = 1;
    System.out.println("input = " + input);

    Map<Integer, Integer> plugBoard = new HashMap<Integer, Integer>();
    for (int i = 1; i <= 26; i++) {
      plugBoard.put(i, i);
    }

    Map<Integer, Integer> fastestRotor = new HashMap<Integer, Integer>();
    for (int i = 1; i <= 26; i++) {
      fastestRotor.put(i, i);
    }

    Map<Integer, Integer> slowerRotor = new HashMap<Integer, Integer>();
    for (int i = 1; i <= 26; i++) {
      slowerRotor.put(i, i);
    }

    Map<Integer, Integer> slowestRotor = new HashMap<Integer, Integer>();
    for (int i = 1; i <= 26; i++) {
      slowestRotor.put(i, i);
    }

    Map<Integer, Integer> reflector = new HashMap<Integer, Integer>();
    for (int i = 1; i <= 26; i++) {
      reflector.put(i, i);
    }

    Integer outgoingPlugBoardOutput = plugBoard.get(input);
    System.out.println("outgoingPlugBoardOutput = " + outgoingPlugBoardOutput);


    Integer outgoingFastestRotorOutput = fastestRotor.get(outgoingPlugBoardOutput);
    System.out.println("outgoingFastestRotorOutput = " + outgoingFastestRotorOutput);

    Integer outgoingSlowerRotorOutput = slowerRotor.get(outgoingFastestRotorOutput);
    System.out.println("outgoingSlowerRotorOutput = " + outgoingSlowerRotorOutput);

    Integer outgoingSlowestRotorOutput = slowestRotor.get(outgoingSlowerRotorOutput);
    System.out.println("outgoingSlowestRotorOutput = " + outgoingSlowestRotorOutput);


    Integer reflectorOutput = reflector.get(outgoingSlowestRotorOutput);
    System.out.println("reflectorOutput = " + reflectorOutput);

    Integer incomingSlowestRotorOutput = slowestRotor.get(reflectorOutput);
    System.out.println("incomingSlowestRotorOutput = " + incomingSlowestRotorOutput);

    Integer incomingFasterRotorOutput = slowerRotor.get(incomingSlowestRotorOutput);
    System.out.println("incomingFasterRotorOutput = " + incomingFasterRotorOutput);

    Integer incomingFastestRotorOutput = fastestRotor.get(incomingFasterRotorOutput);
    System.out.println("incomingFastestRotorOutput = " + incomingFastestRotorOutput);

    Integer output = plugBoard.get(incomingFastestRotorOutput);
    System.out.println("output = " + output);
  }
}
