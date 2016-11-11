package com.cefalo.school.dp.week12.assignment;

import com.cefalo.school.dp.week12.assignment.Invoker.DatabaseManager;
import com.cefalo.school.dp.week12.assignment.Response.Response;
import com.cefalo.school.dp.week12.assignment.command.Command;
import com.cefalo.school.dp.week12.assignment.command.CreateCommand;
import com.cefalo.school.dp.week12.assignment.command.ReadCommand;
import com.cefalo.school.dp.week12.assignment.receiver.Customer;

/**
 * Created by satyajit on 11/11/2016.
 */
public class Client {

  public static void main(String[] args) {
    DatabaseManager databaseManager = new DatabaseManager();
    Customer satyajit = new Customer("satyajit@gmail.com", "Satyajit Dey", "Dhaka");
    Customer humayun = new Customer("humayun@gmail.com", "Humayun Ahmed", "Dhaka");

    /*Command createCommand = new CreateCommand(satyajit);
    databaseManager.setCommand(createCommand);
    Response response = databaseManager.saveRecord();
    System.out.println(response.getData().toString());

    createCommand = new CreateCommand(humayun);
    databaseManager.setCommand(createCommand);
    response = databaseManager.saveRecord();
    System.out.println(response.getData().toString());*/

    //Command readCommand = new ReadCommand();
  }
}
