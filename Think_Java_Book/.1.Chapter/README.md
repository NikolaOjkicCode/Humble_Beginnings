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

Phrases that appear in quotation marks are called strings, because they con-
tain a sequence of \characters" strung together. Characters can be letters,
numbers, punctuation marks, symbols, spaces, tabs, etc.

System.out.println appends a special character, called a newline, that
moves to the beginning of the next line. If you don't want a newline at the
end, you can use print instead of println:

```java

  public class Goodbye {
    public static void main(String[] args) {
      System.out.print("Goodbye, ");
      System.out.println("cruel world");
    }
  }
  
```
    In this example, the first statement does not add a newline, so the output
    appears on a single line as Goodbye, cruel world. Notice that there is a
    space at the end of the first string, which appears in the output.
___
### *Escape sequences*   

It is possible to display multiple lines of output in just one line of code. You
just have to tell Java where to put the line breaks.

```java
public class Hello {
  public static void main(String[] args) {
    System.out.print("Hello!\nHow are you doing?\n");
  }
}
```

The output is two lines, each ending with a newline character:

    Hello!
    How are you doing?

The \n is an escape sequence, which is a sequence of characters that represents a special character. 
The backslash allows you to \escape" the string's
literal interpretation. Notice there is no space between \n and How. If you add
a space there, there will be a space at the beginning of the second line.

Another common use of escape sequences is to have quotation marks inside
of strings. Since double quotes indicate the beginning and end of strings, you
need to escape them with a backslash.

```java
  System.out.println("She said \"Hello!\" to me.");
```

The result is:

    She said "Hello!" to me.
    
___
### *Formatting code*

In Java programs, some spaces are required. For example, you need at least
one space between words, so this program is not legal:

```java
publicclassGoodbye{
  publicstaticvoidmain(String[] args) {
    System.out.print("Goodbye, ");
    System.out.println("cruel world");
  }
}
```
But most other spaces are optional. For example, this program is legal:

```java
public class Goodbye {
public static void main(String[] args) {
System.out.print("Goodbye, ");
System.out.println("cruel world");
}
}
```

The newlines are optional, too. So we could just write:

```java
public class Goodbye { public static void main(String[] args)
{ System.out.print("Goodbye, "); System.out.println
("cruel world");}}
```

It still works, but the program is getting harder and harder to read. Newlines
and spaces are important for organizing your program visually, making it easier
to understand the program and find errors when they occur.

Organizations that do a lot of software development usually have strict guide-
lines on how to format source code. For example, Google publishes its Java
coding standards for use in open-source projects: [styleguide](https://google.github.io/styleguide/javaguide.html)

___
### *Debugging code*

Programming and debugging should go hand in hand. Don't just write a bunch
of code and then perform trial and error debugging until it all works. Instead,
start with a program that does something and make small modifications, debugging 
them as you go, until the program does what you want. That way
you will always have a working program, and it will be easier to isolate errors.


