package ocp.oop.example2.arrays;

public class Example10 {

  public static void main(String[] args) {
    int [][] x = new int[3][2];

    // {{0,0}, {0,0}, {0,0}}

    for (int [] i: x) {
      for (int j: i) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}
