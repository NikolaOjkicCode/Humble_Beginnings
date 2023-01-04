# Variables and operators
## Important notes and pieces of code,from this chapter of the book!

___
### *Declaring variables*

One of the most powerful features of a programming language is the ability to
define and manipulate variables. A variable is a named location that stores
a value. Values may be numbers, text, images, sounds, and other types of
data. To store a value, you first have to declare a variable.

```java
String message;
```

This statement is a declaration, because it declares that the variable named
message has the type String. Each variable has a type that determines what
kind of values it can store. For example, the int type can store integers, and
the char type can store characters.

To declare an integer variable named x, you simply type:

```java
int x;
```

Note that x is an arbitrary name for the variable. In general, you should use
names that indicate what the variables mean. For example, if you saw these
declarations, you could probably guess what values would be stored:

```java
String firstName;
String lastName;
int hour, minute;
```

This example declares two variables with type String and two with type
int. When a variable name contains more than one word, like firstName,
it is conventional to capitalize the first letter of each word except the first.
Variable names are case-sensitive, so firstName is not the same as firstname
or FirstName.

Note that each declaration statement ends with a semicolon!

You can use any name you want for a variable. But there are about 50 reserved
words, called keywords, that you are not allowed to use as variable names.
These words include public, class, static, void, and int, which are used
by the compiler to analyze the structure of the program.

You can find the complete list of keywords at [docs.oracle.com](http://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html), 
but you don't have to memorize them. Most programming editors provide "syntax highlighting",
which makes diferent parts of the program appear in diferent colors.


___
### *Assignment*

Now that we have declared variables, we want to use them to store values. We
do that with an assignment statement.

```java
message = "Hello!"; // give message the value "Hello!"
hour = 11; // assign the value 11 to hour
minute = 59; // set minute to 59
```

As a general rule, a variable has to have the same type as the value you
assign to it. For example, you cannot store a string in minute or an integer
in message.

Variables must be initialized (assigned for the first time) before they can
be used. You can declare a variable and then assign a value later, as in the
previous example. You can also declare and initialize on the same line:

```java
String message = "Hello!";
int hour = 11;
int minute = 59;
```

___
### *State diagrams*

Also, in mathematics, a statement of equality is true for all time. If a = b
now, a is always equal to b. In Java, an assignment statement can make two
variables equal, but they don't have to stay that way.

```java
int a = 5;
int b = a; // a and b are now equal
a = 3; // a and b are no longer equal
```

The third line changes the value of a, but it does not change the value of b,
so they are no longer equal.

Taken together, the variables in a program and their current values make up
the program's state.

![This is an image](https://github.com/NikolaOjkicCode/Humble_Beginnings/blob/main/Think_Java_Book/Miscellaneous/Screenshot%20(3).png)

Diagrams like this one that show the state of the program are called state
diagrams. Each variable is represented with a box showing the name of the
variable on the outside and the value inside. As the program runs, the state
changes, so you should think of a state diagram as a snapshot of a particular
point in time.

___
### *Printing variables*

You can display the value of a variable using print or println. The fol-
lowing statements declare a variable named firstLine, assign it the value
"Hello, again!", and display that value.

```java
String firstLine = "Hello, again!";
System.out.println(firstLine);
```

When we talk about displaying a variable, we generally mean the value of the
variable. To display the name of a variable, you have to put it in quotes.

```java
System.out.print("The value of firstLine is ");
System.out.println(firstLine);
```

For this example, the output is:

      The value of firstLine is Hello, again!
      
Conveniently, the syntax for displaying a variable is the same regardless of its
type. For example:

```java
int hour = 11;
int minute = 59;
System.out.print("The current time is ");
System.out.print(hour);
System.out.print(":");
System.out.print(minute);
System.out.println(".");
```

The output of this program is:

      The current time is 11:59.

To output multiple values on the same line, it's common to use several print
statements followed by println at the end. But don't forget the println!
On many computers, the output from print is stored without being displayed
until println is run; then the entire line is displayed at once. If you omit the
println, the program might display the stored output at unexpected times or
even terminate without displaying anything.

___
### *Arithmetic operators*

Operators are symbols that represent simple computations. For example, the
addition operator is +, subtraction is -, multiplication is *, and division is /.

The following program converts a time of day to minutes:

```java
int hour = 11;
int minute = 59;
System.out.print("Number of minutes since midnight: ");
System.out.println(hour * 60 + minute);
```

In this program, hour * 60 + minute is an expression, which represents a
single value to be computed. When the program runs, each variable is replaced
by its current value, and then the operators are applied. The values operators
work with are called operands.

The result of the previous example is:

      Number of minutes since midnight: 719
      
Addition, subtraction, and multiplication all do what you expect, but you
might be surprised by division. For example, the following fragment tries to
compute the fraction of an hour that has elapsed:

```java
System.out.print("Fraction of the hour that has passed: ");
System.out.println(minute / 60);
```
The output is:

      Fraction of the hour that has passed: 0

This result often confuses people. The value of minute is 59, and 59 divided
by 60 should be 0.98333, not 0. The problem is that Java performs "integer
division" when the operands are integers. By design, integer division always
rounds toward zero, even in cases like this one where the next integer is close.

As an alternative, we can calculate a percentage rather than a fraction:

```java
System.out.print("Percent of the hour that has passed: ");
System.out.println(minute * 100 / 60);
```

The new output is: 

        Percent of the hour that has passed: 98
        
Again the result is rounded down, but at least now it's approximately correct.


___
### *Floating-point numbers*

A more general solution is to use foating-point numbers, which can represent
fractions as well as integers. In Java, the default  foating-point type is called
double, which is short for double-precision. You can create double variables
and assign values to them using the same syntax we used for the other types:

```java
double pi;
pi = 3.14159;
```

Java performs "foating-point division" when one or more operands are double
values. So we can solve the problem we saw in the previous section:

```java
double minute = 59.0;
System.out.print("Fraction of the hour that has passed: ");
System.out.println(minute / 60.0);
```

The output is:

              Fraction of the hour that has passed: 0.9833333333333333

Although foating-point numbers are useful, they can be a source of confusion.
For example, Java distinguishes the integer value 1 from the  foating-point
value 1.0, even though they seem to be the same number. They belong to
diferent data types, and strictly speaking, you are not allowed to make as-
signments between types.

The following is illegal because the variable on the left is an int and the value
on the right is a double:

```java
int x = 1.1; // compiler error
```

It is easy to forget this rule because in many cases Java automatically converts
from one type to another:

```java
double y = 1; // legal, but bad style
```

The preceding example should be illegal, but Java allows it by converting the
int value 1 to the double value 1.0 automatically. This leniency is convenient,
but it often causes problems for beginners. For example:

```java
double y = 1 / 3; // common mistake
```

You might expect the variable y to get the value 0.333333, which is a legal
foating-point value. But instead it gets the value 0.0. The expression on the
right divides two integers, so Java does integer division, which yields the int
value 0. Converted to double, the value assigned to y is 0.0.

One way to solve this problem (once you figure out the bug) is to make the right-hand side a 
foating-point expression. The following sets y to 0.333333,
as expected:

```java
double y = 1.0 / 3.0; // correct
```

___
### *Rounding errors*


                  
