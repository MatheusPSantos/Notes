package MetodosEEncapsulamento.Exercicios;

package a;
package b;

import b.*;

public class A extends B {
  protected int a(String s) {
    return 2;
  }
}

import a.*;

public class B {
  public int a(Object s) {
    return 1;
  }
}

import a.*;
import b.*;

class C {
  public static void main(String[] args) {
    System.out.println(new A().a("a"));
  }
}
