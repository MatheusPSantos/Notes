package com.br.padroesdeprojetos.templatemethod;

public class CoffeUsingInheritance extends CaffeineBeverage {
    public void brew() {
        System.out.println("Dripping Coffe through filter");
    }

    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
