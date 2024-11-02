package ocp.oop.test;

public class Mammal {
  private void eat() {}
  protected static void drink() {}
  public Integer dance(String p) {return null;}
}

class Primate extends Mammal {
  public void eat(String p) {}
}


class Monkey extends Primate {
  public static void drink() throws RuntimeException {}
  public Number dance(CharSequence p) {return null;}
  //'eat(String)' in 'ocp.oop.test.Monkey' clashes with 'eat(String)'
  // in 'ocp.oop.test.Primate'; attempting to use incompatible return type
//  public int eat(String p) { }
}