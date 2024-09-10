package ocp.oop.example25;

//public abstract interface Playable {} : work fine, an interface is already abstract,
// so abstract key woModifier 'abstract' is redundant for interfaces
public interface Playable {

  // Modifier 'abstract' is redundant for interface methods
  // Modifier 'public' is redundant for interface members

  // in interfaces, method are by default abstract and public. NO package mode here
  // but when you override the method it should be public, else a compilation error
  void play();

  //  private void play(); Private methods in interfaces should have a body

  // int x; => Variable 'x' might not have been initialized
  //  public static final int x; redundant keywords
  // final tell you must provide a value for x;
  // static the initialization of x must be inline : public static final int x = 10;
  public static final int x = 10;
  int z = 10; // public static final

  // since java 8, we can create methods with implementation in interfaces (using keywords: default, static, private)
  // try to avoid using default method, cause interfaces are used as Contracts.
  default void m() {
    this.m3();
    System.out.println(":)");
  }

  static void m1() {
    // 'ocp.oop.example25.Playable.this' cannot be referenced from a static context
    // this.m3();
    System.out.println(":D");
  }

  private static void m2() {
    System.out.println(":|");
  }

  private void m3() {
    System.out.println(":/");
  }
}
