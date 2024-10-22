package com.br.padroesdeprojetos.templatemethod;

public class Main {
    public static void main(String[] args) {
        
        Tea tea = new Tea();
        tea.prepareRecipe();
        
        System.out.println("------ Using template method ------");

        TeaUSingInheritance myTea = new TeaUSingInheritance();
        myTea.prepareRecipe();

    }
}