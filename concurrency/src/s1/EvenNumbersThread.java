package s1;


/**
 * create a more particular thread were we describe what should be happen.
 */
public class EvenNumbersThread extends Thread {

  @Override
  public void run() { // main method of a thread, what to do in the thread
      try {
        for (int i = 0; i <= 10; i += 2) {
          System.out.println(i + " -> thread name : (" + Thread.currentThread().getName()+")");
          Thread.sleep(1000); // InterruptedException
        }
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

  } // DEAD
}