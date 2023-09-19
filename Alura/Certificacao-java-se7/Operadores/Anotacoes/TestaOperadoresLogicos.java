package Operadores.Anotacoes;

public class TestaOperadoresLogicos {

  public static boolean metodo(String msg) {
    System.out.println(msg);
    return true;
  }

  public static void main(String[] args) {
    System.out.println(1 == 2 & metodo("oi"));
    // imprime oi, depois false
    System.out.println(1 == 2 && metodo("tchau"));
    // não imprime tchau, imprime false

    int i = 10;
    System.out.println(i == 2 & i++ == 0);
    // imprime false, soma mesmo assim
    System.out.println(i);
    // imprime 11

    int j = 10;
    System.out.println(j == 2 && j++ == 0);
    // imprime false, não soma
    System.out.println(j);
    // imprime 10
  }
}
