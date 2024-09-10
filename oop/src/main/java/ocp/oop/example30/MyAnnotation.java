package ocp.oop.example30;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.CONSTRUCTOR})
public @interface MyAnnotation {

  int value() default 5;
}
