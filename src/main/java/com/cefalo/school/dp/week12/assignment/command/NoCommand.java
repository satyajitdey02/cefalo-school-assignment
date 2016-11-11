package com.cefalo.school.dp.week12.assignment.command;

import com.cefalo.school.dp.week12.assignment.Response.Response;
import com.cefalo.school.dp.week12.assignment.Response.Status;

import java.util.ArrayList;

/**
 * Created by satyajit on 11/11/2016.
 */
public class NoCommand implements Command {

  @Override
  public Response execute() {
    return new Response(Status.NO_STATUS, "Nothing to execute", new ArrayList<String>());
  }

  @Override
  public Response undo() {
    return new Response(Status.NO_STATUS, "Nothing to undo", new ArrayList<String>());
  }

  @Override
  public Response redo() {
    return new Response(Status.NO_STATUS, "Nothing to redo", new ArrayList<String>());
  }
}
