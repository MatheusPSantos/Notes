package com.br.padroesdeporjetos.weather_o_rama;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
