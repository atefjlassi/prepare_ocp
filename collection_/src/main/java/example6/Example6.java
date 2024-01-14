package example6;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Example6 {

  public static void main(String[] args) {

    // here you cannot consider that they are sorted = risk of contract
    Set<Integer> sortedSet = getSomeSet();

    // now I can assume that elements are sorted
    Set<Integer> sortedSet_ = getSomeSet_();

  }

  /**
   * risk of contract
   */
  static Set<Integer> getSomeSet() {
    return new TreeSet<>(); // sorted
  }

  static SortedSet<Integer> getSomeSet_() {
    return new TreeSet<>();
  }

}
