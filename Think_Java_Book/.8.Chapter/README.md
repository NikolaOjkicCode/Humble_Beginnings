# Arrays
## Important notes and pieces of code,from this chapter of the book!

___
### *Creating arrays*
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
### *Accessing elements*

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

### *Displaying arrays*

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

### *Copying arrays*

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
    
### *Array length* 
The examples in the previous section only work if the array has three elements.
It would be better to generalize the code to work with arrays of any size. We
can do that by replacing the magic number, 3, with a.length:

```java
  double[] b = new double[a.length];
   for (int i = 0; i < a.length; i++) {
      b[i] = a[i];
   }
```
    All arrays have a built-in constant, length, that stores the number of elements.
    The expression a.length may look like a method invocation, but there are no
    parentheses and no arguments.
    
You can also use a.length with Arrays.copyOf:

```java
  double[] b = Arrays.copyOf(a, a.length);
```

### *Array traversal*

Many computations can be implemented by looping through the elements of
an array and performing an operation on each element. For example, the
following loop squares the elements of a double array:

```java

for (int i = 0; i < a.length; i++) {
  a[i] = Math.pow(a[i], 2.0);
}

```

Another common pattern is a search, which involves traversing an array looking for
a particular element. For example, the following method takes an int array
and an integer value, and it returns the index where the value appears:

```java
public static int search(double[] a, double target) {
  for (int i = 0; i < a.length; i++) {
    if (a[i] == target) {
      return i;
    }
  }
return -1;
}
```

Another common traversal is a reduce operation, which \reduces" an array
of values down to a single value. Examples include the sum or product of the
elements, the minimum, and the maximum. The following method takes a
double array and returns the sum of the elements:

```java
  public static double sum(double[] a) {
     double total = 0.0;
        for (int i = 0; i < a.length; i++) {
          total += a[i];
        }
  return total;
}

```

### *Random numbers*

The following method creates an int array and fills it with random numbers
between 0 and 99. The argument specifies the size of the array, and the return
value is a reference to the new array.

```java
public static int[] randomArray(int size) {
  Random random = new Random();
  int[] a = new int[size];
  for (int i = 0; i < a.length; i++) {
    a[i] = random.nextInt(100);
  }
return a;
}
```

The following fragment generates an array and displays it using printArray

```java
int numValues = 8;
int[] array = randomArray(numValues);
printArray(array);
```

The output looks like this:

    {15, 62, 46, 74, 67, 52, 51, 10}
    
    If you run it, you will probably get diferent values.

### *Traverse and count*

The following method takes an array and two integers, low and high. It
returns the number of elements that fall in the range from low to high.

```java
public static int inRange(int[] a, int low, int high) {
  int count = 0;
  for (int i = 0; i < a.length; i++) {
    if (a[i] >= low && a[i] < high) {
      count++;
   }
  }
return count;
}
```
This pattern should look familiar: it is another reduce operation. Notice that
low is included in the range (>=), but high is excluded (<). This detail keeps
us from counting any scores twice.

Now we can count the number of scores in each grade range:

```java
int[] scores = randomArray(30);
int a = inRange(scores, 90, 100);
int b = inRange(scores, 80, 90);
int c = inRange(scores, 70, 80);
int d = inRange(scores, 60, 70);
int f = inRange(scores, 0, 60);
```

### *Building a histogram*

The following fragment creates an array of 100 counters, one for each possible
score. It loops through the scores and uses inRange to count how many times
each score appears. Then it stores the results in the array:

```java
  int[] counts = new int[100];
  for (int i = 0; i < counts.length; i++) {
    counts[i] = inRange(scores, i, i + 1);
  }
```
Notice that we are using the loop variable i three times: as an index into
the counts array, and as two arguments for inRange. The code works, but
it is not as eficient as it could be. Every time the loop invokes inRange, it
traverses the entire array.
It would be better to make a single pass through the array, and for each score,
compute which range it falls in and increment the corresponding counter. This
code traverses the array of scores only once to generate the histogram:

```java
  int[] counts = new int[100];
  for (int i = 0; i < scores.length; i++) {
    int index = scores[i];
    counts[index]++;
  }
```
Each time through the loop, it selects one element from scores and uses it
as an index to increment the corresponding element of counts. Because this
code only traverses the array of scores once, it is much more eficient.

### *The enhanced for loop*

Since traversing arrays is so common, Java provides an alternative syntax that
makes the code more compact. For example, consider a for loop that displays
the elements of an array on separate lines:

```java
for (int i = 0; i < values.length; i++) {
   int value = values[i];
   System.out.println(value);
}

```

We could rewrite the loop like this:

```java
for (int value : values) {
  System.out.println(value);
}

```
This statement is called an enhanced for loop. You can read it as, \for each
value in values". It's conventional to use plural nouns for array variables
and singular nouns for element variables.

Notice how the single line for (int value : values) replaces the first two
lines of the standard for loop. It hides the details of iterating each index of
the array, and instead, focuses on the values themselves.

Using the enhanced for loop, and removing the temporary variable, we can
write the histogram code from the previous section more concisely:

```java
int[] counts = new int[100];
for (int score : scores) {
  counts[score]++;
}
```
Enhanced for loops often make the code more readable, especially for accu-
mulating values. But they are not helpful when you need to refer to the index,
as in search operations.

```java
for (double d : array) {
    if (d == target) {
          // array contains d, but we don't know the index
    }
}
```
