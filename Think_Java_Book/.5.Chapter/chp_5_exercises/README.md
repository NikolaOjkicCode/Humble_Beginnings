# Exercise 5.1

Logical operators can simplify nested conditional statements.
For example, can you rewrite this code using a single if statement?

Code:
```java
if (x > 0) {
  if (x < 10) {
    System.out.println("positive single digit number.");
  }
}
```

# Exercise 5.2

For the following program:

code:

```java
public static void zoop(String fred, int bob) {
  System.out.println(fred);
  if (bob == 5) {
    ping("not ");
  } else {
    System.out.println("!");
  }
}

public static void main(String[] args) {
  int bizz = 5;
  int buzz = 2;
  zoop("just for", bizz);
  clink(2 * buzz);
}

public static void clink(int fork) {
  System.out.print("It's ");
  zoop("breakfast ", fork);
}

public static void ping(String strangStrung) {
  System.out.println("any " + strangStrung + "more ");
}


```

What is the complete output?

# Exercise 5.3

Fermat's Last Theorem says that there are no integers a, b,
and c such that a^n + b^n = c^n, except when n <= 2.

Write a method named checkFermat that takes four integers as parameters 
a, b, c and n  and checks to see if Fermat's theorem holds. If n is greater
than 2 and a^n + b^n = c^n, the program should display "Holy smokes, Fermat
was wrong!" Otherwise the program should display "No, that doesn't work."

Hint: You may want to use Math.pow.

# Exercise 5.4

The purpose of this exercise is to take a problem and break
it into smaller problems, and to solve the smaller problems by writing simple
methods. Consider the first verse of the song "99 Bottles of Beer":

    99 bottles of beer on the wall,
    99 bottles of beer,
    ya' take one down, ya' pass it around,
    98 bottles of beer on the wall.

Subsequent verses are identical except that the number of bottles gets smaller
by one in each verse, until the last verse:

    No bottles of beer on the wall,
    no bottles of beer,
    ya' can't take one down, ya' can't pass it around,
    'cause there are no more bottles of beer on the wall!

And then the song (finally) ends.

Write a program that displays the entire lyrics of "99 Bottles of Beer". Your
program should include a recursive method that does the hard part, but you
might want to write additional methods to separate other parts of the program.
As you develop your code, test it with a small number of verses, like 3.
