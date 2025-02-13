package s8.executors.example100;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example1 {

  public static void main(String[] args) {

    ExecutorService executorService = null;
    try {
      // here you don't manage thread your self
      // don't create threads more than cpu number
      int numberOfAvailableProcessors = Runtime.getRuntime().availableProcessors();
      executorService = // pool
        Executors.newFixedThreadPool(numberOfAvailableProcessors); // number of lines (CPU'S)

      Runnable r = () -> System.out.println(":) " + Thread.currentThread().getName());
      executorService.execute(r); // throwing the ball into the pool
      System.out.println(":( "+ Thread.currentThread().getName());
    } finally {
      if (executorService != null) {
        executorService.shutdown(); // wait until all tasks terminate execution
        // executorService.shutdownNow(); don't wait
      }
    }

  }

}
