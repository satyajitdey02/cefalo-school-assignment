package cefalo.school.dp.decorator.pattern.assignment.exception;

/**
 * Created by satyajit on 11/13/16.
 */
public class InvalidShapeException extends Exception {
  public InvalidShapeException() {
    super();
  }

  public InvalidShapeException(String message) {
    super(message);
  }

  public InvalidShapeException(Throwable cause) {
    super(cause);
  }

  public InvalidShapeException(String message, Throwable cause) {
    super(message, cause);
  }
}
