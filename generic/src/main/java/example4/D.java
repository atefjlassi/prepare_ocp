package example4;

public class D<X extends Number, Y extends String> {

  X x;
  Y y;

  public D(X x, Y y) {
    this.x = x;
    this.y = y;
  }

  public X getX() {
    return x;
  }

  public void setX(X x) {
    this.x = x;
  }

  public Y getY() {
    return y;
  }

  public void setY(Y y) {
    this.y = y;
  }

  public static void main(String[] args) {
    System.out.println("#########");

    D<Long, String> longStringD = new D<>(4L, "Hello");

    longStringD.x = 4L;

    Long x1 = longStringD.getX();
    String y1 = longStringD.getY();

    System.out.println(y1 + " - " + x1);
  }

}
