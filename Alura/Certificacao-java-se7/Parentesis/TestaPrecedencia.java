package Parentesis;

public class TestaPrecedencia {
  public static void main(String[] args) {

    int i = 15 * 4 + 1;
    int b = 15 * (4 + 1);
    System.out.println(i);
    System.out.println(b);

    System.out.println(15 + 0 + "java".length());
  }
}
