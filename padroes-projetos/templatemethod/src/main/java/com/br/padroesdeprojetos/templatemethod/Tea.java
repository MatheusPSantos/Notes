package com.br.padroesdeprojetos.templatemethod;

public class Tea {
    void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    private void addLemon() {
        System.out.println("add lemon");
    }

    private void pourInCup() {
        System.out.println("pour In Cup");
    }

    private void steepTeaBag() {
        System.out.println("steeping the tea");
    }

    private void boilWater() {
        System.out.println("boil Water");
    }
}
