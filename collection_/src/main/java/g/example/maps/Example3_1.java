package g.example.maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Example3_1 {

  public static void main(String[] args) {
    Map<Integer, String>  m1 = new HashMap<>(); // (k,v) doesn't guarantee an order

    m1.put(10, "ABC");
    m1.put(20, "QWE");
    m1.put(10, "WWW");
    m1.put(30, "QWE");

    m1.forEach((k,v) -> System.out.println(k + ": ".concat(v)));
//    System.out.println(m1);

  }

}
