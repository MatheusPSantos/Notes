abstract class SemMetodo {

}

abstract class ComMetodoAbstrato {
  abstract void executa();
}

abstract class Veiculo {
  abstract void liga();

}

  Carro extends Veiculo{

  void liga() {
  }
}

abstract class CarroAutomatico extends Carro {

}

class TestaClasInterface {
  public static void main(String[] args) {
    // new SemMetodo();
    // new ComMetodoAbstrato();

    Carro c = new Carro();
    c.liga();
  }
}