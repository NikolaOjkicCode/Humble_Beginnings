# Void methods

     Method names should begin with a lowercase letter and use camel case,
     which is a cute name for jammingWordsTogetherLikeThis. You can use any
     name you want for methods, except main or any of the Java keywords.
     
     Callin a method is done in the "main" method:
     
 ```java
 printTwice("Don't make me say this twice!");
 ```

```java
public class VoidMethods{
  
  public static void newLine(){   //Method - when called adds a new line
    System.out.println();
  }
  
  public static void threeLine() { //Method - when called adds 3 new lines
    newLine();
    newLine();
    newLine();
  }
  
  public static void printTwice(String s) {  //Method - when called prints 2 times a string that was passed to the method with "String s" parameter
    System.out.println(s);
    System.out.println(s);
  }
  
  public static void printTime(int hour, int minute) {
    System.out.print(hour);
    System.out.print(":");
    System.out.println(minute);
  }
  
  public static void main(String[] arg){
    
    /*The Java library includes a Math class that provides common mathematical
     operations. Math is in the java.lang package, so you don't have to import it.*/
    double root = Math.sqrt(17.0);
    double angle = 1.5;
    double height = Math.sin(angle);
    
    
    /*Arguments of the trigonometric functions  sin, cos, and tan  should be
     in radians. To convert from degrees to radians, you can divide by 180 and
     multiply by  . Conveniently, the Math class provides a constant double named
     PI that contains an approximation of  */
    double degrees = 90;
    double angle2 = degrees / 180.0 * Math.PI;
    
    
    /*Converting to and from radians is a common operation, so the Math class
     provides methods that do it for you.*/
    double radians = Math.toRadians(180.0);
    double degrees2 = Math.toDegrees(Math.PI);
    
    
    /*Another useful method is round, which rounds a  oating-point value to the
     nearest integer and returns a long. A long is like an int, but bigger. More
     speci cally, an int uses 32 bits; the largest value it can hold is 231 ? 1, which
     is about 2 billion. A long uses 64 bits, so the largest value is 263 ?1, which is
     about 9 quintillion.*/
    long x = Math.round(Math.PI * 20.0);
    
    
    /*Just as with mathematical functions, Java methods can be composed. That
     means you can use one expression as part of another. For example, you can
     use any expression as an argument to a method*/
    double y = Math.cos(angle + Math.PI / 2.0);
    /*This statement divides Math.PI by two, adds the result to angle, and com-
     putes the cosine of the sum. You can also take the result of one method and
     pass it as an argument to another*/
    double z = Math.exp(Math.log(10.0));
    
    /*Some math methods take more than one argument. For example, Math.pow
     takes two arguments and raises the  rst to the power of the second. This line
     of code assigns the value 1024.0 to the variable x:*/
    double j = Math.pow(2.0, 10.0);
    
    
    System.out.println("First line.");
    newLine();
    System.out.println("Second line.");
    threeLine();
    System.out.println("Third line.");
    
    
    printTwice("Don't make me say this twice!");
    
    String argument = "Never say never.";
    printTwice(argument);
    
    int hour = 11;
    int minute = 59;
    printTime(hour, minute);
    
  }
}

```
