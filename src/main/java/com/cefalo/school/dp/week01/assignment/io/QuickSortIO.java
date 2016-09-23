package com.cefalo.school.dp.week01.assignment.io;

/**
 * Created by satyajit on 9/22/2016.
 */
public class QuickSortIO implements Input, Output {
  private Integer[] arr;
  private int first, last;

  public QuickSortIO(Integer[] arr, int first, int last) {
    this.arr = arr;
    this.first = first;
    this.last = last;
  }

  public int getFirst() {
    return first;
  }

  public int getLast() {
    return last;
  }

  public Integer[] getArr() {
    return arr;
  }
}

