package cap2;

import java.util.Timer;
import java.util.TimerTask;

public class TimerExample {
  public static void main(String[] args) {
    TimerTask task = new TimerTask() {
      public void run() {
        System.out.println(
            "Task performed on:  " + new java.util.Date() + "\nThreads name: " + Thread.currentThread().getName());
      }
    };

    Timer timer = new Timer("Timer");
    long delay = 1000L;
    timer.schedule(task, delay);
  }
}
