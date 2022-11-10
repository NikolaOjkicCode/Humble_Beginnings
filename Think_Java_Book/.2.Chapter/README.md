# Variables and operators
## Important notes and pieces of code,from this chapter of the book!

```java

public class VariablesAndOperators{
  public static void main(String[] arg){
    
    String firstName;  
    String lastName;
    
   }
}
```
     This example declares two variables with type String and two with type
     int. When a variable name contains more than one word, like firstName,
     it is conventional to capitalize the  rst letter of each word except the  rst.
     Variable names are case-sensitive, so firstName is not the same as firstname
     or FirstName.

```java
public class VariablesAndOperators{
  public static void main(String[] arg){
     int hour, minute;
     hour = 11;
     minute = 15;
     
     
     /*Now that we have declared variables, we want to use them to store values. We
     do that with an assignment statement.*/
    
    /*When you declare a variable, you create a named storage location.
     When you make an assignment to a variable, you update its value.*/
    
    int a = 5;
    int b = a; // a and b are now equal
    a = 3;    // a and b are no longer equal
    
    String firstLine = "Hello, again!";
    System.out.println(firstLine);
  
   }
}
```

```java
public class VariablesAndOperators{
  public static void main(String[] arg){
    int hour, minute;
  
    hour = 11;
    minute = 15;
    
    System.out.print("The current time is ");
    System.out.print(hour);
    System.out.print(":");
    System.out.print(minute);
    System.out.println(".");
    
    /*To output multiple values on the same line, it's common to use several print
     statements followed by println at the end. But don't forget the println!
     On many computers, the output from print is stored without being displayed
     until println is run; then the entire line is displayed at once. If you omit the
     println, the program might display the stored output at unexpected times or
     even terminate without displaying anything.*/
    
    
    //The following program converts a time of day to minutes:
    
    System.out.print("Number of minutes since midnight: ");
    System.out.println(hour * 60 + minute);
    
    /*Operators are symbols that represent simple computations. For example, the
     addition operator is +, subtraction is -, multiplication is *, and division is /.*/
    
    /*Addition, subtraction, and multiplication all do what you expect, but you
     might be surprised by division. For example, the following fragment tries to
     compute the fraction of an hour that has elapsed:*/
    
    System.out.print("Fraction of the hour that has passed: ");
    System.out.println(minute / 60);
    
    /*The output is:  Fraction of the hour that has passed: 0
     This result often confuses people. The value of minute is 59, and 59 divided
     by 60 should be 0.98333, not 0. The problem is that Java performs integer
     division" when the operands are integers. By design, integer division always
     rounds toward zero, even in cases like this one where the next integer is close.
     */
    
    //As an alternative, we can calculate a percentage rather than a fraction:
    
    System.out.print("Percent of the hour that has passed: ");
    System.out.println(minute * 100 / 60 + "%");
    
    double pi;
    pi = 3.14159;
    
    /*Java performs floating-point division" when one or more operands are double
     values. So we can solve the problem we saw in the previous section:*/
     
    double minute2 = 59.0;
    System.out.print("Fraction of the hour that has passed: ");
    System.out.println(minute / 60.0);
    
    /*The + operator works with strings, but it might not do what you expect. For
     strings, the + operator performs concatenation, which means joining end-to-
     end. So "Hello, " + "World!" yields the string "Hello, World!".*/
    
    
    //Since addition is de ned for both numbers and strings, Java performs auto-matic conversions you may not expect:
    System.out.println(1 + 2 + "Hello");
    // the output is 3Hello
    System.out.println("Hello" + 1 + 2);
    // the output is Hello12
    
    /*Java executes these operations from left to right. In the  rst line, 1 + 2 is
     3, and 3 + "Hello" is "3Hello". But in the second line, "Hello" + 1 is
     "Hello1", and "Hello1" + 2 is "Hello12".*/
    
    /*Don't work too hard to remember the order of operations, especially for other
     operators. If it's not obvious by looking at the expression, use parentheses to
     make it clear.*/
     
    }
}
```
