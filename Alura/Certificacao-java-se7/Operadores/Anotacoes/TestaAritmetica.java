package Operadores.Anotacoes;

public class TestaAritmetica {
  public static void main(String[] args) {
    int dois = 2;
    int dez = 10;

    int doze = dois + dez;
    int oito  = dez - dois;
    int vinte = dez * dois;
    int cinco = dez/dois;

    int restoDaDivisaoDeCincoPorDois = cinco % dois;

    // int divisao1 = cinco/0;
  
    double divisao2 = 5.0/0;
    System.out.println(divisao2);
    System.out.println((dois + 0.0)/0);
  }
}
