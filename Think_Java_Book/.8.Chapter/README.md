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

The [ ] operator selects elements from an array:

```java
  System.out.println("The zeroth element is " + counts[0]);
```

You can use any expression as an index, as long as it has type int. One of the
most common ways to index an array is with a loop variable. For example:

```java
  int i = 0;
  while (i < 4) {
    System.out.println(counts[i]);
  i++;
}
```

Each time through the loop we use i as an index into the array, displaying the
ith element. This type of array processing is often written using a for loop.

```java
  for (int i = 0; i < 4; i++) {
    System.out.println(counts[i]);
  }
```
    For the counts array, the only legal indexes are 0, 1, 2, and 3. If the index is
    negative or greater than 3, the result is an ArrayIndexOutOfBoundsException.


Unfortunately, the output of this code:

```java
  int[] a = {1, 2, 3, 4};
  System.out.println(a);
```
Is something like this:

        [I@bf3f7e0

The bracket indicates that the value is an array, I stands for \integer", and
the rest represents the address of the array. If we want to display the elements
of the array, we can do it ourselves:

```java
  public static void printArray(int[] a) {
    System.out.print("{" + a[0]);
    for (int i = 1; i < a.length; i++) {
      System.out.print(", " + a[i]);
    }
    System.out.println("}");
  }
```

Given the previous array, the output of this method is:

          {1, 2, 3, 4}

The Java library provides a utility class java.util.Arrays that provides
methods for working with arrays. One of them, toString, returns a string
representation of an array. We can invoke it like this:

```java
  System.out.println(Arrays.toString(a));
```

And the output is:

    [1, 2, 3, 4]

Array variables contain references to arrays. When
you make an assignment to an array variable, it simply copies the reference.
But it doesn't copy the array itself! For example:

```java
  double[] a = new double[3];
  double[] b = a;
```

    These statements create an array of three doubles and make two diferent
    variables refer to it.
    Any changes made through either variable will be seen by the other. For
    example, if we set a[0] = 17.0, and then display b[0], the result is 17.0.
    Because a and b are diferent names for the same thing, they are sometimes
    called aliases.

    If you actually want to copy the array, not just a reference, you have to create
    a new array and copy the elements from the old to the new, like this:

```java
  double[] b = new double[3];
  for (int i = 0; i < 3; i++) {
    b[i] = a[i];
  }
```

    Another option is to use java.util.Arrays, which provides a method named
    copyOf that copies an array. You can invoke it like this:

```java
  double[] b = Arrays.copyOf(a, 3);
```
    The second parameter is the number of elements you want to copy, so you can
    also use copyOf to copy just part of an array.
