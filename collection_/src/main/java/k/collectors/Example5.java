package k.collectors;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Example5 {

  public static void main(String[] args) {
    List<String> list = List.of("AAA", "AAA", "B", "CCCCC", "DDDD", "FFFFFF");
    String res = list
      .stream()
      .collect(Collectors.joining());

    System.out.println(res);

    System.out.println("######## with delimiter ###########");

    String res_ = list
      .stream()
      .collect(Collectors.joining(","));
    System.out.println(res_);

    System.out.println("######## with delimiter and prefix/suffix ###########");

    String res__ = list
      .stream()
      .collect(Collectors.joining(",", "[", "]"));
    System.out.println(res_);

    System.out.println(res__);

  }

}
