# Exercise 3.1

Write a program that converts a temperature from Celsius to
Fahrenheit. It should (1) prompt the user for input, (2) read a double value
from the keyboard, (3) calculate the result, and (4) format the output to one
decimal place. For example, it should display "24.0 C = 75.2 F".

Here is the formula. Be careful not to use integer division!

F = C * (9/5) + 32

# Exercise 3.2

Write a program that converts a total number of seconds to
hours, minutes, and seconds. It should (1) prompt the user for input, (2) read
an integer from the keyboard, (3) calculate the result, and (4) use printf to
display the output. For example, "5000 seconds = 1 hours, 23 minutes,
and 20 seconds".

Hint: Use the modulus operator.

# Exercise 3.3

The goal of this exercise is to program a "Guess My Number"
game. When it's finished, it will work like this:

    I'm thinking of a number between 1 and 100
    (including both). Can you guess what it is?
    Type a number: 45
    Your guess is: 45
    The number I was thinking of is: 14
    You were off by: 31
    
To choose a random number, you can use the Random class in java.util.
Here's how it works:

```java
  import java.util.Random;
  public class GuessStarter {
    public static void main(String[] args) {
      // pick a random number
      Random random = new Random();
      int number = random.nextInt(100) + 1;
      System.out.println(number);
    }
  }
```

Read the user input as an integer and display the result. Again, compile
and test.

Compute and display the difeerence between the user's guess and the
number that was generated.
