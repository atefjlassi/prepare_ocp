package s8.executors.scheduled;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Example107 {

  public static void main(String[] args) throws InterruptedException {
    ScheduledExecutorService es1 = Executors.newSingleThreadScheduledExecutor(); // one thread
    // ScheduledExecutorService es2 = Executors.newScheduledThreadPool(4);

    Runnable r1 = () -> System.out.println(":)");
    /**
     * AT 52:30s Java Fundamentals - Lesson 52 - Different implementations of Executors
     * an explanation between scheduleAtFixedRate AND scheduleWithFixedDelay
     */
    es1.scheduleWithFixedDelay(r1, 3, 5, TimeUnit.SECONDS);

    Thread.sleep(15000); // 10 seconds

    es1.shutdown();
  }
}
