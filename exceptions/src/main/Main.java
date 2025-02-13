package main;

import main.exceptions.MyCheckedException;
import main.exceptions.MyRuntimeException;
import main.exceptions.TooMuchMoneyException;

public class Main {

/*

Throwable
    Exception
        RuntimeException

    Error
        (Error cannot be treated by the application)
        OutOfMemoryError
        StackOverflowError

  -> checked exception: checked by the compiler
  -> unchecked exceptions (runtime) -> RuntimeException

 */
  public static void main(String[] args) {
    // CS
    // throw new MyRuntimeException();

    // CF
    // throw new MyCheckedException();

    try {
      new AccountController().withdraw(101); // try-catch
    } catch (TooMuchMoneyException e) {
    }

    I1 i = new C();

    i.m();


  }
}