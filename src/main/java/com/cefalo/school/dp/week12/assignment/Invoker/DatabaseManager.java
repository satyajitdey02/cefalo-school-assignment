package com.cefalo.school.dp.week12.assignment.Invoker;

import com.cefalo.school.dp.week12.assignment.Response.Response;
import com.cefalo.school.dp.week12.assignment.Response.Status;
import com.cefalo.school.dp.week12.assignment.command.Command;
import com.cefalo.school.dp.week12.assignment.command.NoCommand;

import java.util.Stack;

/**
 * Created by satyajit on 11/11/2016.
 */
public class DatabaseManager {

  private Command command;
  private Command noCommand = new NoCommand();

  private Stack<Command> undoCommands = new Stack<Command>();
  private Stack<Command> redoCommands = new Stack<Command>();

  public DatabaseManager() {
    initUndoRedoCommand();
  }

  public DatabaseManager(Command command) {
    this.command = command;
    initUndoRedoCommand();
  }

  private void initUndoRedoCommand() {
    undoCommands.push(noCommand);
    redoCommands.push(noCommand);
  }

  public void setCommand(Command command) {
    this.command = command;
  }

  public Response saveRecord() {
    Response response = command.execute();
    undoCommands.push(command);

    return response;
  }

  public Response readRecord() {
    Response response = command.execute();
    undoCommands.push(command);

    return response;
  }

  public Response updateRecord() {
    Response response = command.execute();
    undoCommands.push(command);

    return response;
  }

  public Response deleteRecord() {
    Response response = command.execute();
    undoCommands.push(command);

    return response;
  }

  public Response undoOperation() {
    if (undoCommands.empty()) {
      undoCommands.push(noCommand);
    }

    Command command = undoCommands.pop();
    Response response = command.undo();

    if (response.getStatus() == Status.SUCCESS) {
      redoCommands.push(command);
    }

    return response;
  }

  public Response redoOperation() {
    if (redoCommands.empty()) {
      redoCommands.push(noCommand);
    }

    Command command = redoCommands.pop();
    Response response = command.redo();

    if (response.getStatus() == Status.SUCCESS) {
      undoCommands.push(command);
    }

    return response;
  }
}
