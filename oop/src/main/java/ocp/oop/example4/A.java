package ocp.oop.example4;

public class A {

  /**
   * Overloading concern methods and constructor
   */
  void a() {
  }

  // by number,
  // by type of at least one of them,
  // order of type
  void a(int x) {
  }

  void a(double d) {
  }

  void a(int x, double y) {
  }

  void a(String x, double y) {
  }

  void a(double y, String x) {
  }

  void a(String s) {
  }

  void a(Double d) {

  }

  // CF
  // not allowed even the return type is not the same
  // JUST the identifier and parameters are important when discuss about overloading, the type is not important
  //  int a() {
  //  }

}
