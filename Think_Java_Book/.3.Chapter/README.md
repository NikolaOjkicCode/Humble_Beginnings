# Input and Output
## Important notes and pieces of code,from this chapter of the book!

___
### *The System class*

We have been using System.out.println for a while, but you might not
have thought about what it means. System is a class that provides methods
related to the "system" or environment where programs run. It also provides
System.out, which is a special value that provides methods for displaying
output, including println.

In fact, we can use System.out.println to display the value of System.out:

```java

System.out.println(System.out);

```

The result is:

    java.io.PrintStream@685d72cd
    
This output indicates that System.out is a PrintStream, which is defined in a
package called java.io. A package is a collection of related classes; java.io
contains classes for \I/O" which stands for input and output.

The numbers and letters after the @ sign are the address of System.out,
represented as a hexadecimal (base 16) number. The address of a value is
its location in the computer's memory, which might be diferent on diferent
computers. In this example the address is 685d72cd, but if you run the same
code you might get something diferent.

System is defined in a file called System.java, and
PrintStream is defined in PrintStream.java. These files are part of the
Java library, which is an extensive collection of classes you can use in your
programs.

___
### *The System class*

Scanner is a class that provides methods for inputting words,
numbers, and other data. Scanner is provided by java.util, which is a
package that contains classes so useful they are called "utility classes". Before
you can use Scanner, you have to import it like this:

```java
import java.util.Scanner;
```

This import statement tells the compiler that when you say Scanner, you
mean the one defined in java.util. It's necessary because there might be
another class named Scanner in another package. Using an import statement
makes your code unambiguous.

Import statements can't be inside a class definition. By convention, they are
usually at the beginning of the file.
Next you have to create a Scanner:

```java
Scanner in = new Scanner(System.in);
```

This line declares a Scanner variable named in and creates a new Scanner
that takes input from System.in.

Scanner provides a method called nextLine that reads a line of input from
the keyboard and returns a String. The following example reads two lines
and repeats them back to the user:

```java
import java.util.Scanner;
  public class Echo {
    public static void main(String[] args) {
      String line;
      Scanner in = new Scanner(System.in);
      
      System.out.print("Type something: ");
      line = in.nextLine();
      
      System.out.println("You said: " + line);
        
      System.out.print("Type something else: ");
      line = in.nextLine();
      
      System.out.println("You also said: " + line);
  }
}
```

If you omit the import statement and later refer to Scanner, you will get a
compiler error like "cannot find symbol". That means the compiler doesn't
know what you mean by Scanner.

You might wonder why we can use the System class without importing it.
System belongs to the java.lang package, which is imported automatically.
According to the documentation, java.lang provides classes that are fundamental 
to the design of the Java programming language. The String class
is also part of the java.lang package.

___
### *Program structure*

At this point, we have seen all of the elements that make up Java programs.

![Image of all of the elements that make up Java programs](https://github.com/NikolaOjkicCode/Humble_Beginnings/blob/main/Think_Java_Book/Miscellaneous/Screenshot%20(4).png)

To review, a package is a collection of classes, which define methods. Methods
contain statements, some of which contain expressions. Expressions are made
up of tokens, which are the basic elements of a program, including numbers,
variable names, operators, keywords, and punctuation like parentheses, braces
and semicolons.

The standard edition of Java comes with several thousand classes you can
import, which can be both exciting and intimidating. You can browse this
library at [docs.oracle.com](http://docs.oracle.com/javase/8/docs/api/)
Most of the Java library itself is written in Java.

___
### *Inches to centimeters*

We'll use a Scanner to input a measurement
in inches, convert to centimeters, and then display the results. The following
lines declare the variables and create the Scanner:

```java
int inch;
double cm;
Scanner in = new Scanner(System.in);
```

The next step is to prompt the user for the input. We'll use print instead
of println so they can enter the input on the same line as the prompt. And
we'll use the Scanner method nextInt, which reads input from the keyboard
and converts it to an integer:

```java
System.out.print("How many inches? ");
inch = in.nextInt();
```

Next we multiply the number of inches by 2.54, since that's how many cen-
timeters there are per inch, and display the results:

```java
cm = inch * 2.54;
System.out.print(inch + " in = ");
System.out.println(cm + " cm");
```
___
### *Literals and constants*

A value that appears in a program, like 2.54 (or " in ="), is called a literal.
In general, there's nothing wrong with literals. But when numbers like 2.54
appear in an expression with no explanation, they make code hard to read.
And if the same value appears many times, and might have to change in the
future, it makes code hard to maintain.

Values like that are sometimes called magic numbers (with the implication
that being "magic" is not a good thing). A good practice is to assign magic
numbers to variables with meaningful names, like this:

```java
double cmPerInch = 2.54;
cm = inch * cmPerInch;
```

This version is easier to read and less error-prone, but it still has a problem.
Variables can vary, but the number of centimeters in an inch does not. Once we
assign a value to cmPerInch, it should never change. Java provides a language
feature that enforces that rule, the keyword final.

```java
final double CM_PER_INCH = 2.54;

Declaring that a variable is final means that it cannot be reassigned once
it has been initialized. If you try, the compiler reports an error. Variables
declared as final are called constants. By convention, names for constants
are all uppercase, with the underscore character (_) between words.
```

___
### *Formatting output*

When you output a double using print or println, it displays up to 16
decimal places:
