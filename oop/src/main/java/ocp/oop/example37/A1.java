package ocp.oop.example37;

/**
 * A1 : top level class
 * A3, A2: nested class, can only be accessible through A1 -> see Example
 */
public class A1  /* extends A */ { // outer class

  private int x;
  private static int y;

  class A2 { // inner class: considered as a member of A1 so: still has access to private member of A1 class
     int x;
    void m() {
       x = 10; // in this case, the word this refer to the instance of A2 = CF (this.x =10 :: CF)
       A1.this.x = 10; // OK, A1.this.x / A1.super.x
    }
  }

  static class A3 { // owned by the class not by instance
    // A1.this is not accessible here!
    void m() {
      y = 45;
      //'ocp.oop.example37.A1.this' cannot be referenced from a static context
      // A1.this.x = 10;

    }
  }
}
