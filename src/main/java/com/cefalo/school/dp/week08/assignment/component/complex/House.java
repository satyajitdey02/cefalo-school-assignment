package com.cefalo.school.dp.week08.assignment.component.complex;

import com.cefalo.school.dp.week08.assignment.component.Buildable;
import com.cefalo.school.dp.week08.assignment.component.Component;
import com.cefalo.school.dp.week08.assignment.component.basic.Fence;
import com.cefalo.school.dp.week08.assignment.component.basic.Foundation;
import com.cefalo.school.dp.week08.assignment.component.basic.Roof;
import com.cefalo.school.dp.week08.assignment.component.basic.Wall;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by satyajit on 10/30/16.
 */
public class House implements Buildable {

  private Foundation foundation;
  private List<Storey> storeys = new ArrayList<Storey>();
  private Roof roof;

  /*Optional Fields*/
  private String lawn;
  private String walkWays;
  private String outdoorLighting;
  private String mailBox;
  private List<Fence> fences;

  public House() {

  }

  public House(Foundation foundation, List<Storey> storeys, Roof roof) {
    this.foundation = foundation;
    this.storeys = storeys;
    this.roof = roof;
  }

  public Foundation getFoundation() {
    return foundation;
  }

  public void setFoundation(Foundation foundation) {
    this.foundation = foundation;
  }

  public List<Storey> getStoreys() {
    return storeys;
  }

  public void setStoreys(List<Storey> storeys) {
    this.storeys = storeys;
  }

  public Roof getRoof() {
    return roof;
  }

  public void setRoof(Roof roof) {
    this.roof = roof;
  }

  public String getLawn() {
    return lawn;
  }

  public void setLawn(String lawn) {
    this.lawn = lawn;
  }

  public String getWalkWays() {
    return walkWays;
  }

  public void setWalkWays(String walkWays) {
    this.walkWays = walkWays;
  }

  public String getOutdoorLighting() {
    return outdoorLighting;
  }

  public void setOutdoorLighting(String outdoorLighting) {
    this.outdoorLighting = outdoorLighting;
  }

  public String getMailBox() {
    return mailBox;
  }

  public void setMailBox(String mailBox) {
    this.mailBox = mailBox;
  }

  public List<Fence> getFences() {
    return fences;
  }

  public void setFences(List<Fence> fences) {
    this.fences = fences;
  }

  @Override
  public Component build() {
    return null;
  }
}
