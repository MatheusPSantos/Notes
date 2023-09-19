package Arrays;

public class TestaArrays {
  public static void main(String[] args) {

    int[] idades = new int[10];
    // double pesos[];
    // long[] numeros;
    // long[] tamanhos;

    System.out.println(idades[0]);

    int[] idades2 = new int[] { 0, 1, 2, 3, 4, 5 };

    System.out.println(idades2[3]);

    int[] idades3 = { 0, 1, 2, 3, 4 };
    System.out.println(idades3[3]);
    System.out.println("-----");
    for (int i = 0; i < idades3.length; i++) {
      System.out.println(idades3[i]);
    }

    System.out.println("-- for each ---");

    for (int idade : idades3) {
      System.out.println(idade);
    }


    int array[] = new int[1, 2, 3];
  }
}
