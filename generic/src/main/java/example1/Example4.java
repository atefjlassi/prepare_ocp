package example1;

public class Example4 {

  public static void main(String[] args) {
    Foo<Integer> f1 = new Foo<Integer>();
    f1.x = 10;
    f1.x = 30;

    Foo<? extends Number> f2 = new Foo<Integer>();
    /**
     *  CF, the compiler doesn't know if x at this time is an Integer, Double.. etc..
     *  the compiler isn't precisely sure if a cast is required, and because generic type does not allow cast
     *  -> you won't be able to change the value
     */
//    f2.x = 10;
//    f2.x = new Integer(10);

    Foo<? super Number> f3 = new Foo<Number>();
    f3.x=10;
    f3.x=1.0;


  }

}
