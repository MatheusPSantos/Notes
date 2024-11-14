package cap1;
public class ThreadTimedWaitingState {
  public static void main(String[] args) throws InterruptedException {
    DemoTimeingRunnable runnable = new DemoTimeingRunnable();
    Thread t = new Thread(runnable);
    t.start();
    Thread.sleep(1000);
    System.out.println(t.getState());
  }

}
