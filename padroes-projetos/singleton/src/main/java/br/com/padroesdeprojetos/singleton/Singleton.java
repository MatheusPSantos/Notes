package br.com.padroesdeprojetos.singleton;

public class Singleton {
    /* Variável estática para conter nossa instância de classe Singleton */
    public static Singleton uniqueInstance;

    /*
     * Nosso construtor é declarado particular; somente Singleton pode instanciar
     * esta classe
     */
    private Singleton() {

    }

    /**
     * Métpdp getInstance nos oferece uma maneira de instancializar a classe e
     * também de retornar uma instância dela.
     */
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;

    }
}
