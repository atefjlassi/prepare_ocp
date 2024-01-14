package example1;

public class Foo<T> {

  //    Object x;
  T x;
  //
  /**
   *  static T x;
   *  wrong syntax, why ? because static members are initialized before any instance exist,
   *  so we need to know the type <T> earlier, and it's not the case
   */


  public Foo() {
  }


  public Foo(T x) {
      this.x = x;
  }

  public void printX() {
      System.out.println(this.x);
  }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    // we can use generic types with instance member only, with static member it's not possible
    // static T m1() {}  'example1.Foo.this' cannot be referenced from a static context
    // static void m1(T x) {}

}
