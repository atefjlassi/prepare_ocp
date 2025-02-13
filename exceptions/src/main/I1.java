package main;


import main.exceptions.MyRuntimeException;
import main.exceptions.TooMuchMoneyException;

public interface I1 {

  void m() throws RuntimeException; // runtime exception are propagated automatically you won't need do this
  // But
  // sometimes you throw runtime exception for document purposes
}