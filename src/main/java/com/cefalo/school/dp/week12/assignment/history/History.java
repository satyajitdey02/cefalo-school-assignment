package com.cefalo.school.dp.week12.assignment.history;

import com.cefalo.school.dp.week12.assignment.entity.Entity;

import java.util.Stack;

/**
 * Created by satyajit on 11/12/16.
 */
public class History<T extends Entity> extends Stack<HistoricalData<T>> {

  public History() {
  }

  public void pushHistory(HistoricalData<T> data) {
    push(data);
  }

  public HistoricalData<T> popHistory() {
    return pop();
  }
}
