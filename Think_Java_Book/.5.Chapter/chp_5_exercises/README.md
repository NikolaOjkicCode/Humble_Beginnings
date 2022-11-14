# Exercise 5.1

Logical operators can simplify nested conditional statements.
For example, can you rewrite this code using a single if statement

```java

if (x > 0) {
	if (x < 10) {
		System.out.println("positive single digit number.");
	}
}

```

# Exercise 5.2

For the following program:

	 What is the complete output?

```java
public static void zoop(String fred, int bob) {
	System.out.println(fred);
	if (bob == 5) {
		ping("not ");
	} else {
		System.out.println("!");
	}
}

public static void main(String[ ] args) {
	int bizz = 5;
	int buzz = 2;
	zoop("just for", bizz);
	clink(2 * buzz);
}

public static void clink(int fork) {
	System.out.print("It's ");
	zoop("breakfast ", fork);
}

public static void ping(String strangStrung) {
	System.out.println("any " + strangStrung + "more ");
}

```

# Exercise 5.3

Fermat's Last Theorem says that there are no integers a, b,
and c such that $$a^n + b^n = c^n, except when n <= 2.
Write a method named checkFermat that takes four integers as parameters 
a, b, c and n  and checks to see if Fermat's theorem holds. If n is greater
than 2 and $a^n + b^n = c^n, the program should display Holy smokes, Fermat
was wrong!" Otherwise the program should display No, that doesn't work."

Hint: You may want to use Math.pow.

# Exercise 5.4

The purpose of this exercise is to take a problem and break
it into smaller problems, and to solve the smaller problems by writing simple
methods. Consider the first verse of the song  "99 Bottles of Beer":

	99 bottles of beer on the wall,
	99 bottles of beer,
	ya' take one down, ya' pass it around,
	98 bottles of beer on the wall.

Subsequent verses are identical except that the number of bottles gets smaller
by one in each verse, until the last verse:

	No bottles of beer on the wall,
	no bottles of beer,
	ya' can't take one down, ya' can't pass it around,
	'cause there are no more bottles of beer on the wall!

And then the song (finally) ends.
Write a program that displays the entire lyrics of \99 Bottles of Beer". Your
program should include a recursive method that does the hard part, but you
might want to write additional methods to separate other parts of the program.
As you develop your code, test it with a small number of verses, like 3.

# Exercise 5.5

This exercise reviews the fow of execution through a program
with multiple methods. Read the following code and answer the questions.

```java
public class Buzz {
	public static void baffle(String blimp) {
		System.out.println(blimp);
	zippo("ping", -5);
	}

	public static void zippo(String quince, int flag) {
		if (flag < 0) {
			System.out.println(quince + " zoop");
		} else {
			System.out.println("ik");
			baffle(quince);
			System.out.println("boo-wa-ha-ha");
		}
	}

	public static void main(String[] args) {
	zippo("rattle", 13);
	}
}

```

  	1. Write the number 1 next to the first line of code in this program that
	will execute.

	2. Write the number 2 next to the second line of code, and so on until the
	end of the program. If a line is executed more than once, it might end
	up with more than one number next to it.

	3. What is the value of the parameter blimp when baffle gets invoked?

	4. What is the output of this program?
  
# Exercise 5.6

Now that we have conditional statements, we can get back to
the "Guess My Number" game from Exercise 3.3.

You should already have a program that chooses a random number, prompts
the user to guess it, and displays the diference between the guess and the
chosen number.

Adding a small amount of code at a time, and testing as you go, modify the
program so it tells the user whether the guess is too high or too low, and then
prompts the user for another guess.

The program should continue until the user gets it right. Hint: Use two
methods, and make one of them recursive.
