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
  public void execute() {
    this.dao.update();
  }

  @Override
  public void undo() {
    this.dao.update();
  }

  @Override
  public void redo() {
    this.dao.update();
  }
}
