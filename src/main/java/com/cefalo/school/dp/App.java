package com.cefalo.school.dp;

import com.cefalo.school.dp.week01.assignment.cli.CommandLineInterpreter;
import com.cefalo.school.dp.week01.assignment.exception.CliException;
import com.cefalo.school.dp.week01.assignment.io.Input;
import com.cefalo.school.dp.week01.assignment.io.MergeSortIO;
import com.cefalo.school.dp.week01.assignment.io.QuickSortIO;
import com.cefalo.school.dp.week01.assignment.sort.DQAlgorithm;
import com.cefalo.school.dp.week01.assignment.sort.MergeSort;
import com.cefalo.school.dp.week01.assignment.sort.QuickSort;
import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by satyajit on 9/22/2016.
 */
public class App {
  private static final String SORT_COMMAND = "sort";
  private static final String MERGE_SORT_FLAG_INPUT = "-m";
  private static final String QUICK_SORT_FLAG_INPUT = "-q";

  public static void main(String a[]) {
    printBanner();

    do {
      System.out.print("student@cefalo$");
      Scanner scanner = new Scanner(System.in);

      try {
        CommandLineInterpreter cli = new CommandLineInterpreter(scanner.nextLine());
        Integer[] data = new Integer[cli.extractData().length];
        for (int i = 0; i < cli.extractData().length; i++) {
          data[i] = Integer.parseInt((String) cli.extractData()[i]);
        }

        if (StringUtils.equalsIgnoreCase(MERGE_SORT_FLAG_INPUT, cli.extractOption())) {
          Input in = new MergeSortIO(data, 0, data.length - 1);
          DQAlgorithm template = new MergeSort();
          MergeSortIO mout = (MergeSortIO) template.solve(in);
          System.out.println("Merge Sort Output:" + Arrays.toString(mout.getArr()));
          continue;
        }

        if (StringUtils.equalsIgnoreCase(QUICK_SORT_FLAG_INPUT, cli.extractOption())) {
          Input in = new QuickSortIO(data, 0, data.length - 1);
          DQAlgorithm template = new QuickSort();
          QuickSortIO qout = (QuickSortIO) template.solve(in);
          System.out.println("Quick Sort Output:" + Arrays.toString(qout.getArr()));
          continue;
        }

        System.out.println("Invalid command!");
      } catch (CliException exp) {
        System.out.println(exp.getMessage());
      }

    } while (true);
  }

  private static void printBanner() {
    System.out.println("**Sort arrays of Integers using command**");
    System.out.println("SYNOPSIS: sort [-m] [-q] [comma separated values]");
    System.out.println("EXAMPLE: sort -m 199,3,1313,6,20,-10,23,-7");
  }
}
