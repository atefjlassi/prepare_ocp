package myowntest.qcm.ch6;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public abstract class Main {

  public static void main(String[] args) {

    System.out.println("Q4");

    test((e) -> "Proof"); // 1: ok
    // test((e) -> {"Proof2"});// 2: return and ; is missing
    //  test((e) -> {String e = ""; "Proof" });// 3: Variable 'e' is already defined in the scope
//    test((e) -> {String e = ""; return "Proof"; });// 4: Variable 'e' is already defined in the scope
//    test((e) -> {String e = ""; return "Proof" });// 5: Variable 'e' is already defined in the scope
    test((e) -> {
      String f = "";
      return "Proof";
    });// 6:

    System.out.println("Q5");
    List list = List.of(1, 2, 3);
    Set set = Set.of(1, 2, 3);
    Map map = Map.of(1, 2, 3, 4);

    // we can use forEach with Map with BiConsumer only
    map.forEach((x, y) -> System.out.println("key: " + x + ", value: " + y));

/*    System.out.print("Keys: ");
    map.keySet().forEach(x -> System.out.print(x));
    System.out.print("values: ");
    map.values().forEach(x -> System.out.print(x));*/

    System.out.println("Q9");
    //Exception in thread "main" java.lang.UnsupportedOperationException
    //	at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:72)
    // remove(List.of('a', 'b', 'y', 'w', 'z'));

    var numbers = new HashSet<Number>();
    numbers.add(Integer.valueOf(10));
    numbers.add(null);

    System.out.println(numbers);

    var stream = Stream.iterate("", s -> s + "1");
    System.out.println(stream.limit(2).map(s -> s + "2"));
  }


  static void remove(List<Character> chars) {
    char end = 'z';
//    end = '1';
    chars.removeIf(c -> {
      char start = 'a';
//      start = 'd';
      return start <= c && c <= end;
    });

//    System.out.println(chars);
//    end = 'd';
  }

  private static void test(Secret o) {
//    System.out.println(o.magic(4));
  }

}


interface Secret {

  String magic(double d);
}


class MySecret implements Secret {

  @Override
  public String magic(double d) {
    return "Proof";
  }
}