package com.br.padroesdeprojetos.facade;

public class Amplifier {

    public void on() {
        
        System.out.println("Amplifier on");
    }

    public void setDvd(DvdPlayer dvd) {
        
        System.out.println("Amplifier setDvd");
    }

    public void setSurroundSound() {
        
        System.out.println("Amplifier setSurroundSound");
    }

    public void setVolume(int i) {
        
        System.out.println("Amplifier set volume to " + i);
    }

    public void off() {
        
        System.out.println("Amplifier off");
    }

}
