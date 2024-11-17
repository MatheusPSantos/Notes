package cap4;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    Thread t2 = new SampleThread(5);
    t2.start();
    System.out.println("Invoking join");
    t2.join();
    System.out.println("Returned from join");
    System.out.println("is alive? " + t2.isAlive());
  }
}
