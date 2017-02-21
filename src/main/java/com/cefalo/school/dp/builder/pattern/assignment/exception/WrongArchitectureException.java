package com.cefalo.school.dp.builder.pattern.assignment.exception;

/**
 * Created by satyajit on 11/9/16.
 */
public class WrongArchitectureException extends Exception {

  public WrongArchitectureException() {
    super();
  }

  public WrongArchitectureException(String message) {
    super(message);
  }

  public WrongArchitectureException(Throwable cause) {
    super(cause);
  }

  public WrongArchitectureException(String message, Throwable cause) {
    super(message, cause);
  }

}
