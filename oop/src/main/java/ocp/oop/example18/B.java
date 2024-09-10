package ocp.oop.example18;

public class B extends A {

  String y;
  int x;

  public B() {
    this.x = 5;
    super.x = 10;

    this.y = ":)";
    // super.y = "CF";
  }

  public void m() {
    this.x = 10;
    super.x = 20;
    this.y = ":(";
  }
}
