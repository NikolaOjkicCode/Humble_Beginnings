# Conditionals and logic
## Important notes and pieces of code,from this chapter of the book!

The return statement allows you to terminate a method before you reach the
end of it. One reason to use return is if you detect an error condition:

```java
public static void printLogarithm(double x) {
    if (x <= 0.0) {
      System.err.println("Error: x must be positive.");
      return;
    }
    double result = Math.log(x);
    System.out.println("The log of x is " + result);
  }
  /*This example uses System.err, which is an OutputStream normally used for
   error messages and warnings. Some development environments display output
   to System.err with a di erent color or in a separate window.*/
```

The Scanner class provides hasNextDouble, which checks whether the next
token in the input stream can be interpreted as a double. If so, we can call
nextDouble with no chance of throwing an exception. If not, we display an
error message and return.

```java 
 public static void scanDouble(Scanner in) {
    System.out.print("Enter a number: ");
    if (!in.hasNextDouble()) {
      String word = in.next();
      System.err.println(word + " is not a number");
      return;
    }
    double x = in.nextDouble();
    printLogarithm(x);
  }
```

Now that we have conditional statements, we can explore one of the most
magical things a program can do: recursion. Consider the following example

```java
public static void countdown(int n) {
    if (n == 0) {
      System.out.println("Blastoff!");
    } else {
      System.out.println(n);
      countdown(n - 1);
    }
  }
  
  
  /*The countdown example has three parts: (1) it checks the base case, (2)
   displays something, and (3) makes a recursive call. What do you think happens
   if you reverse steps 2 and 3, making the recursive call before displaying?
   */
  public static void countup(int n) {
    if (n == 0) {
      System.out.println("Blastoff!");
    } else {
      countup(n - 1);
      System.out.println(n);
    }
  }
  
  /*This behavior comes in handy when it is easier to compute results in reverse or-
   der. For example, to convert a decimal integer into its binary representation,
   you repeatedly divide the number by two:
   
   23 / 2 is 11 remainder 1
   11 / 2 is 5 remainder 1
   5 / 2 is 2 remainder 1
   2 / 2 is 1 remainder 0
   1 / 2 is 0 remainder 1
   
   */
```

