public class VoidMethods{
  
  public static void newLine(){
    System.out.println();
  }
  
  public static void threeLine() {
    newLine();
    newLine();
    newLine();
  }
  
  public static void printTwice(String s) {
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
    
    
    /*Arguments of the trigonometric functions { sin, cos, and tan { should be
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
    
    
    /*Method names should begin with a lowercase letter and use \camel case",
     which is a cute name for jammingWordsTogetherLikeThis. You can use any
     name you want for methods, except main or any of the Java keywords.*/
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
    
    //Vocabulary
    
    /*
     argument: A value that you provide when you invoke a method. This value
     must have the same type as the corresponding parameter.
     
     invoke: To cause a method to execute. Also known as \calling" a method.
     
     parameter: A piece of information that a method requires before it can run.
     Parameters are variables: they contain values and have types.
     
     flow of execution: The order in which Java executes methods and state-
     ments. It may not necessarily be from top to bottom, left to right.
     
     parameter passing: The process of assigning an argument value to a pa-
     rameter variable.
     
     local variable: A variable declared inside a method. Local variables cannot
     be accessed from outside their method.
     
     stack diagram: A graphical representation of the variables belonging to each
     method. The method calls are \stacked" from top to bottom, in the  ow
     of execution.
     
     frame: In a stack diagram, a representation of the variables and parameters
     for a method, along with their current values.
     
     signature: The  rst line of a method that de nes its name, return type, and
     parameters.
     
     Javadoc: A tool that reads Java source code and generates documentation
     in HTML format.
     
     documentation: Comments that describe the technical operation of a class
     or method.
     */
  }
}