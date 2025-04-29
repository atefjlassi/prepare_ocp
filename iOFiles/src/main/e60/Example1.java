package main.e60;

import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

// Writing and reading from files
public class Example1 {

  public static void main(String[] args) {
    // a High-level output stream can be wrapped with it Low-level output stream only
    // a Low-level input stream can be wrapped with it High-level input stream

    /**
     *
     * FileOutputStream
     * FileInputStream
     *
     * BufferedWriter ---> Writer (object tell how to write)
     * BufferedReader ---> Reader (object tell how to read)
     *
     *
     * PrintStream --> System.out / System.err
     * PrintWriter
     */

    // No need to use out.flush() , see Example2
    try (Writer w = new FileWriter("test1.txt");
        BufferedWriter out = new BufferedWriter(w)) {

      out.write("Hello world!");
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
//    catch (FileNotFoundException e) {
//
//    }

  }
}
