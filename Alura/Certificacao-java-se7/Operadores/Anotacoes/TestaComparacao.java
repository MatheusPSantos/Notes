package Operadores.Anotacoes;

public class TestaComparacao {
  public static void main(String[] args) {
    System.out.println(1 == 1);
    System.out.println(1 != 1);

    System.out.println(1 == 1.0);
    System.out.println(1.0f == 1);

    System.out.println(1.0f == 1l);
    System.out.println(1l == 1.0f);

    System.out.println(true == true);
    System.out.println(false == false);
    System.out.println(true == false);
    System.out.println(true != false);
  } 
}
