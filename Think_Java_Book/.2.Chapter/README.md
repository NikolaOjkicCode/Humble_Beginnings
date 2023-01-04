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

<img src="https://marinegeo.github.io/2018-08-10-adding-images-markdown/" style="height: 100px; width:100px;"/>
