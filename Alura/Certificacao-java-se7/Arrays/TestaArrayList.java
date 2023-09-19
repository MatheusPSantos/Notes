package Arrays;

import java.util.ArrayList;

public class TestaArrayList {
  public static void main(String[] args) {
    ArrayList<String> nomes = new ArrayList<>();

    nomes.add("Java");
    nomes.add("Ruby");
    nomes.add("Java");

    System.out.println(nomes.contains("Java"));

    nomes.remove("Java");
    System.out.println(nomes.contains("Java"));
    System.out.println(nomes.size());

    Object[] objetos = nomes.toArray();

    String[] objetos2 = nomes.toArray(new String[nomes.size()]);
    String[] objetos3 = nomes.toArray(new String[0]);
    System.out.println("----");
    ArrayList<String> paises = new ArrayList<>();
    paises.add("Brasil");
    paises.add("Coreia");
    paises.add("China");

    ArrayList<String> tudo = new ArrayList<>();
    tudo.addAll(nomes);
    tudo.addAll(paises);
    System.out.println("----");
    System.out.println(tudo.get(0));
    System.out.println(tudo.get(1));
    System.out.println(tudo.get(3));

    nomes.add(0,"PHP");
    System.out.println(nomes.get(0));
    System.out.println(tudo.get(0));

    nomes.remove(2);
    System.out.println("----");
    for(String nome : nomes) {
      System.out.println(nome);
    }

    System.out.println("----");
    nomes.set(1, "Scala");

    for(String nome : nomes) {
      System.out.println(nome);
    }
    nomes.add("Java");
    nomes.add("JavaScript");
    nomes.add("Python");
    nomes.add("Java");
    System.out.println("----");
    System.out.println(nomes.indexOf("Java"));
    System.out.println(nomes.lastIndexOf("Java"));
    System.out.println(nomes.indexOf("Go"));

  }
}
