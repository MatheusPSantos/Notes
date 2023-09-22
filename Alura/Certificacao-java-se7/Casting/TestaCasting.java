
public class TestaCasting {
  public static void main(String[] args) {
    Object[] objetos = new Object[100];

    String s = "certificacao";

    // String recuperada = objetos[0];
    String recuperada = (String) objetos[0];

    Veiculo v = new Carro();
    Carro c = new Carro();
    Moto mm = (Moto) v;
    Moto m2 = (Moto) c;

  }
}

class Veiculo {
}

class Moto extends Veiculo {
}

class Carro extends Veiculo {
}