package ocp.oop.example13;

public class B extends A {

  // it's not an overriding = it's redeclaration
  // @Override = CF
  void m() {
    System.out.println("B");
  }

  /**
   * public
   * protected
   * default mode
   * private
   */

  @Override // overriding
  public void m1() {
    System.out.println("B1");
  }

  // overloading
  void m1(int x) {
    System.out.println("C1");
  }
// not allowed with protected
//  protected void m1() {
//    System.out.println("B1");
//  }
}
