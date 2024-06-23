package ocp.oop.example2.arrays;

public class Example2 {

  public static void main(String[] args) {

    int[] x;
    x = new int[5];

    // => ArrayIndexOutOfBoundsException
    x[0] = 8;
    x[1] = 9;
    x[2] = 1;
    x[3] = 3;
    x[4] = 9;

    for (int i = 0; i < x.length; i++) {
      System.out.println(x[i]);
    }
  }

}
