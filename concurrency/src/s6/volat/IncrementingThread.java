package s6.volat;

public class IncrementingThread extends Thread {


  public IncrementingThread(String name) {
    super(name);
  }
  @Override
  public void run() {
    try {
      while (true) {
        Main.c++;
        Thread.sleep(500);
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
