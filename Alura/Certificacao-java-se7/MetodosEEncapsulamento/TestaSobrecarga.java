package MetodosEEncapsulamento;

public class TestaSobrecarga {
  public static void main(String[] args) {
    new OverLoader().metodo();
    new OverLoader().metodo(2);
    new OverLoader().metodo(2.34);
  }
}

class OverLoader {
  public void metodo(int a) {
    System.out.println("Com int");
  }

  public void metodo(double a) {
    System.out.println("Com double");
  }

  public void metodo() {
    System.out.println("com nada");
  }
}
