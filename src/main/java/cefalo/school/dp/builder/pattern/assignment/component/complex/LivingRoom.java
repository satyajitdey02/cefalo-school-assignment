package cefalo.school.dp.builder.pattern.assignment.component.complex;

/**
 * Created by satyajit on 10/31/2016.
 */
public class LivingRoom extends Room {

  public static class Builder extends Room.Builder {

    public Builder() {

    }

    public LivingRoom build() {
      return new LivingRoom(this);
    }
  }

  private LivingRoom(Builder builder) {
    super(builder);
  }
}
