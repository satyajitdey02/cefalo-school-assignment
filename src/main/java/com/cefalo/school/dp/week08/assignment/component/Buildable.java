package com.cefalo.school.dp.week08.assignment.component;

import com.cefalo.school.dp.week08.assignment.exception.WrongArchitectureException;

/**
 * Created by satyajit on 10/31/2016.
 */
public interface Buildable {
  public void details();
  public void validate() throws WrongArchitectureException;
}
