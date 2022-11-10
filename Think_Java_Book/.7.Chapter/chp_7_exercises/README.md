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
then $x_1 = (6+9/6)/2=3.75$ which is closer. We can repeat the procedure,
using $x_1$ to calculate $x_2$,and so on. In this case, $x_2=3.075$ and $x_3=3.00091$.
So it converges quickly on the correct answer.

Write a method called squareRoot that takes a double and returns an ap-
proximation of the square root of the parameter, using this technique. You
should not use Math.sqrt.

As your initial guess, you should use a=2. Your method should iterate until
it gets two consecutive estimates that difer by less than 0.0001. You can use
Math.abs to calculate the absolute value of the diference.

# Exercise 7.3

In Exercise 6.9 we wrote a recursive version of power, which
takes a double x and an integer n and returns $x^n$ . Now write an iterative
method to perform the same calculation.

# Exercise 7.4

Section 6.7 presents a recursive method that computes the
factorial function. Write an iterative version of factorial.

# Exercise 7.5

One way to calculate $e^x$ is to use the infinite series expansion:

$e^x=1+x+x^2/2!+x^3/3!+x^4/4!+...$

The ith term in the series is $x^i/i!$ .

    1. Write a method called myexp that takes x and n as parameters and
    estimates e^x by adding the first n terms of this series. You can use the
    factorial method from Section 6.7 or your iterative version from the
    previous exercise.

    2.You can make this method more eficient if you realize that the numerator
    of each term is the same as its predecessor multiplied by x, and the
    denominator is the same as its predecessor multiplied by i. Use this
    observation to eliminate the use of Math.pow and factorial, and check
    that you get the same result.

    3.Write a method called check that takes a parameter, x, and displays x,
    myexp(x), and Math.exp(x). The output should look something like:

        1.0 2.708333333333333 2.718281828459045

    You can use the escape sequence "\t" to put a tab character between
    columns of a table.

    4. Vary the number of terms in the series (the second argument that check
    sends to myexp) and see the efect on the accuracy of the result. Adjust
    this value until the estimated value agrees with the correct answer when
    x is 1.

    5.Write a loop in main that invokes check with the values 0.1, 1.0, 10.0, and
    100.0. How does the accuracy of the result vary as x varies? Compare
    the number of digits of agreement rather than the diference between the
    actual and estimated values.

    6. Add a loop in main that checks myexp with the values -0.1, -1.0, -10.0,
    and -100.0. Comment on the accuracy.
