package myowntest;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class Main {

  public static void main(String[] args) {
    Set<String> set = Set.of("mickey", "minnie");
    List<String> list = new ArrayList<>(set);

    set.forEach(s -> System.out.println(s));
    list.forEach(s -> System.out.println(s));

    System.out.println("######");
    Function<String, String> mapTo = s -> new String("text:").concat(s);

    list.forEach(s -> {
        s = "text:".concat(s);
    });

    System.out.println(list);
  }

  public void remove(List<Character> chars) {
    char end = '1';
    // INSERT LINE HERE
    //    char start = 'a'; Variable 'start' is already defined in the scope
    //    char c = 'x'; Variable 'c' is already defined in the scope
    chars.removeIf(c -> { // NOT ALLOWED REDECLARATION
      char start = 'a'; // NOT ALLOWED REDECLARATION
      return start <= c && c <=
        end;
    });
  }



}
