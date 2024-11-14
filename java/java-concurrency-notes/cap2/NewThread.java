package cap2;

public class NewThread extends Thread {
  public void run() {
    long startTime = System.currentTimeMillis();
    int i = 0;
    while (true) {
      System.out.println(this.getName() + ": New Thread is running ..." + i++);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
