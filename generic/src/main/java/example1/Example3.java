package example1;

import java.io.Serializable;
import java.lang.invoke.SerializedLambda;

public class Example3 {

  /**
   * Integer extends Number
   * Double extends Number
   */
  public static void main(String[] args) {

    /***************************/

    Foo<Integer> f1; // <Integer> its a constraint -> only the precise type is allowed
    Foo<?> f2; // any object wildcard
    Foo<? extends Number>  f3; // I can use class and its children
    Foo<? super Number> f4; // I can use class and its parents
    Foo<Number> f5; // <Integer> its a constraint -> only the precise type is allowed

    /***************************/

    f1 = new Foo<Integer>();
    f5 = new Foo<Number>();
    // f5 = new Foo<Integer>(); // -> not allowed neither with child classes

    f3 = new Foo<Number>(); // -> allowed
    f3 = new Foo<Integer>(); // -> allowed
    f3 = new Foo<Double>(); // -> allowed
    f3 = new Foo<Float>(); // -> allowed
    f3 = new Foo<Long>(); // -> allowed

    // f3 = new Foo<Object>(); -> NOT allowed
    // f3 = new Foo<String>(); // -> CF: because String does not extend Number


    f4 = new Foo<Number>();
    f4 = new Foo<Object>();
    f4 = new Foo<Serializable>();
    // f4 = new Foo<Integer>(); -> CF: NOT allowed

    f2 = new Foo<String>();
    f2 = new Foo<Number>();
    f2 = new Foo<Object>();
    f2 = new Foo<Double>();

    // Foo<Object> vs Foo<?>
    Foo<Object> f6 = new Foo<Object>();
    // Foo<Object> f6_ = new Foo<Number>(); // -> does not allow polymorphism

    Foo<?> f7 = new Foo<Number>();
    Foo<?> f7_ = new Foo<Object>(); // Allow polymorphism
  }


}
