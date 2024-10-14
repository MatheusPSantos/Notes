package com.br.padroesdoprojetos.starbuzzcoffe;

// CondimentDecorator extende Beverage
public class Mocha extends CondimentDecorator { // Mocha é um decorador então podemos estender CondimentDecorator

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " Mocha.";
    }

    public double cost() {
        return 0.20 + beverage.cost();
    }

}
