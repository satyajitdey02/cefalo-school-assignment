package com.cefalo.school.dp.week12.assignment;

import com.cefalo.school.dp.week12.assignment.Invoker.DatabaseManager;
import com.cefalo.school.dp.week12.assignment.command.*;
import com.cefalo.school.dp.week12.assignment.receiver.DAO;

/**
 * Created by satyajit on 11/11/2016.
 */
public class Client {

  public static void main(String[] args) {
    DatabaseManager databaseManager = new DatabaseManager();

    DAO dao = new DAO();
    Command createCommand = new CreateCommand(dao);
    databaseManager.setCommand(createCommand);
    databaseManager.saveRecord();


    Command readCommand = new ReadCommand(dao);
    databaseManager.setCommand(readCommand);
    databaseManager.readRecord();

    Command updateCommand = new UpdateCommand(dao);
    databaseManager.setCommand(updateCommand);
    databaseManager.updateRecord();

    Command deleteCommand = new DeleteCommand(dao);
    databaseManager.setCommand(deleteCommand);
    databaseManager.deleteRecord();

    databaseManager.undoOperation();
    databaseManager.undoOperation();
    databaseManager.undoOperation();
    databaseManager.undoOperation();

    databaseManager.redoOperation();
    databaseManager.redoOperation();
    databaseManager.redoOperation();

  }
}
