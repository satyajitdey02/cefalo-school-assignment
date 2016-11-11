package com.cefalo.school.dp.week12.assignment.command;

import com.cefalo.school.dp.week12.assignment.Response.Response;

/**
 * Created by satyajit on 11/11/2016.
 */
public interface Command {

  public void execute();

  public void undo();

  public void redo();
}
