package s8.executors.example104;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Java Fundamentals - Lesson 52 - Different implementations of Executors
public class Example104 {

  public static void main(String[] args) {
    // param is number of threads
    ExecutorService es1 = Executors.newFixedThreadPool(4);
    // equivalent to fixed thread pool with one thread
    ExecutorService es2 = Executors.newSingleThreadExecutor();
    // creates new threads if needed (not guarantee a fixed thread pool number)
    ExecutorService es3 = Executors.newCachedThreadPool();
    // stealing tasks from other threads whenever the current thread is available
    ExecutorService es4 = Executors.newWorkStealingPool();
  }
}
