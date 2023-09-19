
public class TestaConstrutores {
  public static void main(String[] args) {
    A a = new A();
    System.out.println(a.nome);
    A a2 = new A("Funciona");
    System.out.println(a2.nome);
    System.out.println(a2.tamanhoNome());
    System.out.println(a.tamanhoNome());
  }

}

class A {

  // construtor padrao
  // A() {
  // super();
  // }

  String nome;
  A(String s) {
    this.nome = s;
  }

  A() {

  }

  int tamanhoNome() {
    return this.nome.length();
  }
}