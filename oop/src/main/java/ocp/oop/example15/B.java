package ocp.oop.example15;

public class B extends A {


  // no overriding for Constructor, only overloading
  public B() {
  }
  public B(int x) {
  }

  /**
   * Override depend on inheritance concept, (about changing behaviour etc..)
   * Overload doesn't depend on inheritance,
   * is just about the possibility of having multiple method with the same name and different parameters
   */

  /**
   * When we discuss (overloading) the access type is not important.
   *
   * it doesn't matter public with private etc. (access modifier)
   * it doesn't matter static method with no static method
   * it doesn't matter the return type
   * it doesn't matter the exception throw on the method
   */
  @Override
  void m() {
  }

  // we can redefine (overload) static method BUT cannot override static method

  static void a() { // not considered as override
  }
}
