package cap5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class NoSyncMain {
  public static void main(String[] args) throws InterruptedException {
    ExecutorService service = Executors.newFixedThreadPool(3);
    NoSynchronizedCalculate summation = new NoSynchronizedCalculate();

    IntStream.range(0, 1000)
        .forEach(count -> service.submit(summation::calculate));
    
    service.awaitTermination(1000, TimeUnit.MILLISECONDS);

    boolean result = 1000 == summation.getSum();

    System.out.println("Is summation result equals 1000? " + result);
  }
}
