package com.cefalo.school.dp.week12.assignment.exception;

/**
 * Created by satyajit on 11/11/2016.
 */
public class InvalidExecutionException extends Exception {

  public InvalidExecutionException() {
    super();
  }

  public InvalidExecutionException(String message) {
    super(message);
  }

  public InvalidExecutionException(String message, Throwable cause) {
    super(message, cause);
  }

  public InvalidExecutionException(Throwable cause) {
    super(cause);
  }
}
