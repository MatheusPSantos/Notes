package Lacos.Exercicios;

public class Exercicio2 {

  public static void main(String[] args) {
    fora: for (int a = 0; a < 30; a++)
      for (int b = 0; b < 1; b++)
        if (a + b == 25)
          continue fora;
        else if (a + b == 20)
          break;
        else
          System.out.println(a);
  }

}
