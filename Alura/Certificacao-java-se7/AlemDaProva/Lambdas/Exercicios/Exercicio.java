package AlemDaProva.Lambdas.Exercicios;

import java.util.function.Predicate;

public class Exercicio {
  int a = 0;

  public static void main(String[] args) {
    // for (int i = 0; i < 10; i++) {
    // new Thread(() -> System.out.println(i)).start();
    // }

    new Exercicio().method(1, a -> a > 0); // A
  }

  private void method(int a, Predicate<Integer> d) {
    if (d.test(a)) { // B
      System.out.println(a);
    }
  }
}
