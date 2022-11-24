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
