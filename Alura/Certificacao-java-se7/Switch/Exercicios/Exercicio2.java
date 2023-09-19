class Exercicio2 {
  public static void main(String[] args) {
    int tamanhoEsperado = 1;
    int tamanho = args.length;
    switch (tamanho) {
      case tamanhoEsperado:
        System.out.println("1");
        break;
      default:
        System.out.println("cade o argumento?");
    }

  }
}