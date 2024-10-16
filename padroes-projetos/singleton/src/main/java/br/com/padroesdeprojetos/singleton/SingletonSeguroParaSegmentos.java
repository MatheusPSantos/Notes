package br.com.padroesdeprojetos.singleton;

public class SingletonSeguroParaSegmentos {
    private static SingletonSeguroParaSegmentos uniqueInstance = new SingletonSeguroParaSegmentos();

    private SingletonSeguroParaSegmentos() {
    }

    public static SingletonSeguroParaSegmentos getInstance() {
        return uniqueInstance;
    }
}
