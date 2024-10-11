package com.br.padroesdeporjetos.weather_o_rama.refatorado_usando_api_do_jdk;

import java.util.Observable;
import java.util.Observer;

import com.br.padroesdeporjetos.weather_o_rama.DisplayElement;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
  Observable observable;
  private float temperature;
  private float humidity;

  public CurrentConditionsDisplay(Observable observable) {
    this.observable = observable;
    observable.addObserver(this);
  }


  @Override
  public void display() {
      System.out.println("Current conditions: " + temperature + "F degree and " + humidity + "% humidity");
  }

  @Override
  public void update(Observable obs, Object arg) {
    if (obs instanceof WeatherData) {
      WeatherData weatherData = (WeatherData) obs;
      this.temperature = weatherData.getTemperature();
      this.humidity = weatherData.getHumidity();
      display();
    }
  }

  
}
