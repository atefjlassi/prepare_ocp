package s4;

import java.util.Random;

public class Producer extends Thread {

  public Producer(String name) {
    super(name);
  }

  @Override
  public void run() {
    Random r = new Random();
    // 100
    while (true) {
      // synchronized: applied on a bloc of code to make the execution atomic
      // if one thread run the bloc of code, other thread are locked until the first finish execution

      synchronized (Main.bucket) { // decide which is our monitor (monitor play the role of police officer)
        if (Main.bucket.size() < 100) {
          int n = r.nextInt(1000); // {0, 999}
          Main.bucket.add(n);
          System.out.println(Thread.currentThread().getName()+ " added value "+ n + " to the bucket");
        }
      }
    }
  }
}
