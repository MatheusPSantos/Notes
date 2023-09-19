
public class TestaConstrutor2 {
  public static void main(String[] args) {
    Livro l = new Livro("Java", "C++", "Python");

  }
}

class Livro {

  Livro() {
    System.out.println("sem argumentos");
  }

  Livro(int i) {
    System.out.println("com int");
  } 

  Livro(String... s) {
    System.out.println("strings");
  }
}
