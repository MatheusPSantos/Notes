package cap5;

public class NoSynchronizedCalculate {
  private int sum = 0;

  public void calculate() {
    setSum(getSum() + 1);
  }

  /**
   * Getterrs and Setters
   */
  
  public int getSum() {
    return sum;
  }

  public void setSum(int sum) {
    this.sum = sum;
  }

}