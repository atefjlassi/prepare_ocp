package ocp.oop.example40;

public class B1 {

  void m1(int k) {

    int q = 10;
    // k = 10;
    // q = 20;
    class B2 {
      void m() {
        // Variable 'q' is accessed from within inner class, needs to be final or effectively final
        System.out.println(q);
        // Variable 'k' is accessed from within inner class, needs to be final or effectively final
        System.out.println(k);
      }
    }
  }

  static void m2() { // static context

    // you don't have access to this of B1
    class B3 {

    }
  }
}
