package s6.volat;

public class Main {

  // use volatile if you have a kind of data consistency problem, if not, no need to use volatile keyword

  // NB: volatile does not solve the race condition problem
  //  public static int c = 0;
  public static volatile int c = 0;

  public static void main(String[] args) {
    IncrementingThread t1 = new IncrementingThread("inc-t1");
    PrintingThread p1 = new PrintingThread("print-p1");

    t1.start();
    p1.start();
  }
}
