public class ValueMethods{
  
  /*Here's an example: calculateArea takes a double as a parameter and returns
   the area of a circle with that radius:*/
  
  public static double calculateArea(double radius) {
    double result = Math.PI * radius * radius;
    return result;
  }
  
  //Shorter version of the same code
  public static double calculateArea2(double radius) {
    return Math.PI * radius * radius;
  }
  
  //------------------------------------------------------------------------------------------------
  /*Code that appears after a return statement (in the same block), or any place
   else where it can never be executed, is called dead code. The compiler will
   give you an unreachable statement" error if part of your code is dead. For
   example, this method contains dead code:*/
  
  public static double absoluteValue(double x) {
    if (x < 0) {
      return -x;
    } else {
      return x;
    }
    // System.out.println("This line is dead."); - DEAD CODE
  }
  
  //------------------------------------------------------------------------------------------------
  /*If you put return statements inside a conditional statement, you have to
   make sure that every possible path through the program reaches a return
   statement. The compiler will let you know if that's not the case. For example,
   the following method is incomplete:*/
  
  public static double absoluteValue2(double x) {
    if (x < 0) {
      return -x;
    } else if (x > 0) {
      return x;
    }
    return x;  // syntax error IF THERE WAS NO "return x;" here
  }
  
  //------------------------------------------------------------------------------------------------
  /*If two methods do the same thing, it is natural to give them the same name.
   Having more than one method with the same name is called overloading,
   and it is legal in Java as long as each version takes di erent parameters.*/
  
  public static double distance
    (double x1, double y1, double x2, double y2) {
    double dx = x2 - x1;
    double dy = y2 - y1;
    double dsquared = dx * dx + dy * dy;
    double result = Math.sqrt(dsquared);
    return result;
  }
  
  public static double calculateArea
    (double xc, double yc, double xp, double yp) {
    return calculateArea(distance(xc, yc, xp, yp));
  }
  
  //------------------------------------------------------------------------------------------------
  /* Methods can return boolean values, just like any other type, which is often
   convenient for hiding tests inside methods. For example:*/
  public static boolean isSingleDigit(int x) {
    if (x > -10 && x < 10) {
      return true;
    } else {
      return false;
    }
  }
  public static boolean isSingleDigit2(int x) {
    return x > -10 && x < 10;
  }
  
  //------------------------------------------------------------------------------------------------
  //MORE RECURSIONS!
  
  /*Many mathematical functions are de ned recursively, because that is often the
   simplest way. For example, the factorial of an integer n, which is written n!,
   is de ned like this:
   
              0! = 1
              n! = n   (n - 1)!
  
  This de nition says that factorial(0) is
  1, and that factorial(n) is n * factorial(n - 1).
  
  So factorial(3) is 3 * factorial(2); factorial(2) is 2 * factorial(1);
  factorial(1) is 1 * factorial(0); and factorial(0) is 1. Putting it all
  together, we get 3 * 2 * 1 * 1, which is 6.
  */
  public static int factorial(int n) {
    if (n == 0) {
      return 1;
    }
    int recurse = factorial(n - 1);
    int result = n * recurse;
    return result;
  }
  /*Since 3 is not zero, we take the second branch and calculate the
   factorial of n - 1...
   
          Since 2 is not zero, we take the second branch and cal-
          culate the factorial of n - 1...
          
                  Since 1 is not zero, we take the second branch
                  and calculate the factorial of n ? 1...
                  
                         Since 0 is zero, we take the  rst branch
                         and return the value 1 immediately.
                  
                  The return value (1) gets multiplied by n, which
                  is 1, and the result is returned.
          
          The return value (1) gets multiplied by n, which is 2,
          and the result is returned.
          
    The return value (2) gets multiplied by n, which is 3, and the result,
    6, is returned to whatever invoked factorial(3).
   
   */
  
  //------------------------------------------------------------------------------------------------
  
  /*Another common recursively-de ned mathematical function is the Fibonacci
   sequence, which has the following de nition:
   
          fibonacci(1) = 1
          fibonacci(2) = 1
          fibonacci(n) = fibonacci(n - 1) + fibonacci(n - 2)
          
  Translated into Java, this function is:
  */
  
  public static int fibonacci(int n) {
    if (n == 1 || n == 2) {
      return 1;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }
  //------------------------------------------------------------------------------------------------
  
  public static void main(String[] arg){
    
    int z = 2;
    
    System.out.println(calculateArea(2.2));
    System.out.println(calculateArea2(2.2));
    System.out.println(calculateArea(1.0, 2.0, 4.0, 6.0));
    
    /*
     The  rst line displays true because 2 is a single-digit number. The second
     line sets bigFlag to true, because 17 is not a single-digit number.*/
    System.out.println(isSingleDigit(2));
    boolean bigFlag = !isSingleDigit(17);
    
    /*Conditional statements often invoke boolean methods and use the result as
     the condition:*/
    if (isSingleDigit(z)) {
      System.out.println("z is small");
    } else {
      System.out.println("z is big");
    }
    
    //------------------------------------------------------------------------------------------------
    //Vocabulary
    
    /*
     void method: A method that does not return a value.
     
     value method: A method that returns a value.
     
     return type: The type of value a method returns.
     
     return value: The value provided as the result of a method invocation.
     
     temporary variable: A short-lived variable, often used for debugging.
     
     dead code: Part of a program that can never be executed, often because it
     appears after a return statement.
     
     incremental development: A process for creating programs by writing a
     few lines at a time, compiling, and testing.
     
     stub: A placeholder for an incomplete method so that the class will compile.
     
     sca olding: Code that is used during program development but is not part
     of the  nal version.
     
     functional decomposition: A process for breaking down a complex compu-
     tation into simple methods, then composing the methods to perform the
     computation.
     
     overload: To de ne more than one method with the same name but di erent
     parameters.
     
     tag: A label that begins with an at sign (@) and is used by Javadoc to organize
     documentation into sections.
     
     Turing complete: A programming language that can implement any theo-
     retically possible algorithm.
     
     factorial: The product of all the integers up to and including a given integer.
     
     leap of faith: A way to read recursive programs by assuming that the recur-
     sive call works, rather than following the  ow of execution.
     */
  }
}