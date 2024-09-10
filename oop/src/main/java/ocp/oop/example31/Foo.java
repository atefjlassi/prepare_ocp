package ocp.oop.example31;

//public class Foo implements A, B => should override m() in Foo, else CF
public class Foo extends Bar implements A, B { // no prob

}


//public class Foo implements A, B => should override m() in Foo, else CF
// class Foo2 implements A, B { //CF
// }