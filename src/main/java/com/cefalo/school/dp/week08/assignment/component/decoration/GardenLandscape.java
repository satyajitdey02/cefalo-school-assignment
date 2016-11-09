package com.cefalo.school.dp.week08.assignment.component.decoration;

import com.cefalo.school.dp.week08.assignment.component.basic.Fence;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by satyajit on 11/10/16.
 */
public class GardenLandscape {

  private String lawn;
  private String walkWays;
  private String outdoorLighting;
  private String mailBox;
  private List<Fence> fences = new ArrayList<Fence>();

  public static class Builder {
    private String bLawn;
    private String bWalkWays;
    private String bOutdoorLighting;
    private String bMailBox;
    private List<Fence> bFences = new ArrayList<Fence>();

    public Builder() {
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

    public GardenLandscape build() {
      return new GardenLandscape(this);
    }
  }

  private GardenLandscape(Builder builder) {
    this.lawn = builder.bLawn;
    this.walkWays = builder.bWalkWays;
    this.outdoorLighting = builder.bOutdoorLighting;
    this.mailBox = builder.bMailBox;
    this.fences = builder.bFences;
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

  public void details() {
    if (StringUtils.isNoneBlank(lawn)) {
      System.out.println(String.format("Lawn: %s", lawn));
    }

    if (StringUtils.isNoneBlank(walkWays)) {
      System.out.println(String.format("WalkWays: %s", walkWays));
    }

    if (StringUtils.isNoneBlank(outdoorLighting)) {
      System.out.println(String.format("Outdoor Lighting: %s", outdoorLighting));
    }

    for(Fence fence : fences) {
      fence.details();
    }

    System.out.println("\nGarden & Landscape built.");
  }
}
