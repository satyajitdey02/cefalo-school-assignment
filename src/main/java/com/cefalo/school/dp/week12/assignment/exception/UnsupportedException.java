package com.cefalo.school.dp.week12.assignment.exception;

/**
 * Created by satyajit on 11/12/16.
 */
public class UnsupportedException extends Exception {
  public UnsupportedException() {
    super();
  }

  public UnsupportedException(Throwable cause) {
    super(cause);
  }

  public UnsupportedException(String message) {
    super(message);
  }

  public UnsupportedException(String message, Throwable cause) {
    super(message, cause);
  }
}
