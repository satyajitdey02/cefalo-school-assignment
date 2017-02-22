package cefalo.school.dp.observer.pattern.practice.headfirst;

/**
 * Created by satyajit on 10/26/2016.
 */
public interface Subject {
  public void registerObserver(Observer observer);
  public void removeObserver(Observer observer);
  public void notifyObservers();
}
