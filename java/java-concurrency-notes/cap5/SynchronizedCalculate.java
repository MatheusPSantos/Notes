package cap5;

public class SynchronizedCalculate {
  private int sum = 0;

  public synchronized void synchronizedCalculate() {
    setSum(getSum() + 1);
  }

  public void setSum(int sum) {
    this.sum = sum;
  }

  public int getSum() {
    return sum;
  }

}
