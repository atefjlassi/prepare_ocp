package s8.executors.example100;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Example102 {

  public static void main(String[] args) {
    ExecutorService service
      = Executors.newFixedThreadPool(4);

    Callable<String> c = () -> "Hello!";

    Future<String> f = service.submit(c);

    // do some stuff

    try {
      String value = f.get();
      System.out.println(value);
    } catch (InterruptedException | ExecutionException e) {
      // :(
    }
  }
}
