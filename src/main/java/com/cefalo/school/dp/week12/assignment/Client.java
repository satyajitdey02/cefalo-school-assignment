package com.cefalo.school.dp.week12.assignment;

import com.cefalo.school.dp.week12.assignment.Invoker.DatabaseManager;
import com.cefalo.school.dp.week12.assignment.command.*;
import com.cefalo.school.dp.week12.assignment.entity.Entity;
import com.cefalo.school.dp.week12.assignment.receiver.DAO;

import java.util.Map;

/**
 * Created by satyajit on 11/11/2016.
 */
public class Client {
  private static final DatabaseManager databaseManager = new DatabaseManager();
  private static final DAO dao = new DAO();
  private static final Command readCommand = new Read(dao);

  private static Map<Integer, Entity> records = null;

  public static void main(String[] args) {
    Command createCommand = new Create(dao);
    databaseManager.setCommand(createCommand);
    databaseManager.saveRecord(new Entity("Neil deGrasse Tyson"));
    databaseManager.saveRecord(new Entity("Brian Greene"));
    databaseManager.saveRecord(new Entity("Michio Kaku"));
    databaseManager.saveRecord(new Entity("Satyajit Dey"));
    printRecords("Four entities saved");

    Entity recordToUpdate = new Entity(records.get(1));//Copy constructor to clone Entity Object
    recordToUpdate.setValue(recordToUpdate.getValue() + "-The Legend");
    Command updateCommand = new Update(dao);
    databaseManager.setCommand(updateCommand);
    databaseManager.updateRecord(recordToUpdate);
    printRecords("Update");

    Entity lastRecord = records.get(records.size());
    Command deleteCommand = new Delete(dao);
    databaseManager.setCommand(deleteCommand);
    databaseManager.deleteRecord(lastRecord);
    printRecords("Delete");

    databaseManager.undoOperation();
    printRecords("Undo");

    databaseManager.undoOperation();
    printRecords("Undo");

    databaseManager.undoOperation();
    printRecords("Undo");

    databaseManager.undoOperation();
    printRecords("Undo");

    databaseManager.undoOperation();
    printRecords("Undo");

    databaseManager.undoOperation();
    printRecords("Undo");

    databaseManager.undoOperation();
    printRecords("Undo");

    databaseManager.redoOperation();
    printRecords("Redo");

    databaseManager.redoOperation();
    printRecords("Redo");

    databaseManager.redoOperation();
    printRecords("Redo");

    databaseManager.redoOperation();
    printRecords("Redo");

    databaseManager.redoOperation();
    printRecords("Redo");

    databaseManager.undoOperation();
    printRecords("Undo");
  }

  private static void printRecords(String operation) {
    databaseManager.setCommand(readCommand);
    records = databaseManager.readRecords();

    System.out.println(String.format("-------------------%s----------------", operation));
    for (Map.Entry<Integer, Entity> entry : records.entrySet()) {
      System.out.println(entry.getValue().getId() + " : " + entry.getValue().getValue());
    }
  }
}
