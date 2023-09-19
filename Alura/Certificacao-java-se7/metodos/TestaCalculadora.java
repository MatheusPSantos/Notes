class Calculadora {

  public int soma(int a, int b) {
    return a + b;
  }

  // imple,emta numero variavel de argumentos
  // o varargs deve ser o ultimo parametro do metodo
  public int soma2(int... numeros) {
    int soma = 0;
    for (int i = 0; i < numeros.length; i++) {
      soma += numeros[i];
    }
    return soma;
  }
}

public class TestaCalculadora {
  public static void main(String[] args) {
    Calculadora c = new Calculadora();

    System.out.println(c.soma(4, 6));
    System.out.println(c.soma2(4, 6, 1));
    System.out.println(c.soma2(4, 6, 9, 3));
    System.out.println(c.soma2(4, 6, 0, 12));
    System.out.println(c.soma2(4, 6, 212));
    System.out.println(c.soma2());

  }
}
