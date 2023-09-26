package AlemDaProva.Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestaLambdas {
  public static void main(String[] args) {

    System.out.println("---------------------- SEM LAMBDA --------------------");
    List<Pessoa> pessoas = Arrays.asList(
        new Pessoa("Mario", 40),
        new Pessoa("Luigi", 40),
        new Pessoa("Kratos", 100),
        new Pessoa("Naruto", 20),
        new Pessoa("Neji", 120),
        new Pessoa("Lee", 2),
        new Pessoa("Gai", 0));

    FiltradorDePessoas filtrador = new FiltradorDePessoas();
    List<Pessoa> resultado = filtrador.filtra(pessoas, new MaioresDeIdade());
    System.out.println(resultado);
    Matcher<Pessoa> criterio = new Matcher<Pessoa>() {
      public boolean test(Pessoa p) {
        return p.idade >= 18;
      }
    };
    List<Pessoa> resultado2 = filtrador.filtra(pessoas, criterio);
    System.out.println(resultado2);
    System.out.println("---------------------- Com LAMBDA --------------------");

    Predicate<Pessoa> criterio2 = (Pessoa p) -> {
      return p.idade >= 18;
    };
    List<Pessoa> resultado3 = filtrador.filtra(pessoas, criterio2);
    System.out.println(resultado3);

    Predicate<Pessoa> criterio3 = p -> p.idade >= 18;
    List<Pessoa> resultado4 = filtrador.filtra(pessoas, criterio3);
    System.out.println(resultado4);

    List<Pessoa> resultado5 = filtrador.filtra(pessoas, p -> p.idade >= 18);
    System.out.println(resultado5);
  }
}

class Pessoa {
  String nome;
  int idade;

  Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  public String toString() {
    return "\nNome: " + nome + ", idade: " + idade;
  }
}

interface Matcher<T> {
  boolean test(T t);
}

class MaioresDeIdade implements Predicate<Pessoa> {
  public boolean test(Pessoa p) {
    return p.idade >= 18;
  }
}

class FiltradorDePessoas {
  List<Pessoa> filtra(List<Pessoa> todas, Predicate<Pessoa> matcher) {
    List<Pessoa> resultado = new ArrayList<>();

    for (Pessoa p : todas) {
      if (matcher.test(p)) {
        resultado.add(p);
      }
    }
    return resultado;
  }
}
