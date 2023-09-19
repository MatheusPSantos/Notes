package Lacos;

import java.util.ArrayList;

public class TestaFor {
  public static void main(String[] args) {

    for (int i = 1; i < 10; i++) {
      System.out.println(i);
    }
    System.out.println("------------");
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
    }

    System.out.println("-----------");

    for (int i = 0, j = 10; i < 10; i++, j--) {
      System.out.println(i + " " + j);
    }

    ArrayList<String> nomes = new ArrayList<String>();

    nomes.add("Guilherme");
    nomes.add("Mario");

    for (String nome : nomes) {
      System.out.println(nome);
    }

    System.out.println(nomes);
  }
 
}
