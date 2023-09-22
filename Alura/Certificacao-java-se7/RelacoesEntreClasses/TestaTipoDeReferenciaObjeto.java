import java.util.ArrayList;
import java.util.List;

class Conta {
  int id;
}

class ContaJuridica extends Conta {
  String cnpj;
}

class ContaFisica extends Conta {

}

class TestaTipoDeRefenciaObjeto {
  public static void main(String[] args) {
    Conta c = new ContaJuridica();
    c.id = 15;
    c.liga();
    c.fecha();
    (new ContaJuridica().cnpj) = "15";

    List lista = new ArrayList<>();
  }
}