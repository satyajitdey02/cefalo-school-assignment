package com.cefalo.school.dp.week12.assignment.command;

import com.cefalo.school.dp.week12.assignment.Response.Response;
import com.cefalo.school.dp.week12.assignment.receiver.DAO;

/**
 * Created by satyajit on 11/11/2016.
 */
public class DeleteCommand implements Command {

  private DAO dao;

  public DeleteCommand(DAO dao) {
    this.dao = dao;
  }

  @Override
  public void execute() {
    dao.remove();
  }

  @Override
  public void undo() {
    dao.save();
  }

  @Override
  public void redo() {
    dao.remove();
  }
}
