package cefalo.school.dp.builder.pattern.assignment.component.decoration;

/**
 * Created by satyajit on 11/10/16.
 */
public class Interior {
  private String interiorColor;
  private String paintings;
  private String carpets;
  private String curtains;
  private String lighting;

  public static class Builder {
    private String bInteriorColor;
    private String bPaintings;
    private String bCurtains;
    private String bCarpets;
    private String bLighting;

    public Builder() {
    }

    public Builder interiorColor(String interiorColor) {
      this.bInteriorColor = interiorColor;
      return this;
    }

    public Builder paintings(String paintings) {
      this.bPaintings = paintings;
      return this;
    }

    public Builder curtains(String curtains) {
      this.bCurtains = curtains;
      return this;
    }

    public Builder carpets(String carpets) {
      this.bCarpets = carpets;
      return this;
    }

    public Builder lighting(String lighting) {
      this.bLighting = lighting;
      return this;
    }

    public Interior build() {
      return new Interior(this);
    }
  }

  private Interior(Builder builder) {
    this.interiorColor = builder.bInteriorColor;
    this.paintings = builder.bPaintings;
    this.carpets = builder.bCarpets;
    this.curtains = builder.bCurtains;
    this.lighting = builder.bLighting;
  }

  public String getInteriorColor() {
    return interiorColor;
  }

  public String getPaintings() {
    return paintings;
  }

  public String getCarpets() {
    return carpets;
  }

  public String getCurtains() {
    return curtains;
  }

  public String getLighting() {
    return lighting;
  }

  public void details() {
    System.out.println(String.format("\nInterior: InteriorColor- %s, Paintings- %s, Carpets- %s, Curtains- %s, Lighting- %s",
        this.interiorColor, this.paintings, this.carpets, this.curtains, this.lighting));
  }
}
