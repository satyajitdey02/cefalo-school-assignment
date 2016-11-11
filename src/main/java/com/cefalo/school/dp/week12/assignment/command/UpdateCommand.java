package com.cefalo.school.dp.week12.assignment.command;

import com.cefalo.school.dp.week12.assignment.Response.Response;
import com.cefalo.school.dp.week12.assignment.receiver.DAO;

/**
 * Created by satyajit on 11/11/2016.
 */
public class UpdateCommand implements Command {

  private DAO dao;

  public UpdateCommand(DAO dao) {
    this.dao = dao;
  }

  @Override
  public Response execute() {
    return this.dao.update();
  }

  @Override
  public Response undo() {
    return this.dao.update();
  }

  @Override
  public Response redo() {
    return this.dao.update();
  }
}
