package br.com.padroesdeprojetos.singleton;

public class SingletonTravaDuplaVerificada {
    /**
     * volatile garante que vários segmentos lidem com a variável uniqueInstance
     * corretmante quando está sendo inicializada para a instância
     * SingletonTravaDuplaVerificada
     */
    private volatile static SingletonTravaDuplaVerificada uniqueInstance;

    private SingletonTravaDuplaVerificada() {
    }

    public static SingletonTravaDuplaVerificada getInstance() {
        /** Procura uma instancia e se não houver uma, insere um bloco sincronizado */
        if (uniqueInstance == null) {
            /** So sincroniza apenas na primeira vez. */
            synchronized (SingletonTravaDuplaVerificada.class) {
                if (uniqueInstance == null) {
                    /**
                     * Uma vez no bloco, verifique de novo e, se ainda for null, cria uma instância.
                     */
                    uniqueInstance = new SingletonTravaDuplaVerificada();
                }
            }
        }
        return uniqueInstance;
    }

}
