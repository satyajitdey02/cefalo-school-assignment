package com.cefalo.school.dp.week12.assignment.command;

import com.cefalo.school.dp.week12.assignment.Response.Response;
import com.cefalo.school.dp.week12.assignment.receiver.DAO;

/**
 * Created by satyajit on 11/11/2016.
 */
public class ReadCommand implements Command {

  private DAO dao;

  public ReadCommand(DAO dao) {
    this.dao = dao;
  }

  @Override
  public Response execute() {
    return this.dao.find();
  }

  @Override
  public Response undo() {
    return new NoCommand().undo();
  }

  @Override
  public Response redo() {
    return new NoCommand().redo();
  }
}
