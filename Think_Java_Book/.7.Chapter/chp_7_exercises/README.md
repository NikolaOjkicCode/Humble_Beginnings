# Exercise 7.1

Consider the following methods:

```java
public static void main(String[] args) {
  loop(10);
}

public static void loop(int n) {
    int i = n;
    while (i > 1) {
      System.out.println(i);

    if (i % 2 == 0) {
      i = i / 2;
    } else {
      i = i + 1;
    }
  }
}
```

    What is the output of this program?
  

# Exercise 7.2

In Exercise 6.8 we wrote a recursive version of power, which
takes a double x and an integer n and returns $x^n$ . Now write an iterative
method to perform the same calculation.

# Exercise 7.3

Section 6.7 presents a recursive method that computes the
factorial function. Write an iterative version of factorial.

