package example1;

public class Example1 {

  public static void main(String[] args) {

    // if you don't specify the type of generic, it took the type Object by default
    Foo f1 = new Foo();
    f1.x = 5;

    Foo f2 = new Foo();
    f2.x = "Hello";

    f1.x = f2.x;

    //----
    // COMPILE OK, runtime error KO (ClassCastException) this kind of exception we want to avoid it by generics
    int x = (int) f2.x;
  }
}
