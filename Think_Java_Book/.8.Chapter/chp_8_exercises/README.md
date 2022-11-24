# Exercise 8.1

The goal of this exercise is to practice encapsulation with some
of the examples in this chapter.

Starting with the code:

```java
for (int i = 0; i < a.length; i++) {
a[i] = Math.pow(a[i], 2.0);
}

public static int search(double[] a, double target) {
for (int i = 0; i < a.length; i++) {
if (a[i] == target) {
return i;
}
}
return -1;
}

public static double sum(double[] a) {
double total = 0.0;
for (int i = 0; i < a.length; i++) {
total += a[i];
}
return total;
}
```

    write a method called powArray
    that takes a double array, a, and returns a new array that contains the
    elements of a squared. Generalize it to take a second argument and raise
    the elements of a to the given power.

Starting with the code:

```java
for (int i = 0; i < values.length; i++) {
int value = values[i];
System.out.println(value);
}

for (int value : values) {
System.out.println(value);
}

int[] counts = new int[100];
for (int score : scores) {
counts[score]++;
}
```

      write a method called histogram
      that takes an int array of scores from 0 to (but not including) 100, and
      returns a histogram of 100 counters. Generalize it to take the number of
      counters as an argument.
      
 # Exercise 8.2
 
 
