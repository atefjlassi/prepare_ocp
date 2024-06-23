package ocp.oop.example2.arrays;

public class Example5 {

  public static void main(String[] args) {
    var x = new int[]{1, 2, 3, 4, 5};

    for (int i = 0; i < x.length; i++) {
      x[i] = 10;
    }

    for (int a : x) { // cannot change the value of x here.
      // just variable 'a' is changed.
      a = 10;
    }
  }
}
