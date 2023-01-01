# The way of the program 
## Important notes and pieces of code,from this chapter of the book!

___
### *The hello world program*

Traditionally, the first program you write when learning a new programming
language is called the hello world program. All it does is display the words
Hello, World!" on the screen. In Java, it looks like this:

```java
public class Hello {
  public static void main(String[] args) {
    // generate some simple output
    System.out.println("Hello, World!");
  }
}
```

When this program runs it displays:

     Hello, World!

Java programs are made up of class and method definitions, and methods are
made up of statements. A statement is a line of code that performs a basic
operation. In the hello world program, this line is a print statement that
displays a message on the screen:

```java
  System.out.println("Hello, World!");
```

Like most statements, the print statement ends with a
semicolon (;)

Java is case-sensitive, which means that uppercase and lowercase are not the
same. In this example, System has to begin with an uppercase letter; system
and SYSTEM won't work.

A method is a named sequence of statements. This program defines one
method named main:

```java
  public static void main(String[] args)
```

The name and format of main is special: when the program runs, it starts at
the first statement in main and ends when it finishes the last statement.

A class is a collection of methods. This program defines a class named Hello.
You can give a class any name you like, but it is conventional to start with a
capital letter.The name of the class has to match the name of the file it is in,
so this class has to be in a file named Hello.java.

Java uses squiggly braces ({ and }) to group things together. In Hello.java,
the outermost braces contain the class definition, and the inner braces contain
the method definition.

The line that begins with two slashes (//) is a comment, which is a bit of
English text that explains the code. When the compiler sees //, it ignores
everything from there until the end of the line. Comments have no efect on
the execution of the program, but they make it easier for other programmers
(and your future self) to understand what you meant to do.

___
### *Displaying strings*
