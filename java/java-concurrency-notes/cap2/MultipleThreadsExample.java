package cap2;

public class MultipleThreadsExample {
  public static void main(String[] args) {
    NewThread t = new NewThread();
    t.setName("My-Thread-1");
    NewThread t2 = new NewThread();
    t2.setName("My-Thread-2");
    t.start();
    t2.start();
  }
}
