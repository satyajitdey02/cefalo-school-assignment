package com.cefalo.school.dp.week01.assignment.sort;

import com.cefalo.school.dp.week01.assignment.io.Input;
import com.cefalo.school.dp.week01.assignment.io.Output;
import com.cefalo.school.dp.week01.assignment.io.QuickSortIO;

/**
 * Created by satyajit on 9/22/2016.
 */
public class QuickSort extends DQAlgorithm {
  protected boolean isBaseCase(Input p) {
    return (((QuickSortIO) p).getFirst() >= ((QuickSortIO) p).getLast());
  }

  protected Output conquer(Input p) {
    return (Output) p;
  }

  protected Input[] divide(Input p) {
    int first = ((QuickSortIO) p).getFirst();
    int last = ((QuickSortIO) p).getLast();
    Integer[] a = ((QuickSortIO) p).getArr();
    int x = a[first]; // pivot value
    int sp = first;
    for (int i = first + 1; i <= last; i++) {
      if (a[i] < x) {
        swap(a, ++sp, i);
      }
    }
    swap(a, first, sp);
    Input[] ps = new QuickSortIO[2];
    ps[0] = new QuickSortIO(a, first, sp - 1);
    ps[1] = new QuickSortIO(a, sp + 1, last);
    return ps;
  }

  protected Output combine(Input p, Output[] ss) {
    return (Output) p;
  }

  private void swap(Integer[] a, int first, int last) {
    int temp = a[first];
    a[first] = a[last];
    a[last] = temp;
  }
}
