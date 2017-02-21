package com.cefalo.school.dp.template.method.assignment.io;

/**
 * Created by satyajit on 9/22/2016.
 */
public class MergeSortIO implements Input, Output {
  private Integer[] arr, tmpArr;
  private int first, middle, last;

  public MergeSortIO(Integer[] arr, int first, int last) {
    this.arr = arr;
    this.tmpArr = new Integer[] {};
    this.first = first;
    this.last = last;
    this.middle = (first + last) / 2;
  }

  public MergeSortIO(Integer[] arr, int first, int middle, int last) {
    this.arr = arr;
    this.first = first;
    this.middle = middle;
    this.last = last;
  }

  public MergeSortIO(Integer[] arr, Integer[] tmpArr, int first, int middle, int last) {
    this.arr = arr;
    this.tmpArr = tmpArr;
    this.first = first;
    this.middle = middle;
    this.last = last;
  }

  public Integer[] getArr() {
    return arr;
  }

  public void setArr(Integer[] arr) {
    this.arr = arr;
  }

  public Integer[] getTmpArr() {
    return tmpArr;
  }

  public void setTmpArr(Integer[] tmpArr) {
    this.tmpArr = tmpArr;
  }

  public int getFirst() {
    return first;
  }

  public void setFirst(int first) {
    this.first = first;
  }

  public int getMiddle() {
    return middle;
  }

  public void setMiddle(int middle) {
    this.middle = middle;
  }

  public int getLast() {
    return last;
  }

  public void setLast(int last) {
    this.last = last;
  }
}
