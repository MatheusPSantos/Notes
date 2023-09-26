package AlemDaProva;

public class TestaWrapper {
  public static void main(String[] args) {

    /**
     * Para cada um dos primitivos temos um Wrapper
     * boolean ==> Boolean
     * byte ==> Byte
     * short ===> Short
     * int ==> Integer
     * long ==> Long
     * char ==> Character
     * double ==> Double
     * float ==> Float
     */

    Double d1 = new Double(22.5);
    Double d2 = new Double("22.3");

    System.out.println(d1);
    System.out.println(d2);


    Character c1 = new Character('a');

    Boolean b1 = new Boolean("true");
    Boolean b2 = new Boolean("TrUe");

    System.out.println(b1);
    System.out.println(b2);

    Boolean b3 = new Boolean("Isso será falso");
    System.out.println(b3);


    Long l1 = new Long("123");
    long l2 = l1.longValue();
    double d3 = l1.doubleValue();
    String s1 = l1.toString();
    System.out.println(l2);
    System.out.println(d3);
    System.out.println(s1);


    // String para um primitivo
    // parseXXX

    double d4 = Double.parseDouble("122314");
    System.out.println(d4); 

    int i1 = Integer.parseInt("1111");
    System.out.println(i1);


    int i2 = Integer.parseInt("1111", 2);
    System.out.println(i2);

    // String para Wraper
    // construtor
    // valueOf
    Double d30 = new Double("23.7");
    Double d31 = Double.valueOf("123.455");

    // Primitivo para String
    // toString

    String s4 = Double.toString(1245.22);
    System.out.println(s4);

    String s5 = Integer.toString(124, 2);
    System.out.println(s5);
    
  }


}
