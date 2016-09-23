package com.cefalo.school.dp.week01.assignment.sort;

import com.cefalo.school.dp.week01.assignment.io.Input;
import com.cefalo.school.dp.week01.assignment.io.MergeSortIO;
import com.cefalo.school.dp.week01.assignment.io.Output;

/**
 * Created by satyajit on 9/22/2016.
 */
public class MergeSort extends DQAlgorithm {
  @Override
  protected boolean isBaseCase(Input input) {
    return (((MergeSortIO) input).getFirst() >= ((MergeSortIO) input).getLast());
  }

  @Override
  protected Output conquer(Input input) {
    return (Output) input;
  }

  @Override
  protected Input[] divide(Input input) {
    MergeSortIO io = (MergeSortIO) input;
    int first = io.getFirst();
    int last = io.getLast();
    Integer[] a = io.getArr();

    if (first < last) {
      int middle = (first + last) / 2;
      io.setMiddle(middle);
      Input[] sp = new MergeSortIO[2];
      sp[0] = new MergeSortIO(a, first, middle);
      sp[1] = new MergeSortIO(a, middle + 1, last);

      return sp;
    }

    return new Input[]{input};
  }

  @Override
  protected Output combine(Input input, Output[] outputs) {
    MergeSortIO io = (MergeSortIO) input;
    Integer[] arr = io.getArr();
    Integer[] tmpArr = new Integer[io.getArr().length];
    for (int i = io.getFirst(); i <= io.getLast(); i++) {
      tmpArr[i] = arr[i];
    }

    int i = io.getFirst();
    int j = io.getMiddle() + 1;
    int k = io.getFirst();
    while (i <= io.getMiddle() && j <= io.getLast()) {
      if (tmpArr[i] <= tmpArr[j]) {
        arr[k] = tmpArr[i];
        i++;
      } else {
        arr[k] = tmpArr[j];
        j++;
      }
      k++;
    }

    while (i <= io.getMiddle()) {
      arr[k] = tmpArr[i];
      k++;
      i++;
    }
    io.setArr(arr);

    return (Output) io;
  }
}
