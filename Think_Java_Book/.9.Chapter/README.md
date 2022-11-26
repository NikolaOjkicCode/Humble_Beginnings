# Strings and things
## Important notes and pieces of code,from this chapter of the book!

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

### *The indexOf method*

