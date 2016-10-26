package com.cefalo.school.dp.observer.pattern.practice.headfirst;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by satyajit on 10/26/2016.
 */
public class WeatherData implements Subject {
  private List<Observer> observers = new ArrayList<Observer>();
  private float temperature;
  private float humidity;
  private float pressure;

  @Override
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    for (Observer o : observers) {
      o.update(this.temperature, this.humidity, this.pressure);
    }
  }

  public void measurementsChanged() {
    notifyObservers();
  }

  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;

    measurementsChanged();
  }
}
