package s8.executors.example100;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Example2 {

  public static void main(String[] args) {

    ExecutorService executorService = null;
    try {
      // here you don't manage thread your self
      // don't create threads more than cpu number
      int numberOfAvailableProcessors = Runtime.getRuntime().availableProcessors();
      executorService = // pool
        Executors.newFixedThreadPool(numberOfAvailableProcessors); // number of lines (CPU'S)

      Runnable r = () -> System.out.println(":) " + Thread.currentThread().getName());
      /**
       * submit more powerful than execute.
       *
       */
      Future<?> future = executorService.submit(r); // throwing the ball into the pool

      /**
       * Future done two things: next lecture (51)
       */
      // future.isDone();
      // future.isCancelled();

      System.out.println(":( "+ Thread.currentThread().getName());
    } finally {
      if (executorService != null) {
        executorService.shutdown(); // wait until all tasks terminate execution
        // executorService.shutdownNow(); don't wait
      }
    }

  }

}
