Lambda Expressions were added in Java 8.
A lambda expression is a short block of code which takes in parameters and returns a value.
Lambda expressions are similar to methods, but they do not need a name, and they can be implemented right in the body of a method.

In Java, Lambda expressions basically express instances of functional interfaces (An interface with a single abstract method is called a functional interface).

Syntax: (parameter1, parameter2) -> { code block }
Ex:
import java.util.ArrayList;

    public class Main {
    public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);
    numbers.forEach( (n) -> { System.out.println(n); } );
    }
    }

Lambda expressions can be stored in variables if the variable's type is an interface which has only one method.
The lambda expression should have the same number of parameters and the same return type as that method.

Java lambda functions can be only used with functional interfaces.

The Lambda expression is used to provide the implementation of an interface which has functional interface.
It saves a lot of code. In case of lambda expression, we don't need to define the method again for providing the implementation. Here, we just write the implementation code.

Java lambda expression is treated as a function, so compiler does not create .class file.

Why use Lambda Expression
To provide the implementation of Functional interface.
Less coding.


To use a lambda expression in a method, the method should have a parameter with a single-method interface as its type. Calling the interface's method will run the lambda expression:
Ex:
interface StringFunction {
String run(String str);
}

    public class Main {
    public static void main(String[] args) {
    StringFunction exclaim = (s) -> s + "!";
    StringFunction ask = (s) -> s + "?";
    printFormatted("Hello", exclaim);
    printFormatted("Hello", ask);
    }
    public static void printFormatted(String str, StringFunction format) {
    String result = format.run(str);
    System.out.println(result);
    }
    }