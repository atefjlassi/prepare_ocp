package g.example.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Example3_2 {

  public static void main(String[] args) {
    Map<Integer, String> m1 = new LinkedHashMap<>(); // (k,v) in the order in which you've added them

    m1.put(10, "ABC");
    m1.put(20, "QWE");
    m1.put(10, "WWW");
    m1.put(30, "QWE");

    m1.forEach((k, v) -> System.out.println(k + ": ".concat(v)));
//    System.out.println(m1);

  }

}
