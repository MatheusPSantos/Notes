package Lacos;

public class TestaBreakContinue {
  public static void main(String[] args) {

    int i = 1;

    while (i < 10) {
      i++;
      if (i == 5) {
        break;
      } else {
        System.out.println("i = " + i);
      }
    }
    System.out.println("------------------");
    i = 1;
    while (i < 10) {
      i++;
      if (i == 5) {
        continue;
      } else {
        System.out.println("i = " + i);
      }
    }

    System.out.println("Fora do while");

    System.out.println("------------------");

    for (int j = 1; j < 10; j++) {
      if (j == 8)
        break;
      if (j == 5)
        continue;
      System.out.println(j);
    }

    externo: for (int j = 1; j < 10; j++) {
      iterno: for (int k = 1; k < 10; k ++) {
        if (j * k == 25) break externo;
        System.out.println(j + " * " + k + " = " + (j*k));
      }
    }
  }
}
