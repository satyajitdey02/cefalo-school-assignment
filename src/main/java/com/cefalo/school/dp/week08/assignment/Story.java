package com.cefalo.school.dp.week08.assignment;

import com.cefalo.school.dp.week08.assignment.component.Stairs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by satyajit on 10/31/16.
 */
public class Story {
  private int number;
  private Stairs stairs;
  private List<Room> rooms = new ArrayList<Room>();
  private List<Balcony> balconies = new ArrayList<Balcony>();

  public Story(int number) {
    this.number = number;
  }

  public Story(int number, Stairs stairs, List<Room> rooms, List<Balcony> balconies) {
    this.number = number;
    this.stairs = stairs;
    this.rooms = rooms;
    this.balconies = balconies;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public Stairs getStairs() {
    return stairs;
  }

  public void setStairs(Stairs stairs) {
    this.stairs = stairs;
  }

  public List<Room> getRooms() {
    return rooms;
  }

  public void setRooms(List<Room> rooms) {
    this.rooms = rooms;
  }

  public List<Balcony> getBalconies() {
    return balconies;
  }

  public void setBalconies(List<Balcony> balconies) {
    this.balconies = balconies;
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
