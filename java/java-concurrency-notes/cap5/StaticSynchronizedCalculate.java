package cap5;

public class StaticSynchronizedCalculate {
  static int staticSum = 0;

  public static synchronized void syncStaticCalculate() {
    staticSum = staticSum + 1;
  }

}
