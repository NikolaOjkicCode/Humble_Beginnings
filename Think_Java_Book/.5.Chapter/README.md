# Conditionals and logic
## Important notes and pieces of code,from this chapter of the book!

___
### *Relational operators*

Relational operators are used to check conditions like whether two values
are equal, or whether one is greater than the other. The following expressions
show how they are used:

```java
x == y // x is equal to y
x != y // x is not equal to y
x > y // x is greater than y
x < y // x is less than y
x >= y // x is greater than or equal to y
x <= y // x is less than or equal to y
```

The result of a relational operator is one of two special values, true or false.
These values belong to the data type boolean; in fact, they are the only
boolean values.

The two sides of a relational operator have to be compatible. For example, the
expression 5 < "6" is invalid because 5 is an int and "6" is a String. When
comparing values of diferent numeric types, Java applies the same conversion
rules we saw previously with the assignment operator. For example, when
evaluating the expression 5 < 6.0, Java automatically converts the 5 to 5.0.

Most relational operators don't work with strings. But confusingly, == and
!= do work with strings { they just don't do what you expect.
Instead,you should use the equals method:

```java
String fruit1 = "Apple";
String fruit2 = "Orange";
System.out.println(fruit1.equals(fruit2));
```

The result of fruit1.equals(fruit2) is the boolean value false.

___
### *Logical operators*

Java has three logical operators: &&, ||, and !, which respectively stand for
and, or, and not. The results of these operators are similar to their meanings
in English.

For example, x > 0 && x < 10 is true when x is both greater than zero and
less than 10. The expression evenFlag || n % 3 == 0 is true if either con-
dition is true, that is, if evenFlag is true or the number n is divisible by 3.
Finally, the ! operator inverts a boolean expression. So !evenFlag is true if
evenFlag is not true.

Logical operators evaluate the second expression only when necessary. For
example, true || anything is always true, so Java does not need to evaluate 
the expression anything. Likewise, false && anything is always false.

If you ever have to negate an expression that contains logical operators, and
you probably will, De Morgan's laws can help:

    !(A && B) is the same as !A || !B
    !(A || B) is the same as !A && !B
    
Negating a logical expression is the same as negating each term and changing
the operator. The ! operator takes precedence over && and ||, so you don't
have to put parentheses around the individual terms !A and !B.

De Morgan's laws also apply to the relational operators. In this case, negating
each term means using the "opposite" relational operator.

    !(x < 5 && y == 3) is the same as x >= 5 || y != 3
    !(x >= 1 || y != 7) is the same as x < 1 && y == 7
    
___
### *Conditional statements*

To write useful programs, we almost always need to check conditions and
react accordingly. Conditional statements give us this ability. The simplest
conditional statement in Java is the if statement:

```java
if (x > 0) {
  System.out.println("x is positive");
}
```

The expression in parentheses is called the condition. If it is true, the statements 
in braces get executed. If the condition is false, execution skips over that
block of code. The condition in parentheses can be any boolean expression.

A second form of conditional statement has two possibilities, indicated by if
and else. The possibilities are called branches, and the condition determines
which one gets executed:

```java
if (x % 2 == 0) {
  System.out.println("x is even");
} else {
  System.out.println("x is odd");
}
```

If the remainder when x is divided by 2 is zero, we know that x is even, and
this fragment displays a message to that efect. If the condition is false, the
second print statement is executed instead. Since the condition must be true
or false, exactly one of the branches will run.

___
### *Chaining and nesting*

Sometimes you want to check related conditions and choose one of several
actions. One way to do this is by chaining a series of if and else statements:

```java
if (x > 0) {
  System.out.println("x is positive");
} else if (x < 0) {
  System.out.println("x is negative");
} else {
  System.out.println("x is zero");
}
```

In addition to chaining, you can also make complex decisions by nesting one
conditional statement inside another. We could have written the previous
example as:

```java
if (x == 0) {
  System.out.println("x is zero");
  } else {
    if (x > 0) {
      System.out.println("x is positive");
    } else {
      System.out.println("x is negative");
  }
}
```

___
### *Flag variables*

To store a true or false value, you need a boolean variable. You can create
one like this:

```java
boolean flag;
flag = true;
boolean testResult = false;
```

The first line is a variable declaration, the second is an assignment, and the
third is both. Since relational operators evaluate to a boolean value, you can
store the result of a comparison in a variable:

```java
boolean evenFlag = (n % 2 == 0); // true if n is even
boolean positiveFlag = (x > 0); // true if x is positive
```

The parentheses are unnecessary, but they make the code easier to read. A
variable defined in this way is called a flag, because it signals or "flag" the
presence or absence of a condition.

You can use flag variables as part of a conditional statement later:

```java
if (evenFlag) {
  System.out.println("n was even when I checked it");
}
```

Notice that you don't have to write if (evenFlag == true). Since evenFlag
is a boolean, it's already a condition. Likewise, to check if a 
flag is false:

```java
if (!evenFlag) {
  System.out.println("n was odd when I checked it");
}
```
___
### *The return statement*

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
```

This example uses System.err, which is an OutputStream normally used for
error messages and warnings. Some development environments display output
to System.err with a diferent color or in a separate window.


___
### *Validating input*

Here is a method that uses printLogarithm from the previous section:

```java
public static void scanDouble(Scanner in) {
  System.out.print("Enter a number: ");
  double x = in.nextDouble();
  printLogarithm(x);
}

```
This example uses nextDouble, so the Scanner (provided by the main method)
tries to read a double. If the user enters a foating-point number, the Scanner
converts it to a double. But if the user types anything else, the Scanner throws
an InputMismatchException.

We can prevent this error by checking the input before parsing it:

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

The Scanner class provides hasNextDouble, which checks whether the next
token in the input stream can be interpreted as a double. If so, we can call
nextDouble with no chance of throwing an exception. If not, we display an
error message and return.

___
### *Recursive methods*

Now that we have conditional statements, we can explore one of the most
magical things a program can do: recursion. Consider the following example:

```java
public static void countdown(int n) {
   if (n == 0) {
      System.out.println("Blastoff!");
  } else {
      System.out.println(n);
      countdown(n - 1);
  }
}
```

The name of the method is countdown; it takes a single integer as a parameter.
If the parameter is zero, it displays the word "Blastof". Otherwise, it displays
the number and then invokes itself, passing n - 1 as the argument. A method
that invokes itself is called recursive.

As a second example, we'll rewrite the methods newLine and threeLine:

```java
public static void newLine() {
  System.out.println();
}

public static void threeLine() {
newLine();
newLine();
newLine();
}
```

Although these methods work, they would not help if we wanted to display
two newlines, or maybe 100. A better alternative would be:

```java
public static void nLines(int n) {
  if (n > 0) {
    System.out.println();
    nLines(n - 1);
  }
}
```

This method takes an integer, n, as a parameter and displays n newlines. The
structure is similar to countdown. As long as n is greater than zero, it displays
a newline and then invokes itself to display (n - 1) additional newlines. The
total number of newlines is 1 + (n - 1), which is just what we wanted: n.
___
### *Recursive stack diagrams*

In the previous chapter, we used a stack diagram to represent the state of a
program during a method invocation. The same kind of diagram can make it
easier to interpret a recursive method.

Remember that every time a method gets called, Java creates a new frame
that contains the current method's parameters and variables. Figure 5.1 is a
stack diagram for countdown, called with n == 3.

![stack diagrams](https://github.com/NikolaOjkicCode/Humble_Beginnings/blob/main/Think_Java_Book/Miscellaneous/Screenshot%20(10).png)

There are four frames for countdown, each with a diferent value for the parameter n. 
The last frame, with n == 0, is called the base case. It does not
make a recursive call, so there are no more frames below it.

If there is no base case in a recursive method, or if the base case is never
reached, the stack would grow forever, at least in theory. In practice, the size
of the stack is limited; if you exceed the limit, you get a StackOverflowError.

For example, here is a recursive method without a base case:

```java
public static void forever(String s) {
  System.out.println(s);
  forever(s);
}
```

This method displays the string until the stack overflows, at which point it
throws an exception.

___
### *Binary numbers*

The countdown example has three parts: (1) it checks the base case, (2)
displays something, and (3) makes a recursive call. What do you think happens
if you reverse steps 2 and 3, making the recursive call before displaying?

```java
public static void countup(int n) {
  if (n == 0) {
    System.out.println("Blastoff!");
  } else {
    countup(n - 1);
    System.out.println(n);
  }
}
```

The stack diagram is the same as before, and the method is still called n
times. But now the System.out.println happens just before each recursive
call returns. As a result, it counts up instead of down:

    Blastoff!
    1
    2
    3

This behavior comes in handy when it is easier to compute results in reverse order. 
For example, to convert a decimal integer into its binary representation,
you repeatedly divide the number by two:

    23 / 2 is 11 remainder 1
    11 / 2 is 5 remainder 1
    5 / 2 is 2 remainder 1
    2 / 2 is 1 remainder 0
    1 / 2 is 0 remainder 1
    
Reading these remainders from bottom to top, 23 in binary is 10111.

Here is a recursive method that displays the binary representation of any
positive integer:

```java
public static void displayBinary(int value) {
  if (value > 0) {
    displayBinary(value / 2);
    System.out.print(value % 2);
  }
}
```

If value is zero, displayBinary does nothing (that's the base case). If the
argument is positive, the method divides it by two and calls displayBinary
recursively. When the recursive call returns, the method displays one digit of
the result and returns (again).

The leftmost digit is at the bottom of the stack, so it gets displayed first. The
rightmost digit, at the top of the stack, gets displayed last. After invoking
displayBinary, we use println to complete the output.

```java
displayBinary(23);
System.out.println();
// output is 10111
```



