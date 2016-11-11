package com.cefalo.school.dp.week12.assignment.command;

import com.cefalo.school.dp.week12.assignment.Response.Response;
import com.cefalo.school.dp.week12.assignment.receiver.DAO;

/**
 * Created by satyajit on 11/11/2016.
 */
public class DeleteCommand /*implements Command*/ {

  private DAO dao;

  public DeleteCommand(DAO dao) {
    this.dao = dao;
  }

 /* @Override
  public Response execute() {
    return this.dao.remove();
  }

  @Override
  public Response undo() {
    return this.dao.save();
  }

  @Override
  public Response redo() {
    return this.dao.remove();
  }*/
}
