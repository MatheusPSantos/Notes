package br.com.padroesdeprojetos.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Teste t = Teste.build();
    }
}


class Teste {
    private Teste() {
        System.out.println("Teste");
    }

    public static Teste build() {
        return new Teste();
    }
}