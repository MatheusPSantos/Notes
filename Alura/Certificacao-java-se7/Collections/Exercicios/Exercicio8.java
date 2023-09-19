package Collections.Exercicios;

import java.util.*;

public class Exercicio8 {

  public static void main(String[] args) {
    ArrayList<String> a = new ArrayList<String>();
    a.add(0, "a");
    a.add(1, "b");
    for (Iterator<String> i = a.iterator(); i.hasNext(); i.next()) {
      String element = i.next();
      System.out.println(element);
    }
  }

}
