package MetodosEEncapsulamento;

public class TestaStatic {

  public static void main(String[] args) {

    Moto.totalDeMotos = 15;

    Moto moto1 = new Moto();
    Moto moto2 = new Moto();

    System.out.println(Moto.totalDeMotos);

    System.out.println(moto1.totalDeMotos);
    System.out.println(moto2.totalDeMotos);

    moto2.totalDeMotos = 20;

    System.out.println(moto1.totalDeMotos);
    System.out.println(moto2.totalDeMotos);

    moto1.marca = "Honda";
    System.out.println(moto1.marca);
    System.out.println(moto2.marca);

    System.out.println(moto1.a);
    System.out.println(moto1.b);
  }
}

class Moto {
  public static final int TOTAL_DE_MOTOS = 8;
  public static int totalDeMotos = 0;


  static int b = getMetodo();
  public static int getMetodo() {
    return a;
  }
  static int a = 15;
  String marca;

  public static int getTotlaDeMotos() {
    return Moto.totalDeMotos;
  }

}
