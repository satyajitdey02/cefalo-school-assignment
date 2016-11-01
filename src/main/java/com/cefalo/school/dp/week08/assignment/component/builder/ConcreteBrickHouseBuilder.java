package com.cefalo.school.dp.week08.assignment.component.builder;

import com.cefalo.school.dp.week08.assignment.component.basic.*;
import com.cefalo.school.dp.week08.assignment.component.complex.*;
import com.cefalo.school.dp.week08.assignment.component.measurement.Dimensions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by satyajit on 10/31/2016.
 */
public class ConcreteBrickHouseBuilder extends HouseBuilder {
  @Override
  public void buildFoundation() {
    house.setFoundation(new Foundation("Concrete Block Foundation",
        new Dimensions(300.0,100.0,75.0), "Concrete+Bricks"));
  }

  @Override
  public void buildStoreys() {
    Storey firstStorey = new Storey(1);
    firstStorey.setStairs(new Stairs("Quarter Shaped", new Dimensions(50.0, 20.0, 1.0), "Wooden"));

    List<Wall> drawingRoomWalls = new ArrayList<Wall>();

    drawingRoomWalls.add(new Wall("Drawing Room Wall-1", new Dimensions(8.0, 8.0, 10.0), "Concrete+Brick"));
    drawingRoomWalls.add(new Wall("Drawing Room Wall-2", new Dimensions(8.0, 8.0, 10.0), "Concrete+Brick"));
    drawingRoomWalls.add(new Wall("Drawing Room Wall-3", new Dimensions(8.0, 8.0, 10.0), "Concrete+Brick"));
    drawingRoomWalls.add(new Wall("Drawing Room Wall-4", new Dimensions(8.0, 8.0, 10.0), "Concrete+Brick"));
    Room drawingRoom  = new DrawingRoom(new Floor("First Storey Drawing Room Floor", new Dimensions(8.0, 8.0, 10.0), "Concrete+Brick"),
                                        new Ceiling("First Storey Drawing Room Ceil", new Dimensions(8.0, 8.0, 10.0), "Concrete+Brick"),
                                        drawingRoomWalls, "First Storey Drawing Room Fireplace");
    firstStorey.getRooms().add(drawingRoom);

    List<Wall> livingRoomWalls = new ArrayList<Wall>();
    livingRoomWalls.add(new Wall("Living Room Wall-1", new Dimensions(8.0, 8.0, 10.0), "Concrete+Brick"));
    livingRoomWalls.add(new Wall("Living Room Wall-2", new Dimensions(8.0, 8.0, 10.0), "Concrete+Brick"));
    livingRoomWalls.add(new Wall("Living Room Wall-3", new Dimensions(8.0, 8.0, 10.0), "Concrete+Brick"));
    Room livingRoom  = new LivingRoom(new Floor("First Storey Living Room Floor", new Dimensions(8.0, 8.0, 10.0), "Concrete+Brick"),
        new Ceiling("First Storey Living Room Ceil", new Dimensions(8.0, 8.0, 10.0), "Concrete+Brick"),
        livingRoomWalls, null);
    firstStorey.getRooms().add(livingRoom);

    List<Wall> diningRoomWalls = new ArrayList<Wall>();
    diningRoomWalls.add(new Wall("Dining Room Wall-1", new Dimensions(8.0, 8.0, 10.0), "Concrete+Brick"));
    diningRoomWalls.add(new Wall("Dining Room Wall-2", new Dimensions(8.0, 8.0, 10.0), "Concrete+Brick"));
    diningRoomWalls.add(new Wall("Dining Room Wall-3", new Dimensions(8.0, 8.0, 10.0), "Concrete+Brick"));
    Room diningRoom  = new DiningRoom(new Floor("First Storey Dining Room Floor", new Dimensions(8.0, 8.0, 10.0), "Concrete+Brick"),
        new Ceiling("First Storey Dining Room Ceil", new Dimensions(8.0, 8.0, 10.0), "Concrete+Brick"),
        drawingRoomWalls, "Full Cabinet");
    firstStorey.getRooms().add(diningRoom);

    List<Wall> bathRoomWalls = new ArrayList<Wall>();
    bathRoomWalls.add(new Wall("Dining Room Wall-1", new Dimensions(8.0, 8.0, 10.0), "Concrete+Brick"));
    bathRoomWalls.add(new Wall("Dining Room Wall-2", new Dimensions(8.0, 8.0, 10.0), "Concrete+Brick"));
    bathRoomWalls.add(new Wall("Dining Room Wall-3", new Dimensions(8.0, 8.0, 10.0), "Concrete+Brick"));
    Room bathRoom  = new BathRoom(new Floor("First Storey Bath Room Floor", new Dimensions(8.0, 8.0, 10.0), "Concrete+Brick"),
        new Ceiling("First Storey Bath Room Ceil", new Dimensions(8.0, 8.0, 10.0), "Concrete+Brick"),
        bathRoomWalls, "Shower", "bathtub");
    firstStorey.getRooms().add(bathRoom);
    house.getStoreys().add(firstStorey);

  }

  @Override
  public void buildRoof() {
    Roof roof = new Roof("Flat Roof", new Dimensions(200.0, 100.0, 1.0), "Concrete+Brick");
    house.setRoof(roof);
  }
}
