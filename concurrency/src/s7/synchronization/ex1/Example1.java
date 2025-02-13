package s7.synchronization.ex1;

public class Example1 {
  private Object monitor = new Object();

  public void a() {
    synchronized (monitor) {

    }
  }

  public void b() {
    // here
    synchronized (this) {

    }
    // here
  }

  public synchronized /* this */ void c() {

  }

  public static synchronized void d() {

  }

  public static void e() {
    /**
     * When a classloader in java loading the blueprint itself of a class,
     * it creates an instance that refers to the blueprint itself (Example1 for eg) ,
     * this instance represent the class itself, it stored in special memory.
     * we just have one instance per class
     */
    synchronized (Example1.class) {

    }
  }
}