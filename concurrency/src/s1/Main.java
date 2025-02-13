package s1;

public class Main {

  // starting point of the main thread
  public static void main(String[] args) {
    EvenNumbersThread t1 = new EvenNumbersThread(); // NEW
    t1.start(); // you want your thread here to begin the execution // RUNNABLE lifecycle stage
    // t1.run();
    System.out.println("END! -> thread name : (" + Thread.currentThread().getName()+")");

    // END! 0 2 4 6 8 ...  --> The most probable output
    // 0 END! 2 4 6 8 ...
    // ...
    // 0 2 4 6 8 10 END!
  }
}