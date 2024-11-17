package cap5;

public class BlockSynchronizedCalculate {
  private int sum = 0;

  public void performSynchronisedTask() {
    System.out.println("Entering in the synchronized block.");
    synchronized(this) {
      setSum(getSum() + 1);
    }
    System.out.println("Outing of the synchronized block.");
  }

  public void setSum(int sum) {
    this.sum = sum;
  }

  public int getSum() {
    return sum;
  }

}
