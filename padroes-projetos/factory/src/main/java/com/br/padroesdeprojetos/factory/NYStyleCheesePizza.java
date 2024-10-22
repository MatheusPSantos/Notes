package com.br.padroesdeprojetos.factory;

public class NYStyleCheesePizza extends PizzaStore {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marina sauce";

        toppings.add("Grated Reggiano Cheese");
    }

    @Override
    public Pizza createPizza(String type) {
        
        System.out.println("'createPizza'");
    }

}
