package cefalo.school.dp.builder.pattern.assignment.component;

import cefalo.school.dp.builder.pattern.assignment.exception.WrongArchitectureException;

/**
 * Created by satyajit on 10/31/2016.
 */
public interface Buildable {
  public void details();
  public void validate() throws WrongArchitectureException;
}
