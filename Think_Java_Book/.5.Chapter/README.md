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

 !(A && B) is the same as !A || !B
 !(A || B) is the same as !A && !B

