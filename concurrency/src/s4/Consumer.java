package s4;

public class Consumer extends Thread {

  public Consumer(String name) {
    super(name);
  }

  @Override
  public void run() {
    // not sync
    while (true) { // C1 [10] C2[10]

      synchronized (Main.bucket) {
        if (!Main.bucket.isEmpty()) { // C1 [10] C2 [10]
          int n = Main.bucket.get(0); // C1 [10] --> C1 (runnable)
          Main.bucket.remove(0); // C1 []  --> C2 (runnable)
          System.out.println(Thread.currentThread().getName() + " took out the value " + n + " from the bucket");
        }
      }
      // not sync
    }
  }
}
