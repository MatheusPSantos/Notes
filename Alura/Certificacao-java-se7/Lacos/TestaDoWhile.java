package Lacos;

public class TestaDoWhile {
  public static void main(String[] args) {
    int i = 1;

    while (i < 10) {
      System.out.println(i);
      i++;
    }
    System.out.println("- ------ --- ---");
    int j = 1;

    do {
      System.out.println(j);
      j++;
    } while (j < 10);
    System.out.println("- ------ --- ---");
    int i2 = 20;

    while (i2 < 10) {
      System.out.println(i);
      i2++;
    }
    System.out.println("- ------ --- ---");
    int j2 = 20;

    do {
      System.out.println(j2);
      j2++;
    } while (j2 < 10);


    do
      System.out.println("executa");
    while(j < 10);
  }
}
