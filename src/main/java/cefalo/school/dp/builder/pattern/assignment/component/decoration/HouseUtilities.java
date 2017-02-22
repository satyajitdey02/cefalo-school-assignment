package cefalo.school.dp.builder.pattern.assignment.component.decoration;

/**
 * Created by satyajit on 11/10/16.
 */
public class HouseUtilities {

  private String gas;
  private String electricity;
  private String telephone;
  private String internet;

  public static class Builder {

    private String bGas;
    private String bElectricity;
    private String bTelephone;
    private String bInternet;

    public Builder() {

    }

    public Builder gas(String gas) {
      this.bGas = gas;
      return this;
    }

    public Builder electricity(String electricity) {
      this.bElectricity = electricity;
      return this;
    }

    public Builder telephone(String telephone) {
      this.bTelephone = telephone;
      return this;
    }

    public Builder internet(String internet) {
      this.bInternet = internet;
      return this;
    }

    public HouseUtilities build() {
      return new HouseUtilities(this);
    }
  }

  private HouseUtilities(Builder builder) {
    this.gas = builder.bGas;
    this.electricity = builder.bElectricity;
    this.telephone = builder.bTelephone;
    this.internet = builder.bInternet;
  }

  public String getGas() {
    return gas;
  }

  public String getElectricity() {
    return electricity;
  }

  public String getTelephone() {
    return telephone;
  }

  public String getInternet() {
    return internet;
  }

  public void details() {
    System.out.println(String.format("\nUtilities: Gas- %s, Electricity- %s, Telephone- %s, internet- %s",
        this.gas, this.electricity, this.telephone, this.internet));
  }
}
