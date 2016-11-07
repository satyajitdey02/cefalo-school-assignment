package com.cefalo.school.dp.week08.assignment.component.complex;

import com.cefalo.school.dp.week08.assignment.component.Buildable;
import com.cefalo.school.dp.week08.assignment.component.Component;
import com.cefalo.school.dp.week08.assignment.component.basic.Corridor;
import com.cefalo.school.dp.week08.assignment.component.basic.Stairs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by satyajit on 10/31/16.
 */
public class Storey implements Buildable {
  private int number;
  private Stairs stairs;
  private List<Room> rooms = new ArrayList<Room>();

  /*Optional Fields*/
  private Corridor corridor;
  private List<Balcony> balconies = new ArrayList<Balcony>();

  public Storey() {

  }

  public Storey(int number) {
    this.number = number;
  }

  public Storey(int number, Stairs stairs, List<Room> rooms, Corridor corridor, List<Balcony> balconies) {
    this.number = number;
    this.stairs = stairs;
    this.rooms = rooms;
    this.corridor = corridor;
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

  public Corridor getCorridor() {
    return corridor;
  }

  public void setCorridor(Corridor corridor) {
    this.corridor = corridor;
  }

  public List<Balcony> getBalconies() {
    return balconies;
  }

  public void setBalconies(List<Balcony> balconies) {
    this.balconies = balconies;
  }

  @Override
  public Component build() {
    return null;
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
