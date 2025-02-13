package ocp.oop.test;

public class TestOuter
{
  public void myOuterMethod()
  {
    // 1
    new TestInner();
    new TestOuter().new TestInner();
  }
  public class TestInner { }
  public static void main(String[] args)
  {
    var to = new TestOuter();
    // 2
    to.new TestInner();
    new TestOuter().new TestInner();
    // new TestInner(); // 'ocp.oop.test.TestOuter.this' cannot be referenced from a static context
    // new TestOuter.TestInner(); // This can be used only if TestInner is a static inner class.

  }
}