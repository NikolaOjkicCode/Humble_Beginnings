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
 
Let's say you are given a number, a, and you want to find
its square root. One way to do that is to start with a rough guess about the
answer,  $x_0$, and then improve the guess using this formula:

  $x_1 = (x_0 + a/x_0)/2$
  
For example, if we want to find the square root of 9, and we start with $x_0=6$,
then $$x_1 = (6+9/6)/2=3.75$ which is closer. We can repeat the procedure,
using $x_1$ to calculate $x_2$,and so on. In this case, $x_2=3.075$ and $x_3=3.00091$.
So it converges quickly on the correct answer.

Write a method called squareRoot that takes a double and returns an ap-
proximation of the square root of the parameter, using this technique. You
should not use Math.sqrt.

As your initial guess, you should use a=2. Your method should iterate until
it gets two consecutive estimates that difer by less than 0.0001. You can use
Math.abs to calculate the absolute value of the diference.
