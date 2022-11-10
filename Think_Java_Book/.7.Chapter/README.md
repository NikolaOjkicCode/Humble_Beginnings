# Loops
## Important notes and pieces of code,from this chapter of the book!

The while statement

```java
public static void countdown(int n) {
    while (n > 0) {
      System.out.println(n);
      n = n - 1;
    }
    System.out.println("Blastoff!");
  }
```

The for statement

```java
 public static void printRow(int n, int cols) {
    for (int i = 1; i <= cols; i = i + 1) {
      System.out.printf("%4d", n * i);
    }
  }
```

       Assignments like i = i + 1 don't often appear in for loops, because Java
       provides a more concise way to add and subtract by one. Speci cally, ++ is
       the increment operator; it has the same e ect as i = i + 1. And -- is the
       decrement operator; it has the same e ect as i = i - 1.
       If you want to increment or decrement a variable by an amount other than 1,
       you can use += and -=. For example, i += 2 increments i by 2.
       
The following loop displays a table with a sequence of values in the left column and their logarithms in the right column:

```java
    int i = 1;
    while (i < 10) {
      double x = i;
      System.out.println(x + " " + Math.log(x));
      i = i + 1;
    }
```

Math.log computes natural logarithms, that is, logarithms base e. For com-
puter science applications, we often want logarithms with respect to base 2.
To compute them, we can apply this equation:

$log_2 x = (log_e x)/(log_e 2)$
