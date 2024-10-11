package com.br.padroesdeporjetos.weather_o_rama;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
