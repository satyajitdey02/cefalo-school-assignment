package com.cefalo.school.dp.week12.assignment.command;

import com.cefalo.school.dp.week12.assignment.Response.Response;
import com.cefalo.school.dp.week12.assignment.Response.Status;

import java.util.ArrayList;

/**
 * Created by satyajit on 11/11/2016.
 */
public class NoCommand implements Command {

  @Override
  public void execute() {
    System.out.println("Nothing to execute.");
  }

  @Override
  public void undo() {
    System.out.println("Nothing to undo.");
  }

  @Override
  public void redo() {
    System.out.println("Nothing to redo.");
  }
}
