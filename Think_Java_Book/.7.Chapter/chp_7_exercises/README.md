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
