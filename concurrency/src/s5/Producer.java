package s5;

import java.util.Random;

public class Producer extends Thread {

  public Producer(String name) {
    super(name);
  }

  @Override
  public void run() {
    Random r = new Random();
    try {
      // 100
      while (true) {
        // synchronized: applied on a bloc of code to make the execution atomic
        // if one thread run the bloc of code, other thread are locked until the first finish execution

        synchronized (Main.bucket) { // decide which is our monitor (monitor play the role of police officer)
          if (Main.bucket.size() < 100) {
            int n = r.nextInt(1000); // {0, 999}
            Main.bucket.add(n);
            System.out.println(Thread.currentThread().getName() + " added value " + n + " to the bucket");
          } else {
            // way to enhance performance of the application
            // it put the current thread to the state blocked
            Main.bucket.wait(); // producer waits now a consumer to consume a value

            // NB: 1. wait() and notify() are called only from inside a synchronized bloc
            //     2. call them only from the monitor object (bucket in our case)
          }
        }
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
