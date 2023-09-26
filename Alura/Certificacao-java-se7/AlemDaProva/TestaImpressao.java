package AlemDaProva;

public class TestaImpressao {

  // sobrescrevendo o metodo toString
  public String toString() {
    return "Um objeto do tipo TestaImpressa";
  }

  public static void main(String[] args) {
    // forma mais simples de impressao em java
    System.out.print(2);
    System.out.println(2);
    System.out.print(new TestaImpressao());

    System.out.print(new int[10]);
    // excessao a regra de chamar o toString é chamar um array de char
    System.out.println(new char[10]);

    char[] letras = { 'a', 'b', 'c' };
    System.out.println(letras);
    System.out.println("Foo");
    System.out.println("Bar");

    System.out.format("Hello %s, have a nice day.", "Mario");
    System.out.printf("%b %n", false);
    System.out.printf("%d %n", 42);
    System.out.printf("%f %n", 45.7);
    System.out.printf("%c %n", 88);

    // saida sera "World e World"
    System.out.format("%2$s e %2$s\n", "Hello", "World");
    // saida tera quatidade minima "[ 34]"
    System.out.format("[%5d]%n", 34);
    System.out.format("[%5s]%n", "Java is beutiful");

    // alinhar para esquerda
    System.out.format("[%-5d]%n", 90);
    // completar com 0
    System.out.format("[%05d]%n", 44);
    // seperador de milhar
    System.out.format("%,f%n", 3424312312312312.12312312);
    // saida será "123,2231"
    System.out.format("%.4f%n", 123.22312312);
    System.out.printf("c");
    System.out.println("---------");
    System.out.print("a");
    System.out.println("b");
    System.out.printf("c");
    System.out.print("d");
    System.out.println("\n");
    System.out.print("e");

    System.out.println("==+===+=+==+");
    System.out.printf("%s", 12); // A
    System.out.printf("%d", new Integer(321)); // B
    System.out.printf("%d", (short) (byte) (double) 127); // C

    System.out.println("--------");
    System.out.println(new char[] { 'a', 'b', 'c' }); // A
    System.out.println(new byte[] { 'a', 'b', 'c' }); // B
    System.out.println("abc"); // C
    System.out.println(new String[] { "abc" }); // D

  }
}
