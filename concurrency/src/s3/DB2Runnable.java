package s3;

public class DB2Runnable implements Runnable {

  @Override
  public void run() {
    // any blocking method throw interrupted exception
    try {
      Thread.sleep(2000);
      System.out.println("DB 2 querying ended...");
    } catch (InterruptedException e) {
      // this exception refers in the case were trying to interrupt thread when its blocked
      throw new RuntimeException(e);
    }
  }
}
