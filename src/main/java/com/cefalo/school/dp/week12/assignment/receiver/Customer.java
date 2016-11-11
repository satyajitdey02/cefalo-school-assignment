package com.cefalo.school.dp.week12.assignment.receiver;

/**
 * Created by satyajit on 11/11/2016.
 */
public class Customer extends Entity {

  private String email;
  private String name;
  private String address;

  public Customer() {
  }

  public Customer(String email, String name, String address) {
    this.email = email;
    this.name = name;
    this.address = address;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "{\"_class\" : \"Customer\", " +
        "\"email\" : " + (email == null ? "null" : "\"" + email + "\"") + ", " +
        "\"name\" : " + (name == null ? "null" : "\"" + name + "\"") + ", " +
        "\"address\" : " + (address == null ? "null" : "\"" + address + "\"") +
        "}";
  }
}
