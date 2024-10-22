package com.br.padroesdeprojetos.templatemethod;

public class Coffee {
    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    private void addSugarAndMilk() {
        System.out.println("add Sugar And Milk");
    }

    private void pourInCup() {
        System.out.println("pour In Cup");
    }

    private void brewCoffeeGrinds() {
        System.out.println("brew Coffee Grinds");
    }

    private void boilWater() {
        System.out.println("boil Water");
    }
}
