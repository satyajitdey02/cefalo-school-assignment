package com.cefalo.school.dp.observer.pattern.practice.headfirst;

/**
 * Created by satyajit on 10/26/2016.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
  private float temperature;
  private float humidity;
  private Subject weatherData;

  public CurrentConditionsDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void display() {
    System.out.println("temperature = " + temperature + ", humidity: " + humidity + "%");
  }

  @Override
  public void update(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    display();
  }
}
