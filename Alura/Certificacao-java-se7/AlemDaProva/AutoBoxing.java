public class AutoBoxing {
  public static void main(String[] args) {
    // Java 1.4
    Integer intWrapper = Integer.valueOf(1);
    int intPrimitivo = intWrapper.intValue();
    intPrimitivo++;
    intWrapper = Integer.valueOf(intPrimitivo);

    System.out.println(intWrapper);

    // Java 5
    Integer intWrapperJ5 = Integer.valueOf(1);
    intWrapperJ5++;

    System.out.println(intWrapperJ5);

  }
}
