package Strings;

public class TestaComparacaoStrings {
  public static void main(String[] args) {
    String nome1 = new String("Java");
    String nome2 = new String("Java");

    System.out.println(nome1 == nome2);

    String nome3 = "Java";
    String nome4 = "Java";
    System.out.println(nome3 == nome4);
    System.out.println(nome1.equals(nome2));
    System.out.println(nome1.equals(nome4));

    String a = "a";
    String ab = "a" + "b";
    String ab2 = a + "b";
    System.out.println(ab == "ab");
    System.out.println(ab2 == "ab");

    String texto = "um texto qualquer";
    String txt = texto.substring(3, 8);
    System.out.println(txt == "texto");
    System.out.println(texto.toLowerCase() == texto);
    System.out.println(texto.toString() == texto);
  }
}
