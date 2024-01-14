package g.example.maps;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Example3_3 {

  public static void main(String[] args) {
    Map<Integer, String>  m1 = new TreeMap<>(Collections.reverseOrder()); // sorted by their keys

    m1.put(10, "ABC");
    m1.put(20, "QWE");
    m1.put(10, "WWW");
    m1.put(30, "QWE");

    m1.forEach((k,v) -> System.out.println(k + ": ".concat(v)));
//    System.out.println(m1);

  }

}
