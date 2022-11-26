# Strings and things
## Important notes and pieces of code,from this chapter of the book!

___
### *Characters*


Strings provide a method named charAt, which extracts a character. It returns
a char, a primitive type that stores an individual character (as opposed to
strings of them).

```java
String fruit = "banana";
char letter = fruit.charAt(0);
```

The argument 0 means that we want the letter at position 0. Like array
indexes, string indexes start at 0, so the character assigned to letter is b.


Characters work like the other primitive types we have seen. You can compare
them using relational operators:

```java
if (letter == 'a') {
  System.out.println('?');
}
```

Character literals, like 'a', appear in single quotes. Unlike string literals,
which appear in double quotes, character literals can only contain a single
character. Escape sequences, like '\t', are legal because they represent a
single character.

The increment and decrement operators work with characters. So this loop
displays the letters of the alphabet:

```java
System.out.print("Roman alphabet: ");
  for (char c = 'A'; c <= 'Z'; c++) {
    System.out.print(c);
  }
System.out.println();
```

In Unicode, each character is represented by a \code unit", which you can
think of as an integer. The code units for uppercase Greek letters run from
913 to 937, so we can display the Greek alphabet like this:

```java
System.out.print("Greek alphabet: ");
  for (int i = 913; i <= 937; i++) {
    System.out.print((char) i);
  }
System.out.println();

```
This example uses a type cast to convert each integer (in the range) to the
corresponding character.


___
### *Strings are immutable*

Strings provide methods, toUpperCase and toLowerCase, that convert from
uppercase to lowercase and back. These methods are often a source of confu-
sion, because it sounds like they modify strings. But neither these methods
nor any others can change a string, because strings are immutable.

When you invoke toUpperCase on a string, you get a new string object as a
return value. For example:

```java
String name = "Alan Turing";
String upperName = name.toUpperCase();
```
After these statements run, upperName refers to the string "ALAN TURING".
But name still refers to "Alan Turing".

Another useful method is replace, which finds and replaces instances of one
string within another. This example replaces "Computer Science" with "CS":

```java
String text = "Computer Science is fun!";
text = text.replace("Computer Science", "CS");
```

This example demonstrates a common way to work with string methods. It in-
vokes text.replace, which returns a reference to a new string, "CS is fun!".
Then it assigns the new string to text, replacing the old string.
This assignment is important; 

if you don't save the return value, invoking
text.replace has no efect.

___
### *String traversal*

The following loop traverses the characters in fruit and displays them, one
on each line:

```java
for (int i = 0; i < fruit.length(); i++) {
  char letter = fruit.charAt(i);
  System.out.println(letter);
}
```

The condition is i < fruit.length(), which means that when i is equal to
the length of the string, the condition is false and the loop terminates.

Unfortunately, the enhanced for loop does not work with strings. But you
can convert any string to a character array and iterate that:

```java
for (char letter : fruit.toCharArray()) {
System.out.println(letter);
}
```

To find the last letter of a string, you might be tempted to try something like:

```java
int length = fruit.length();
char last = fruit.charAt(length); // wrong!
```

This code compiles and runs, but invoking the charAt method throws a
StringIndexOutOfBoundsException. The problem is that there is no sixth
letter in "banana". Since we started counting at 0, the 6 letters are indexed
from 0 to 5. To get the last character, you have to subtract 1 from length.

```java
int length = fruit.length();
char last = fruit.charAt(length - 1); // correct
```

Many string traversals involve reading one string and creating another. For
example, to reverse a string, we simply add one character at a time:

```java
public static String reverse(String s) {
String r = "";
for (int i = s.length() - 1; i >= 0; i--) {
r = r + s.charAt(i);
}
return r;
}
```

The initial value of r is "", which is the empty string. The loop traverses
the letters of s in reverse order. Each time through the loop, it creates a new
string and assigns it to r. When the loop exits, r contains the letters from s
in reverse order. So the result of reverse("banana") is "ananab".

___
### *Substrings*

The substring method returns a new string that copies letters from an exist-
ing string, starting at the given index.

```java
    fruit.substring(0) returns "banana"
    fruit.substring(2) returns "nana"
    fruit.substring(6) returns ""
```

Like most string methods, substring is overloaded. That is, there are other
versions of substring that have diferent parameters. If it's invoked with two
arguments, they are treated as a start and end index:

```java
    fruit.substring(0, 3) returns "ban"
    fruit.substring(2, 5) returns "nan"
    fruit.substring(6, 6) returns ""
```

Notice that the character indicated by the end index is not included. Defin-
ing substring this way simplifes some common operations. For example,
to select a substring with length len, starting at index i, you could write
fruit.substring(i, i + len).

___
### *The indexOf method*

The indexOf method searches for a character in a string.

```java
String fruit = "banana";
int index = fruit.indexOf('a');
```

This example finds the index of 'a' in the string. But the letter appears
three times, so it's not obvious what indexOf should do. According to the
documentation, it returns the index of the first appearance.

To find subsequent appearances, you can use another version of indexOf, which
takes a second argument that indicates where in the string to start looking.

```java
int index = fruit.indexOf('a', 2);
```

This code starts at index 2 (the first 'n') and finds the next 'a', which is
at index 3. If the letter happens to appear at the starting index, the starting
index is the answer. So fruit.indexOf('a', 5) returns 5.

If the character does not appear in the string, indexOf returns -1. Since
indexes cannot be negative, this value indicates the character was not found.

You can also use indexOf to search for a substring, not just a single character.
For example, the expression fruit.indexOf("nan") returns 2.

___
### *String comparison*

The right way to compare strings is with the equals method, like this:

```java
    if (name1.equals(name2)) {
      System.out.println("The names are the same.");
    }
```

If the strings difer, we can use compareTo to see which comes first in alpha-
betical order:

```java
    int diff = name1.compareTo(name2);
    if (diff == 0) {
      System.out.println("The names are the same.");
    } else if (diff < 0) {
      System.out.println("name1 comes before name2.");
    } else if (diff > 0) {
      System.out.println("name2 comes before name1.");
    }
```

The return value from compareTo is the diference between the first characters
in the strings that difer. If the strings are equal, their diference is zero. If
the first string (the one on which the method is invoked) comes first in the
alphabet, the diference is negative. 

Otherwise, the diference is positive.
In the preceding code, compareTo returns positive 8, because the second letter
of "Ada" comes before the second letter of "Alan" by 8 letters.

Both equals and compareTo are case-sensitive. The uppercase letters come
before the lowercase letters, so "Ada" comes before "ada".

___
### *String formatting*

```java
    public static String timeString(int hour, int minute) {
      String ampm;
      if (hour < 12) {
        ampm = "AM";
      if (hour == 0) {
        hour = 12; // midnight
      }
      } else {
        ampm = "PM";
        hour = hour - 12;
      }
    return String.format("%02d:%02d %s", hour, minute, ampm);
    }
```

String.format takes the same arguments as System.out.printf: a for-
mat specifer followed by a sequence of values. The main diference is that
System.out.printf displays the result on the screen; String.format creates
a new string, but does not display anything.

In this example, the format specifer %02d means \two digit integer padded
with zeros", so timeString(19, 5) returns the string "07:05 PM".

___
### *Wrapper classes*

For each primitive type, there is a corresponding class in the Java library,
called a wrapper class. The wrapper class for char is called Character; for
int it's called Integer. Other wrapper classes include Boolean, Long, and
Double. They are in the java.lang package, so you can use them without
importing them.

Each wrapper class defnes constants MIN_VALUE and MAX_VALUE. For example,
Integer.MIN_VALUE is -2147483648, and Integer.MAX_VALUE is 2147483647.
Because these constants are available in wrapper classes, you don't have to
remember them, and you don't have to include them in your programs.

Wrapper classes provide methods for converting strings to other types. For
example, Integer.parseInt converts a string to (you guessed it) an integer:

```java
  String str = "12345";
  int num = Integer.parseInt(str);
```

The other wrapper classes provide similar methods, like Double.parseDouble
and Boolean.parseBoolean. They also provide toString, which returns a
string representation of a value:

```java
    int num = 12345;
    String str = Integer.toString(num);
```

    The result is the string "12345".

___
### *Command-line arguments* 

Let's write a program to find the largest value
in a sequence of numbers. Rather than read the numbers from System.in,
we'll pass them as command-line arguments. Here is a starting point:

```java
public class Max {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(args));
  }
}
```

You can run this program from the command line by typing:

    java Max
    
The output indicates that args is an empty array; that is, it has no elements:

    []

But if you provide additional values on the command line, they are passed as
arguments to main. For example, if you run it like this:

    java Max 10 -3 55 0 14

The output is:

    [10, -3, 55, 0, 14]
    
But remember that the elements of args are strings. To find the maximum
number, we have to convert the arguments to integers.

The following fragment uses an enhanced for loop to parse the arguments
(using the Integer wrapper class) and find the largest value:

```java
    int max = Integer.MIN_VALUE;
    for (String arg : args) {
      int value = Integer.parseInt(arg);
      if (value > max) {
        max = value;
      }
    }
    System.out.println("The max is " + max);
```

The initial value of max is the smallest (most negative) number an int can rep-
resent, so any other value is greater. If args is empty, the result is MIN_VALUE.
