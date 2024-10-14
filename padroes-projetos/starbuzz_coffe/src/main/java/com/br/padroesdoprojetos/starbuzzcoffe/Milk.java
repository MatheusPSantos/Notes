package com.br.padroesdoprojetos.starbuzzcoffe;

public class Milk extends CondimentDecorator { // Mocha é um decorador então podemos estender CondimentDecorator

    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " Milk.";
    }

    public double cost() {
        return 0.10 + beverage.cost();
    }

}
