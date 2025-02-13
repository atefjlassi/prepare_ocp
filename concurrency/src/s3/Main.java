package s3;

public class Main {

  // first way of synchronization:
  // join:  specify when thread should wait until another finished

  // use case: grep data from two different databases, and use that data for processing something
  public static void main(String[] args) {

    // 1
    // query DB 1 -> 3 seconds
    // query DB 2 -> 2 seconds
    // 3 + 2 -> 5 seconds
    // max(3, 2) -> 3 < 5 => we


    // 2 --> join()
    // processing
    // want to make sure that processing only starts when both query db1 & query dbs2 finished

    var db1 = new DB1Runnable();
    var db2 = new DB2Runnable();

    var t1 = new Thread(db1, "T1");
    var t2 = new Thread(db2, "T2");


    t1.start();
    t2.start();

    // t1.setPriority(1); its only an advice given to jvm, but it can be ignored
    // don't trust this priority in real life (to avoid) , use synchronization to control execution of threads
    // infos: default priority = 5, priority level go from 1 to 10.

    try {
      t1.join(); // bloc the main thread until t1 finish
      t2.join(); // bloc the main thread until t2 finish
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    System.out.println("PROCESSING..."); // main

  }
}
