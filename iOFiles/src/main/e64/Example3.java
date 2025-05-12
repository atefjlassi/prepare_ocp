package main.e64;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Example3 {
  private static String vowels = "aeiouAEIOU";
  public static void main(String[] args) {
    try (var in = Files.lines(Paths.get("verse.txt"))) {
      var count = in.flatMap(line -> Arrays.stream(line.split("")))
        .filter(c -> vowels.contains(c))
        .count();

      System.out.println(count);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
