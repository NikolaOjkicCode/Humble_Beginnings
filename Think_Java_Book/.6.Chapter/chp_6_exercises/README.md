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

	1. Create a new program called Exercise6_3.java.

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
The purpose of this exercise is to make sure you understand logical operators
and the flow of execution through value methods.

# Exercise 6.5

In this exercise, you will use a stack diagram to understand
the execution of the following recursive program.

```java
public static void main(String[] args) {

	System.out.println(prod(1, 4));
}

	public static int prod(int m, int n) {
	
		if (m == n) {
			return n;
		} else {
			int recurse = prod(m, n - 1);
			int result = n * recurse;
			return result;
		}
}
```

	1. Draw a stack diagram showing the state of the program just before the
	last invocation of prod completes.
	
	2. What is the output of this program? (Try to answer this question on
	paper frst, then run the code to check your answer.)
	
	3. Explain in a few words what prod does (without getting into the details
	of how it works).
	
	4. Rewrite prod without the temporary variables recurse and result.
	Hint: You only need one line for the else branch.

# Exercise 6.6

Write a recursive method named oddSum that takes a positive
odd integer n and returns the sum of odd integers from 1 to n. Start with
a base case, and use temporary variables to debug your solution. You might
find it helpful to print the value of n each time oddSum is invoked.

# Exercise 6.7

The goal of this exercise is to translate a recursive definition
into a Java method. The Ackermann function is defined for non-negative
integers as follows:
	
	A(m; n) = 
		n + 1  			if m = 0
		A(m - 1; 1) 		if m > 0 and n = 0
		A(m - 1;A(m; n - 1)) 	if m > 0 and n > 0
		
Write a method called ack that takes two ints as parameters and that com-
putes and returns the value of the Ackermann function.
Test your implementation of Ackermann by invoking it from main and display-
ing the return value. Note the return value gets very big very quickly. You
should try it only for small values of m and n (not bigger than 3).

# Exercise 6.8

Write a recursive method called power that takes a double x
and an integer n and returns x^n.

Hint: A recursive definition of this operation is xn = x * x^n-1. Also, remember
that anything raised to the zeroth power is 1.

Optional challenge: you can make this method more eficient, when n is even,
using x^n = (x^(n/2))^2
