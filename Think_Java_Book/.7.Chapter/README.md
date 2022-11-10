# Loops
## Important notes and pieces of code,from this chapter of the book!

####The while statement

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

```java
int i2 = 1;
    while (i2 < 10) {
      double x = i2;
      System.out.println(x + " " + Math.log(x) / Math.log(2));
      i2 = i2 + 1;
    }
    System.out.println();
    
    /*Each time through the loop, we add one to x, so the result is an arithmetic
     sequence. If we multiply x by something instead, we get a geometric sequence:*/
    
    final double LOG2 = Math.log(2);
    int i3 = 1;
    while (i3 < 100) {
      double x = i3;
      System.out.println(x + " " + Math.log(x) / LOG2);
      i3 = i3 * 2;
    }
```

Java also provides a posttest loop: the do-while statement. 
This type of loop is useful when you need to run the body of the loop at least once.

```java
Scanner in = new Scanner(System.in);
    boolean okay;
    do {
      System.out.print("Enter a number: ");
      if (in.hasNextDouble()) {
        okay = true;
      } else {
        okay = false;
        String word = in.next();
        System.err.println(word + " is not a number");
      }
    } while (!okay);
    double x = in.nextDouble();
```
    Although this code looks complicated, it is essentially only three steps:
     
     1. Display a prompt.
     2. Check the input; if invalid, display an error and start over.
     3. Read the input.
     
     The code uses a  ag variable, okay, to indicate whether we need to repeat the
     loop body. If hasNextDouble() returns false, we consume the invalid input
     by calling next(). We then display an error message via System.err. The
     loop terminates when hasNextDouble() return true.

Break and continue

When a program reaches a break statement, it exits the current loop.
```java

while (true) {
      System.out.print("Enter a number: ");
      if (in.hasNextDouble()) {
        break;
      }
      String word = in.next();
      System.err.println(word + " is not a number");
    }
    double x2 = in.nextDouble();
```

In addition to the break statement, which exits the loop, Java provides a
continue statement that moves on to the next iteration. For example, the
following code reads integers from the keyboard and computes a running total.
The continue statement causes the program to skip over any negative values

```java
int x3 = -1;
    int sum = 0;
    while (x3 != 0) {
      x3 = in.nextInt();
      if (x3 <= 0) {
        continue;
      }
      System.out.println("Adding " + x3);
      sum += x3;
    }
```
