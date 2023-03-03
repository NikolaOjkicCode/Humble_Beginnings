# Void methods
## Important notes and pieces of code,from this chapter of the book!

    
___
### *Math methods*

The Java library includes a Math class that provides common mathematical
operations. Math is in the java.lang package, so you don't have to import it.
You can use, or invoke, Math methods like this:

```java
double root = Math.sqrt(17.0);
double angle = 1.5;
double height = Math.sin(angle);
```

Arguments of the trigonometric functions  sin, cos, and tan should be
in radians. To convert from degrees to radians, you can divide by 180 and
multiply by pi. Conveniently, the Math class provides a constant double named
PI that contains an approximation of pi:

```java
double degrees = 90;
double angle = degrees / 180.0 * Math.PI;
```

Converting to and from radians is a common operation, so the Math class
provides methods that do it for you.

```java
double radians = Math.toRadians(180.0);
double degrees = Math.toDegrees(Math.PI);
```

Another useful method is round, which rounds a 
oating-point value to the
nearest integer and returns a long. A long is like an int, but bigger. More
specifiecally, an int uses 32 bits; the largest value it can hold is 2^31 - 1, which
is about 2 billion. A long uses 64 bits, so the largest value is 2^63 - 1, which is
about 9 quintillion.

```java
long x = Math.round(Math.PI * 20.0);
```
            The result is 63 (rounded up from 62.8319).

___
### *Composition revisited*

Just as with mathematical functions, Java methods can be composed. That
means you can use one expression as part of another. For example, you can
use any expression as an argument to a method:

```java
double x = Math.cos(angle + Math.PI / 2.0);
```

This statement divides Math.PI by two, adds the result to angle, and computes 
the cosine of the sum. You can also take the result of one method and
pass it as an argument to another:

```java
double x = Math.exp(Math.log(10.0));
```
In Java, the log method always uses base e. So this statement finds the log
base e of 10, and then raises e to that power. The result gets assigned to x.

Some math methods take more than one argument. For example, Math.pow
takes two arguments and raises the first to the power of the second. This line
of code assigns the value 1024.0 to the variable x:

```java
double x = Math.pow(2.0, 10.0);
```
___
### *Adding new methods*

Here's an example:

```java
public class NewLine {
    public static void newLine() {
        System.out.println();
    }
    
    public static void main(String[] args) {
        System.out.println("First line.");
        newLine();
        System.out.println("Second line.");
    }
}
```

The name of the class is NewLine. By convention, class names begin with a
capital letter. NewLine contains two methods, newLine and main. Remember
that Java is case-sensitive, so NewLine and newLine are not the same.

Method names should begin with a lowercase letter and use "camel case",
which is a cute name for jammingWordsTogetherLikeThis. You can use any
name you want for methods, except main or any of the Java keywords.

The parentheses after the method name contain a list of variables, called parameters, 
where the method stores its arguments. main has a single parameter, 
called args, which has type String[]. That means that whoever invokes
main must provide an array of strings

Since newLine has no parameters, it requires no arguments, as shown when
it is invoked in main. And because newLine is in the same class as main, we
don't have to specify the class name.

___
### *Flow of execution*

Pulling together the code from the previous section, the complete program
looks like this:

```java
public class NewLine {
    public static void newLine() {
        System.out.println();
    }
    
    public static void threeLine() {
        newLine();
        newLine();
        newLine();
    }
    
    public static void main(String[] args) {
    
        System.out.println("First line.");
        threeLine();
        System.out.println("Second line.");
    }
}
```

When you look at a class definition that contains several methods, it is tempting 
to read it from top to bottom. But that is likely to be confusing, because that is not the 
flow of execution of the program.

Execution always begins at the first statement of main, regardless of where it
is in the source file. Statements are executed one at a time, in order, until you
reach a method invocation, which you can think of as a detour. Instead of
going to the next statement, you jump to the first line of the invoked method,
execute all the statements there, and then come back and pick up exactly
where you left off.

That sounds simple enough, but remember that one method can invoke an-
other one. In the middle of main, we go off to execute the statements in
threeLine. While we are executing threeLine, we go off to execute newLine.
Then newLine invokes println, which causes yet another detour.

Fortunately, Java is good at keeping track of which methods are running.
So when println completes, it picks up where it left off in newLine; when
newLine completes, it goes back to threeLine, and when threeLine completes, 
it gets back to main.

            In summary, when you read a program, don't read from top to bottom. Instead, follow the 
            flow of execution.
            
___
### *Parameters and arguments*

When you use a method, you provide the arguments. When you write a
method, you name the parameters. The parameter list indicates what arguments are required. 
The following class shows an example:

```java
public class PrintTwice {
    public static void printTwice(String s) {
        System.out.println(s);
        System.out.println(s);
    }
    
    public static void main(String[] args) {
    
        printTwice("Don't make me say this twice!");
    }
}
```

printTwice has a parameter named s with type String. When we invoke
printTwice, we have to provide an argument with type String.

Before the method executes, the argument gets assigned to the parameter.
In this example, the argument "Don't make me say this twice!" gets assigned to the parameter s.

This process is called parameter passing because the value gets passed from
outside the method to the inside. An argument can be any kind of expression,
so if you have a String variable, you can use it as an argument:

```java
String argument = "Never say never.";
printTwice(argument);
```

The value you provide as an argument must have the same type as the parameter.

Sometimes Java can convert an argument from one type to another auto-
matically. For example, Math.sqrt requires a double, but if you invoke
Math.sqrt(25), the integer value 25 is automatically converted to the 
floating-point value 25.0. But in the case of printTwice, Java can't (or won't) convert
the integer 17 to a String.

Parameters and other variables only exist inside their own methods. Inside
main, there is no such thing as s. If you try to use it there, you'll get a compiler
error. Similarly, inside printTwice there is no such thing as argument. That
variable belongs to main.

Because variables only exist inside the methods where they are defined, they
are often called local variables.

___
### *Multiple parameters*

Here is an example of a method that takes two parameters:

```java
public static void printTime(int hour, int minute) {
    System.out.print(hour);
    System.out.print(":");
    System.out.println(minute);
}
```

In the parameter list, it may be tempting to write:

```java
public static void printTime(int hour, minute) {
...

```
But that format (without the second int) is only legal for variable declarations.
In parameter lists, you need to specify the type of each variable separately.

To invoke this method, we have to provide two integers as arguments:

```java
int hour = 11;
int minute = 59;
printTime(hour, minute);
```

A common error is to declare the types of the arguments, like this:

```java
int hour = 11;
int minute = 59;
printTime(int hour, int minute); // syntax error
```

That's a syntax error; the compiler sees int hour and int minute as variable
declarations, not expressions. You wouldn't declare the types of the arguments
if they were simply integers:

```java
printTime(int 11, int 59); // syntax error
```

___
### *Stack diagrams*

Pulling together the code fragments from the previous section, here is a complete class definition:

```java
public class PrintTime {
    public static void printTime(int hour, int minute) {
        System.out.print(hour);
        System.out.print(":");
        System.out.println(minute);
    }
    
    public static void main(String[] args) {
        int hour = 11;
        int minute = 59;
        printTime(hour, minute);
    }
}
```

printTime has two parameters, named hour and minute. And main has two
variables, also named hour and minute. Although they have the same names,
these variables are not the same. hour in printTime and hour in main refer
to diferent storage locations, and they can have diferent values.

For example, you could invoke printTime like this:

```java
int hour = 11;
int minute = 59;
printTime(hour + 1, 0);
```

Before the method is invoked, Java evaluates the arguments; in this example,
the results are 12 and 0. Then it assigns those values to the parameters. Inside
printTime, the value of hour is 12, not 11, and the value of minute is 0, not
59. Furthermore, if printTime modifies one of its parameters, that change
has no efct on the variables in main.

One way to keep track of everything is to draw a stack diagram, which is
a state diagram that shows method invocations. For each
method there is a box called a frame that contains the method's parameters and variables. 
The name of the method appears outside the frame; the
variables and parameters appear inside.

As with state diagrams, stack diagrams show variables and methods at a particular 
point in time. Figure 4.1 is a stack diagram at the beginning of the
printTime method.







