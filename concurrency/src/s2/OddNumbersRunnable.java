package s2;

public class OddNumbersRunnable implements Runnable { // it's not a thread

  @Override
  public void run() {
    for (int i = 1; i <= 11; i += 2) {
      System.out.println(i + " " + Thread.currentThread().getName());
    }
  }
}
