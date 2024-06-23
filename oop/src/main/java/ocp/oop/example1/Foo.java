package ocp.oop.example1;

public class Foo {

  int x;
  static int y; // cannot use static locally

  // should be initialized directly, cannot be given through the constructor (same for all static declarations)
  static final int z = 0;

  static final int w;
  // static final int w1; CF

  static {
    w = 7;
  }

/*  public static void main(String[] args) {
    static int s = 4; // CF
  }*/



/*  void m(static int r) { // CF

    static String c = ""; // CF
  }*/


}
