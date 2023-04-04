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

#Exercise 5.3

Fermat's Last Theorem says that there are no integers a, b,
and c such that a^n + b^n = c^n, except when n <= 2.

Write a method named checkFermat that takes four integers as parameters 
a, b, c and n  and checks to see if Fermat's theorem holds. If n is greater
than 2 and a^n + b^n = c^n, the program should display "Holy smokes, Fermat
was wrong!" Otherwise the program should display "No, that doesn't work."

Hint: You may want to use Math.pow.
