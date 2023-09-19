package Lacos;

public class TestaComparaLacos {
  public static void main(String[] args) {
    int j = 20;
    
    while (j < 10) {
      System.out.println("while " + j);
      j++;
    }

    j = 10;

    do {
      System.out.println("do while" + j);
      j++;
    } while (j < 10);

    int[] array1 = new int[10];
    int[] array2 = new int[10];

    for (int i = 0, k = 0; i < array1.length; i++ ) {
      array1[i] = i;
      array2[i] = i+k;
    }

  
  }
}
