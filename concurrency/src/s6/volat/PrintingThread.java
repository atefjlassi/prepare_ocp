package s6.volat;

public class PrintingThread extends Thread {


  public PrintingThread(String name) {
    super(name);
  }
  @Override
  public void run() {
    try {
      while (true) {
        System.out.println(Main.c);
        Thread.sleep(500);
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
