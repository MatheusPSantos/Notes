package Lacos.Exercicios;

public class Exercicio3 {

  public static void main(String[] args) {
    int a = args.length;
    int i = 0;
    switch (a) {
      case 0:
      case 1:
        for (i = 0; i < 15; i++, System.out.println(i))
          if (i == 5)
            continue;
        if (i == 15)
          break;
      case 2:
        System.out.println("2");
    }
    System.out.println("fim");
  }
}
