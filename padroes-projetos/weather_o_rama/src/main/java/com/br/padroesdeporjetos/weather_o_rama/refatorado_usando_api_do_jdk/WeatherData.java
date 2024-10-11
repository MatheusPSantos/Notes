package com.br.padroesdeporjetos.weather_o_rama.refatorado_usando_api_do_jdk;

import java.util.Observable;

public class WeatherData extends Observable {
  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherData() {
  }

  public void measurementsChanged() {
    setChanged();
    notifyObservers();
  }

  public void setMeasurements(float temp, float humidity, float press) {
    this.temperature = temp;
    this.humidity = humidity;
    this.pressure = press;

    this.measurementsChanged();
  }

  public float getPressure() {
    return pressure;
  }

  public float getTemperature() {
    return temperature;
  }

  public float getHumidity() {
    return humidity;
  }

}
