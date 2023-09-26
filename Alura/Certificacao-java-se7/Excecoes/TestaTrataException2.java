package Excecoes;

public class TestaTrataException2 {

  public static void metodo1() {
    System.out.println("primeiro antes");
    try {
      metodo2();
      System.out.println("primeiro depois");
    } catch (NullPointerException e) {
      System.out.println("tratei");
    }
    System.out.println("fim do metodo 1");

  }

  public static void metodo2() {
    String s = null;
    System.out.println("segundo antes");
    s.length();
    System.out.println("segundo depois");
  }

  public static void main(String[] args) {
    metodo1();
  }
}

class ContaDoBem {

  double saldo = 100.00;

  void saca(double quantidade) throws SaldoInsuficienteException {
    if (this.saldo < quantidade) {
      throw new SaldoInsuficienteException("Saldo insuficiente " + saldo + " para sacar.");
    }
    saldo = saldo - quantidade;
  }
}

class TestaTrataException3 {
  public static void metodo1() {
    new ContaDoBem().saca(500);
  }
}

class SaldoInsuficienteException extends Exception {
  SaldoInsuficienteException(String msg) {
    super(msg);
  }
}