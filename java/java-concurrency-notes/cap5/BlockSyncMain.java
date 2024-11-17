package cap5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class BlockSyncMain {
  public static void main(String[] args) throws InterruptedException {
    ExecutorService service = Executors.newFixedThreadPool(3);
    BlockSynchronizedCalculate method = new BlockSynchronizedCalculate();

    IntStream.range(0, 1000).forEach(
        count -> service.submit(method::performSynchronisedTask));

    service.awaitTermination(1000, TimeUnit.MILLISECONDS);

    boolean result = 1000 == method.getSum();

    System.out.println("Is result of summation equals 1000? " + result);
  }
}
