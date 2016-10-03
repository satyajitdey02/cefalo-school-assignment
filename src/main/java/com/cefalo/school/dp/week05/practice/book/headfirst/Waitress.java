package com.cefalo.school.dp.week05.practice.book.headfirst;

/**
 * Created by satyajit on 9/30/2016.
 */
public class Waitress {
  MenuComponent allMenus;

  public Waitress(MenuComponent allMenus) {
    this.allMenus = allMenus;
  }

  public void printMenu() {
    allMenus.print();
  }
}
