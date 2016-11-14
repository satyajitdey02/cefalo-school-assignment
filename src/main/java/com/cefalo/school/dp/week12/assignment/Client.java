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

  public static void main(String[] args) {
    Command createCommand = new Create(dao);
    databaseManager.setCommand(createCommand);

    databaseManager.saveRecord(new Entity("Neil deGrasse Tyson"));
    databaseManager.saveRecord(new Entity("Brian Greene"));
    databaseManager.saveRecord(new Entity("Michio Kaku"));
    databaseManager.saveRecord(new Entity("Satyajit Dey"));

    Command readCommand = new Read(dao);
    databaseManager.setCommand(readCommand);
    Map<Integer, Entity> records = databaseManager.readRecords();

    System.out.println("-------------------After saving Entities----------------");
    for (Map.Entry<Integer, Entity> entry : records.entrySet()) {
      System.out.println(entry.getValue().getId() + " : " + entry.getValue().getValue());
    }

    Entity recordToUpdate = new Entity(records.get(1));
    recordToUpdate.setValue(recordToUpdate.getValue() + "-The Legend");
    Command updateCommand = new Update(dao);
    databaseManager.setCommand(updateCommand);
    databaseManager.updateRecord(recordToUpdate);

    databaseManager.setCommand(readCommand);
    records = databaseManager.readRecords();

    System.out.println("-------------------After updating Entity----------------");
    for (Map.Entry<Integer, Entity> entry : records.entrySet()) {
      System.out.println(entry.getValue().getId() + " : " + entry.getValue().getValue());
    }

    Entity lastRecord = records.get(records.size());
    Command deleteCommand = new Delete(dao);
    databaseManager.setCommand(deleteCommand);
    databaseManager.deleteRecord(lastRecord);

    databaseManager.setCommand(readCommand);
    records = databaseManager.readRecords();

    System.out.println("-------------------After deleting Entity----------------");
    for (Map.Entry<Integer, Entity> entry : records.entrySet()) {
      System.out.println(entry.getValue().getId() + " : " + entry.getValue().getValue());
    }

    databaseManager.undoOperation();
    databaseManager.setCommand(readCommand);
    records = databaseManager.readRecords();

    System.out.println("-------------------After Undo----------------");
    for (Map.Entry<Integer, Entity> entry : records.entrySet()) {
      System.out.println(entry.getValue().getId() + " : " + entry.getValue().getValue());
    }

    databaseManager.undoOperation();
    databaseManager.setCommand(readCommand);
    records = databaseManager.readRecords();

    System.out.println("-------------------After Undo----------------");
    for (Map.Entry<Integer, Entity> entry : records.entrySet()) {
      System.out.println(entry.getValue().getId() + " : " + entry.getValue().getValue());
    }

    databaseManager.undoOperation();
    databaseManager.setCommand(readCommand);
    records = databaseManager.readRecords();

    System.out.println("-------------------After Undo----------------");
    for (Map.Entry<Integer, Entity> entry : records.entrySet()) {
      System.out.println(entry.getValue().getId() + " : " + entry.getValue().getValue());
    }

    databaseManager.undoOperation();
    databaseManager.setCommand(readCommand);
    records = databaseManager.readRecords();

    System.out.println("-------------------After Undo----------------");
    for (Map.Entry<Integer, Entity> entry : records.entrySet()) {
      System.out.println(entry.getValue().getId() + " : " + entry.getValue().getValue());
    }

    databaseManager.undoOperation();
    databaseManager.setCommand(readCommand);
    records = databaseManager.readRecords();

    System.out.println("-------------------After Undo----------------");
    for (Map.Entry<Integer, Entity> entry : records.entrySet()) {
      System.out.println(entry.getValue().getId() + " : " + entry.getValue().getValue());
    }

    databaseManager.undoOperation();
    databaseManager.setCommand(readCommand);
    records = databaseManager.readRecords();

    System.out.println("-------------------After Undo----------------");
    for (Map.Entry<Integer, Entity> entry : records.entrySet()) {
      System.out.println(entry.getValue().getId() + " : " + entry.getValue().getValue());
    }

    databaseManager.undoOperation();
    databaseManager.setCommand(readCommand);
    records = databaseManager.readRecords();

    System.out.println("-------------------After Undo----------------");
    for (Map.Entry<Integer, Entity> entry : records.entrySet()) {
      System.out.println(entry.getValue().getId() + " : " + entry.getValue().getValue());
    }

    databaseManager.redoOperation();
    databaseManager.setCommand(readCommand);
    records = databaseManager.readRecords();

    System.out.println("-------------------After Redo----------------");
    for (Map.Entry<Integer, Entity> entry : records.entrySet()) {
      System.out.println(entry.getValue().getId() + " : " + entry.getValue().getValue());
    }

    databaseManager.redoOperation();
    databaseManager.setCommand(readCommand);
    records = databaseManager.readRecords();

    System.out.println("-------------------After Redo----------------");
    for (Map.Entry<Integer, Entity> entry : records.entrySet()) {
      System.out.println(entry.getValue().getId() + " : " + entry.getValue().getValue());
    }

    databaseManager.redoOperation();
    databaseManager.setCommand(readCommand);
    records = databaseManager.readRecords();

    System.out.println("-------------------After Redo----------------");
    for (Map.Entry<Integer, Entity> entry : records.entrySet()) {
      System.out.println(entry.getValue().getId() + " : " + entry.getValue().getValue());
    }

    databaseManager.redoOperation();
    databaseManager.setCommand(readCommand);
    records = databaseManager.readRecords();

    System.out.println("-------------------After Redo----------------");
    for (Map.Entry<Integer, Entity> entry : records.entrySet()) {
      System.out.println(entry.getValue().getId() + " : " + entry.getValue().getValue());
    }

    databaseManager.redoOperation();
    databaseManager.setCommand(readCommand);
    records = databaseManager.readRecords();

    System.out.println("-------------------After Redo----------------");
    for (Map.Entry<Integer, Entity> entry : records.entrySet()) {
      System.out.println(entry.getValue().getId() + " : " + entry.getValue().getValue());
    }

    databaseManager.undoOperation();
    databaseManager.setCommand(readCommand);
    records = databaseManager.readRecords();

    System.out.println("-------------------After Undo----------------");
    for (Map.Entry<Integer, Entity> entry : records.entrySet()) {
      System.out.println(entry.getValue().getId() + " : " + entry.getValue().getValue());
    }
  }
}
