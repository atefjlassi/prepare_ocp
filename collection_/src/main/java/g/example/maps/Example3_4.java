package g.example.maps;

import java.util.TreeMap;

public class Example3_4 {

  public static void main(String[] args) {
    var m1 = new TreeMap<Cat, String>();

    m1.put(new Cat(10), "Tom");
    m1.put(new Cat(20), "Leo");
    m1.forEach((k, v) -> System.out.println(k + ": ".concat(v)));
//    System.out.println(m1);

  }

}
