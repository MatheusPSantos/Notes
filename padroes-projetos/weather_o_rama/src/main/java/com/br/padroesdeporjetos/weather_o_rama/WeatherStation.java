package com.br.padroesdeporjetos.weather_o_rama;

public class WeatherStation {
  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();

    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

    weatherData.setMeasurements(80, 65, 34.0f);
    weatherData.setMeasurements(82, 70, 29.9f);
    weatherData.setMeasurements(79, 90, 29.2f);

  }
}
