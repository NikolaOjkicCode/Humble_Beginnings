# Exercise 6.1

Write a method named isDivisible that takes two integers,
n and m, and that returns true if n is divisible by m, and false otherwise.

# Exercise 6.2

If you are given three sticks, you may or may not be able to
arrange them in a triangle. For example, if one of the sticks is 12 inches long
and the other two are one inch long, you will not be able to get the short sticks
to meet in the middle. For any three lengths, there is a simple test to see if it
is possible to form a triangle:

	    If any of the three lengths is greater than the sum of the other two,
	    you cannot form a triangle.

Write a method named isTriangle that takes three integers as arguments
and returns either true or false, depending on whether you can or cannot
form a triangle from sticks with the given lengths. The point of this exercise
is to use conditional statements to write a value method.

# Exercise 6.3

Many computations can be expressed more concisely using the
multadd" operation, which takes three operands and computes a * b + c.
Some processors even provide a hardware implementation of this operation for
floating-point numbers.

	1. Create a new program called Multadd.java.

	2. Write a method called multadd that takes three doubles as parameters
	and that returns a * b + c.

	3. Write a main method that tests multadd by invoking it with a few simple
	parameters, like 1.0, 2.0, 3.0.

	4.Also in main, use multadd to compute the following values:

		0.5, cos(pi / 4), sin(pi / 2)
		log10 + multadd(2, log2, log5)

	5.Write a method called expSum that takes a double as a parameter and
	that uses multadd to calculate:

		 x , exp (-x), square(1- exo(-x))

Hint: The method for raising e to a power is Math.exp.

# Exercise 6.4

What is the output of the following program?

``` java
public static void main(String[] args) {
boolean flag1 = isHoopy(202);
boolean flag2 = isFrabjuous(202);
System.out.println(flag1);
System.out.println(flag2);
if (flag1 && flag2) {
System.out.println("ping!");
}
if (flag1 || flag2) {
System.out.println("pong!");
}
}

public static boolean isHoopy(int x) {
boolean hoopyFlag;
if (x % 2 == 0) {
hoopyFlag = true;
} else {
hoopyFlag = false;
}
return hoopyFlag;
}
public static boolean isFrabjuous(int x) {
boolean frabjuousFlag;
if (x > 0) {
frabjuousFlag = true;
} else {
frabjuousFlag = false;
}
return frabjuousFlag;
}
```

