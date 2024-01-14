package example1;

public class Example2 {

  public static void main(String[] args) {
    Foo<String> f1 = new Foo<String>();
    f1.x = "Hello;";
//    f1.x = 3; CF

    Foo<Integer> f2 = new Foo<Integer>();
    f2.x = 10;

    // ---
    // int x = (int) f1.x; CF
    int x = f2.x;
  }
}
