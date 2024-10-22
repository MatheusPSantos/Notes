package com.br.padroesdeprojetos.facade;

public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(
                new Amplifier(),
                new Turner(),
                new DvdPlayer(),
                new CdPlayer(),
                new Projector(),
                new TheaterLights(),
                new Screen(),
                new PopcornPopper());

        homeTheater.watchMovie("The terminator");
        homeTheater.endMovie();
    }
}