package ocp.oop.example36;

public class Example {

  public static void main(String[] args) {
    Coffee c1 = Coffee.SMALL;
    c1.setQty(10);
    System.out.println(c1.getQty());
    // TODO : back to the output here !
    //    :)
    //    :)
    //    10

    switch (c1) { // int, char, String, enum
      case SMALL:
        System.out.println(":)");
        break;
      case MEDIUM:
        System.out.println(":(");
        break;
    }

    // JPA implementations / Hibernate (saved by order or name)
    int ordinal = Coffee.MEDIUM.ordinal(); // indexed in order
    String name = Coffee.MEDIUM.name();
    System.out.println("index: "+ ordinal+", name: "+name);

    for (Coffee c : Coffee.values()) { // Coffee[]
      System.out.println(c);
    }

  }
}
