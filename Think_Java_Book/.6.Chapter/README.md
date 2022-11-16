# Value methods
## Important notes and pieces of code,from this chapter of the book!

Here's an example: calculateArea takes a double as a parameter and returns
the area of a circle with that radius:

```java
public static double calculateArea(double radius) {
    double result = Math.PI * radius * radius;
    return result;
  }
```

Shorter version of the same code:

```java
public static double calculateArea2(double radius) {
    return Math.PI * radius * radius;
  }
```

Code that appears after a return statement (in the same block), or any place
else where it can never be executed, is called dead code. The compiler will
give you an unreachable statement" error if part of your code is dead. For
example, this method contains dead code:

```java
public static double absoluteValue(double x) {
    if (x < 0) {
      return -x;
    } else {
      return x;
    }
    // System.out.println("This line is dead."); - DEAD CODE
  }
```

If you put return statements inside a conditional statement, you have to
make sure that every possible path through the program reaches a return
statement. The compiler will let you know if that's not the case. For example,
the following method is incomplete:

```java
public static double absoluteValue2(double x) {
    if (x < 0) {
      return -x;
    } else if (x > 0) {
      return x;
    }
   // syntax error 
  }
```

If two methods do the same thing, it is natural to give them the same name.
Having more than one method with the same name is called overloading,
and it is legal in Java as long as each version takes diferent parameters.

Methods can return boolean values, just like any other type, which is often
convenient for hiding tests inside methods. For example:

```java
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
```

Many mathematical functions are de ned recursively, because that is often the
   simplest way. For example, the factorial of an integer n, which is written n!,
   is de ned like this:
   
              0! = 1
              n! = n   (n - 1)!
  
  This definition says that factorial(0) is
  1, and that factorial(n) is n * factorial(n - 1).
  
  So factorial(3) is 3 * factorial(2); 
  
  factorial(2) is 2 * factorial(1);
  
  factorial(1) is 1 * factorial(0); 
  
  and factorial(0) is 1. Putting it all
  
  together, we get 3 * 2 * 1 * 1, which is 6.
  
```java
public static int factorial(int n) {
    if (n == 0) {
      return 1;
    }
    int recurse = factorial(n - 1);
    int result = n * recurse;
    return result;
  }
````
    Since 3 is not zero, we take the second branch and calculate the
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
    
 Another common recursively-defened mathematical function is the Fibonacci
   sequence, which has the following definition:
   
          fibonacci(1) = 1
          fibonacci(2) = 1
          fibonacci(n) = fibonacci(n - 1) + fibonacci(n - 2)
          
  Translated into Java, this function is:
  
  ```java
  public static int fibonacci(int n) {
    if (n == 1 || n == 2) {
      return 1;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }
  ```
  
  
