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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createPizza'");
    }

}
