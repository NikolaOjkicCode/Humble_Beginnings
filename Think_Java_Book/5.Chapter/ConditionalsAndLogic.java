import java.util.Scanner;

public class ConditionalsAndLogic{
  
  /*The return statement allows you to terminate a method before you reach the
   end of it. One reason to use return is if you detect an error condition:*/
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
  
  
  
  /*The Scanner class provides hasNextDouble, which checks whether the next
   token in the input stream can be interpreted as a double. If so, we can call
   nextDouble with no chance of throwing an exception. If not, we display an
   error message and return.*/
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
  
  /*Now that we have conditional statements, we can explore one of the most
   magical things a program can do: recursion. Consider the following example:*/
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
  
  public static void displayBinary(int value) {
    if (value > 0) {
      displayBinary(value / 2);
      System.out.print(value % 2);
    }
  }
  /*If value is zero, displayBinary does nothing (that's the base case). If the
   argument is positive, the method divides it by two and calls displayBinary
   recursively. When the recursive call returns, the method displays one digit of
   the result and returns (again).
   The leftmost digit is at the bottom of the stack, so it gets displayed  rst. The
   rightmost digit, at the top of the stack, gets displayed last. After invoking
   displayBinary, we use println to complete the output.*/
  
  public static void main(String[] args){
    
    Scanner in = new Scanner(System.in);
    
    int x = 5;
    int n = 4;
    
    /*Relational operators are used to check conditions like whether two values
     are equal, or whether one is greater than the other. The following expressions
     show how they are used:*/
    
    /*
     * 
     x == y // x is equal to y
     x != y // x is not equal to y
     x > y // x is greater than y
     x < y // x is less than y
     x >= y // x is greater than or equal to y
     x <= y // x is less than or equal to y
     
     */
    
    /*The result of a relational operator is one of two special values, true or false.
     These values belong to the data type boolean; in fact, they are the only
     boolean values.
     */
    
    
    String fruit1 = "Apple";
    String fruit2 = "Orange";
    System.out.println(fruit1.equals(fruit2));
    
    //The result of fruit1.equals(fruit2) is the boolean value false.
    
    
    /*
     Java has three logical operators: &&, ||, and !, which respectively stand for
     and, or, and not.
     */
    
    /*
     Logical operators evaluate the second expression only when necessary. For
     example, true || anything is always true, so Java does not need to evalu-
     ate the expression anything. Likewise, false && anything is always false.
     */
    
    /*
     If you ever have to negate an expression that contains logical operators, and
     you probably will, De Morgan's laws can help:
     ? !(A && B) is the same as !A || !B
     ? !(A || B) is the same as !A && !B
     Negating a logical expression is the same as negating each term and changing
     the operator. The ! operator takes precedence over && and ||, so you don't
     have to put parentheses around the individual terms !A and !B.
     De Morgan's laws also apply to the relational operators. In this case, negating
     each term means using the \opposite" relational operator.
     ? !(x < 5 && y == 3) is the same as x >= 5 || y != 3
     ? !(x >= 1 || y != 7) is the same as x < 1 && y == 7
     It may help to read these examples out loud in English. For instance, \If I
     don't want the case where x is less than 5 and y is 3, then I need x to be
     greater than or equal to 5, or I need y to be anything but 3."
     */
    
    //Conditional statements give us this ability. The simplest conditional statement in Java is the if statement:
    
    if (x > 0) {
      System.out.println("x is positive");
    }
    
    /*A second form of conditional statement has two possibilities, indicated by if
     and else. The possibilities are called branches, and the condition determines
     which one gets executed:*/
    
    if (x % 2 == 0) {
      System.out.println("x is even");
    } else {
      System.out.println("x is odd");
    }
    
    
    /*Sometimes you want to check related conditions and choose one of several
     actions. One way to do this is by chaining a series of if and else statements:*/
    
    if (x > 0) {
      System.out.println("x is positive");
    } else if (x < 0) {
      System.out.println("x is negative");
    } else {
      System.out.println("x is zero");
    }
    
    /*In addition to chaining, you can also make complex decisions by nesting one
     conditional statement inside another. We could have written the previous
     example as:*/
    
    if (x == 0) {
      System.out.println("x is zero");
    } else {
      if (x > 0) {
        System.out.println("x is positive");
      } else {
        System.out.println("x is negative");
      }
    }
    
    /*To store a true or false value, you need a boolean variable. You can create
     one like this:*/
    
    boolean flag;
    flag = true;
    boolean testResult = false;
    
    boolean evenFlag = (n % 2 == 0); // true if n is even
    boolean positiveFlag = (x > 0); // true if x is positive
    
    if (evenFlag) {
      System.out.println("n was even when I checked it");
    }
    if (!evenFlag) {
      System.out.println("n was odd when I checked it");
    }
    
    printLogarithm(x);
    scanDouble(in);
    countdown(n);
    countup(n);
    
    displayBinary(23);
    System.out.println();
    
    
    //Vocabulary
    
    /*
     boolean: A data type with only two values, true and false.
     
     relational operator: An operator that compares two values and produces a
     boolean indicating the relationship between them.
     
     logical operator: An operator that combines boolean values and produces a
     boolean value.
     
     short circuit: A way of evaluating logical operators that only evaluates the
     second operand if necessary.
     
     De Morgan's laws: Mathematical rules that show how to negate a logical
     expression.
     
     conditional statement: A statement that uses a condition to determine
     which statements to execute.
     
     branch: One of the alternative sets of statements inside a conditional state-
     ment.
     
     chaining: A way of joining several conditional statements in sequence.
     
     nesting: Putting a conditional statement inside one or both branches of an-
     other conditional statement.
     
     flag: A variable (usually boolean) that represents a condition or status.
     recursion: The process of invoking (and restarting) the same method that is
     currently executing.
     
     recursive: A method that invokes itself, usually with di erent arguments.
     
     base case: A condition that causes a recursive method not to make another
     recursive call.
     
     binary: A system that uses only zeros and ones to represent numbers. Also
     known as \base 2". 
     */
  }
}