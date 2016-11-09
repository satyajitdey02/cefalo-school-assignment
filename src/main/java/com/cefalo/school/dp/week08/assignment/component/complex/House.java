package com.cefalo.school.dp.week08.assignment.component.complex;

import com.cefalo.school.dp.week08.assignment.component.Buildable;
import com.cefalo.school.dp.week08.assignment.component.Component;
import com.cefalo.school.dp.week08.assignment.component.basic.*;
import com.cefalo.school.dp.week08.assignment.exception.WrongArchitectureException;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by satyajit on 10/30/16.
 */
public class House extends Component implements Buildable {

  private Foundation foundation;
  private List<Storey> storeys = new ArrayList<Storey>();
  private Roof roof;

  private String lawn;
  private String walkWays;
  private String outdoorLighting;
  private String mailBox;
  private List<Fence> fences = new ArrayList<Fence>();

  public static class Builder {

    private Foundation bFoundation;
    private List<Storey> bStoreys = new ArrayList<Storey>();
    private Roof bRoof;

    private String bLawn;
    private String bWalkWays;
    private String bOutdoorLighting;
    private String bMailBox;
    private List<Fence> bFences = new ArrayList<Fence>();

    public Builder() {

    }

    public Builder foundation(Foundation foundation) {
      this.bFoundation = foundation;
      return this;
    }

    public Builder storey(Storey storey) {
      bStoreys.add(storey);
      return this;
    }

    public Builder storeys(List<Storey> storeys) {
      bStoreys.addAll(storeys);
      return this;
    }

    public Builder roof(Roof roof) {
      this.bRoof = roof;
      return this;
    }

    public Builder lawn(String lawn) {
      this.bLawn = lawn;
      return this;
    }

    public Builder walkWays(String walkWays) {
      this.bWalkWays = walkWays;
      return this;
    }

    public Builder outdoorLighting(String outdoorLighting) {
      this.bOutdoorLighting = outdoorLighting;
      return this;
    }

    public Builder mailBox(String mailBox) {
      this.bMailBox = mailBox;
      return this;
    }

    public Builder fence(Fence fence) {
      this.bFences.add(fence);
      return this;
    }

    public Builder fences(List<Fence> fences) {
      this.bFences.addAll(fences);
      return this;
    }

    public House build() {
      return new House(this);
    }
  }

  private House(Builder builder) {
    this.foundation = builder.bFoundation;
    this.storeys = builder.bStoreys;
    this.roof = builder.bRoof;
    this.lawn = builder.bLawn;
    this.walkWays = builder.bWalkWays;
    this.outdoorLighting = builder.bOutdoorLighting;
    this.mailBox = builder.bMailBox;
    this.fences = builder.bFences;
  }

  public Foundation getFoundation() {
    return foundation;
  }

  public List<Storey> getStoreys() {
    return storeys;
  }

  public Roof getRoof() {
    return roof;
  }

  public String getLawn() {
    return lawn;
  }

  public String getWalkWays() {
    return walkWays;
  }

  public String getOutdoorLighting() {
    return outdoorLighting;
  }

  public String getMailBox() {
    return mailBox;
  }

  public List<Fence> getFences() {
    return fences;
  }

  @Override
  public void details() {
    foundation.details();
    for (Storey storey : this.storeys) {
      storey.details();
    }

    roof.details();
    if (StringUtils.isNoneBlank(lawn)) {
      System.out.println(String.format("Lawn: %s", lawn));
    }

    if (StringUtils.isNoneBlank(walkWays)) {
      System.out.println(String.format("WalkWays: %s", walkWays));
    }

    if (StringUtils.isNoneBlank(outdoorLighting)) {
      System.out.println(String.format("Outdoor Lighting: %s", outdoorLighting));
    }

    System.out.println("\nHouse built.");
  }

  @Override
  public void validate() throws WrongArchitectureException {
    foundation.validate();
    if (this.storeys.isEmpty()) {
      throw new WrongArchitectureException("Storeys need to be defined to design a House.");
    }

    for (Storey storey : storeys) {
      storey.validate();
    }
    roof.validate();
  }
}
