package g.example.maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Example3 {

  public static void main(String[] args) {

    // collection of associations (pairs)
    // (key, value)
    // three implementation recommended to learn
    Map<Integer, String>  m1 = new HashMap<>(); // (k,v) doesn't guarantee an order
    Map<Integer, String>  m2 = new LinkedHashMap<>(); // (k,v) in the order in which you've added them
    Map<Integer, String>  m3 = new TreeMap<>(); // (k,v) are sorted by their keys

    Set<Integer> s1 = new HashSet<>(); // doesn't guarantee an order
    Set<Integer> s2 = new LinkedHashSet<>(); // keeps th elements in the order in which you've added them
    Set<Integer> s3 = new TreeSet<>(); // sorts the elements by a given rule (Comparable / Comparator)

  }

}
