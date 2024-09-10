package ocp.oop.example4;

public class A {

  /**
   * Overloading concern methods and constructor
   */
  void a() {
    System.out.println("void a()");
  }

  // by number,
  // by type of at least one of them,
  // order of type
  void a(int x) {
    System.out.println("void a(int x)");
  }

  void a(double d) {
    System.out.println("void a(double d)");
  }

  void a(int x, double y) {
    System.out.println("void a(int x, double y)");
  }

  void a(String x, double y) {
    System.out.println("void a(String x, double y)");
  }

  void a(double y, String x) {
    System.out.println("void a(double y, String x)");
  }

  void a(String s) {
    System.out.println("void a(String s)");
  }

  void a(Double d) {
    System.out.println("void a(Double d)");
  }


    void a(Long l) {
      System.out.println("void a(Long l)");
    }

    void a(long l) {
      System.out.println("void a(long l)");
    }

  // CF
  // not allowed even the return type is not the same
  // JUST the identifier and parameters are important when discuss about overloading, the type is not important
  //  int a() { // 'a()' is already defined in 'ocp.oop.example4.A'
  //  return 5;
  //  }

}
