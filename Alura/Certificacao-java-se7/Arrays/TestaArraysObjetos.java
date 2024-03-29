package Arrays;

public class TestaArraysObjetos {
  public static void main(String[] args) {
    Cliente[] clientes = new Cliente[10];

    for (int i = 0; i < clientes.length; i++) {
      clientes[i] = new Cliente();
      clientes[i].nome = "Mario "+i;
    }

    for (Cliente cliente : clientes) {
      System.out.println(cliente.nome);
    }


    Cliente[] clientes2 = new Cliente[5];

    clientes2[0] = new Cliente();
    clientes2[1] = new ClienteEspecial();

    System.out.println("+========+");


    Cliente guilherme = new Cliente();
    guilherme.nome = "guilherme";

    clientes2[0] = guilherme;

    System.out.println(guilherme.nome);
    System.out.println(clientes2[0].nome);

    guilherme.nome = "silveira";
    System.out.println(guilherme.nome);
    System.out.println(clientes2[0].nome);


    //int[] valores = new int[10];
    //long[] valores2 = (long[])valores;

    String[] nomes = {"Mario", "Guilherme"};
    Object[] objetos = nomes;
    for (Object o : objetos) {
      System.out.println(o);
    }
  }
}

class Cliente {
  String nome;
}

class ClienteEspecial extends Cliente {

}
