package com.cefalo.school.dp.week08.assignment.component.complex;

import com.cefalo.school.dp.week08.assignment.component.Component;
import com.cefalo.school.dp.week08.assignment.component.basic.Corridor;
import com.cefalo.school.dp.week08.assignment.component.basic.Stairs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by satyajit on 10/31/16.
 */
public class Storey extends Component {
  private int number;
  private Stairs stairs;
  private List<Room> rooms = new ArrayList<Room>();

  /*Optional Fields*/
  private Corridor corridor;
  private List<Balcony> balconies = new ArrayList<Balcony>();

  public static class Builder {
    /*Mandatory Fields*/
    private int bNumber;

    /*Optional Fields*/
    private Stairs bStairs;
    private List<Room> bRooms =  new ArrayList<Room>();
    private Corridor bCorridor;
    private List<Balcony> bBalconies = new ArrayList<Balcony>();

    public Builder(int number) {
      this.bNumber = number;
    }

    public Builder stairs(Stairs stairs) {
      this.bStairs = stairs;
      return this;
    }

    public Builder room(Room room) {
      this.bRooms.add(room);
      return this;
    }

    public Builder rooms(List<Room> rooms) {
      this.bRooms.addAll(rooms);
      return this;
    }

    public Builder corridor(Corridor corridor) {
      this.bCorridor = corridor;
      return this;
    }

    public Builder balcony(Balcony balcony) {
      this.bBalconies.add(balcony);
      return this;
    }

    public Builder balconies(List<Balcony> balconies) {
      this.bBalconies.addAll(balconies);
      return this;
    }

    public Storey build() {
      return new Storey(this);
    }
  }

  private Storey(Builder builder) {
    this.number = builder.bNumber;
    this.stairs = builder.bStairs;
    this.rooms = builder.bRooms;
    this.corridor = builder.bCorridor;
    this.balconies = builder.bBalconies;
  }

  public int getNumber() {
    return number;
  }

  public Stairs getStairs() {
    return stairs;
  }

  public List<Room> getRooms() {
    return rooms;
  }

  public Corridor getCorridor() {
    return corridor;
  }

  public List<Balcony> getBalconies() {
    return balconies;
  }

  @Override
  public void details() {
    for (Room room : this.rooms) {
      room.details();
    }

    if (this.corridor != null) {
      corridor.details();
    }

    for (Balcony balcony : this.balconies) {
      balcony.details();
    }

    stairs.details();
    System.out.println("\nStorey built.");
  }
}
