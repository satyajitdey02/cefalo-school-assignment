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
    for (Map.Entry<Integer, Entity> entry : records.entrySet()) {
      System.out.println(entry.getValue().getId() + " : " + entry.getValue().getValue());
    }

    System.out.println("--------------------------------");

    Entity firstRecord = records.get(1);
    firstRecord.setValue(firstRecord.getValue() + "-The Legend");
    Command updateCommand = new Update(dao);
    databaseManager.setCommand(updateCommand);
    firstRecord = databaseManager.updateRecord(firstRecord);
    System.out.println(firstRecord.getId() + " : " + firstRecord.getValue());

    System.out.println("--------------------------------");

    Entity lastRecord = records.get(records.size());
    Command deleteCommand = new Delete(dao);
    databaseManager.setCommand(deleteCommand);
    databaseManager.deleteRecord(lastRecord);

    databaseManager.setCommand(readCommand);
    records = databaseManager.readRecords();
    for (Map.Entry<Integer, Entity> entry : records.entrySet()) {
      System.out.println(entry.getValue().getId() + " : " + entry.getValue().getValue());
    }

    System.out.println("--------------------------------");
    databaseManager.undoOperation();

    databaseManager.setCommand(readCommand);
    records = databaseManager.readRecords();
    for (Map.Entry<Integer, Entity> entry : records.entrySet()) {
      System.out.println(entry.getValue().getId() + " : " + entry.getValue().getValue());
    }

    System.out.println("--------------------------------");
    databaseManager.undoOperation();

    databaseManager.setCommand(readCommand);
    records = databaseManager.readRecords();
    for (Map.Entry<Integer, Entity> entry : records.entrySet()) {
      System.out.println(entry.getValue().getId() + " : " + entry.getValue().getValue());
    }
  }
}
