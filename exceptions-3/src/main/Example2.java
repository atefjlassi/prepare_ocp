package main;


public class Example2 {

  public static void main(String[] args) {
    try (R r1 = new R("R1");
      R r2 = new R("R2")) {

    } // here a finally we don't see. it happens because of try with resource

  }
}

