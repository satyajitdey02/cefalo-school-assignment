package com.cefalo.school.dp.week12.assignment.command;

import com.cefalo.school.dp.week12.assignment.Response.Response;
import com.cefalo.school.dp.week12.assignment.receiver.DAO;

/**
 * Created by satyajit on 11/11/2016.
 */
public class CreateCommand implements Command {

  private DAO dao;

  public CreateCommand(DAO dao) {
    this.dao = dao;
  }

  @Override
  public void execute() {
    dao.save();
  }

  @Override
  public void undo() {
    dao.remove();
  }

  @Override
  public void redo() {
    dao.save();
  }
}
