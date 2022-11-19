# Arrays
## Important notes and pieces of code,from this chapter of the book!

An array is a sequence of values; the values in the array are called elements.
You can make an array of ints, doubles, or any other type, but all the values
in an array must have the same type.

```java
  int[] counts;
  double[] values;
  
  counts = new int[4];
  values = new double[size];
```
        The first assignment makes count refer to an array of four integers. The second
        makes values refer to an array of double, where the number of elements in
        values depends on the value of size.

Of course, you can also declare the variable and create the array in a single
line of code:

```java
  int[] counts = new int[4];
  double[] values = new double[size];
```

The [] operator selects elements from an array:


