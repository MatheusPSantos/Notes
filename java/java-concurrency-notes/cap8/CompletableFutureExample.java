package cap8;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompletableFutureExample {
  public Future<String> calculateAsync() throws InterruptedExecution {
    CompletableFuture<String> completableFuture = new CompletableFuture<>();
    Executors.newCachedThreadPool().submit(() -> {
      Thread.sleep(500);
      completableFuture.complete("hello");
      return null;
    });
    return completableFuture;
  }
}
