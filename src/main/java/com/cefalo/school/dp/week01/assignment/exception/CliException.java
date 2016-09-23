package com.cefalo.school.dp.week01.assignment.exception;

/**
 * Created by satyajit on 9/22/2016.
 */
public class CliException extends Exception {
  public CliException() {
    super();
  }

  public CliException(Throwable cause) {
    super(cause);
  }

  public CliException(String message) {
    super(message);
  }

  public CliException(String message, Throwable cause) {
    super(message, cause);
  }
}
