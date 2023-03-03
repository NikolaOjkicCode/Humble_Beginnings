# Exercise 4.1

The point of this exercise is to practice reading code and to
make sure that you understand the 
ow of execution through a program with
multiple methods.

  1. What is the output of the following program? Be precise about where
     there are spaces and where there are newlines.
     
            Hint: Start by describing in words what ping and baffle do when they are invoked.
            
  2. What happens if you invoke baffle(); at the end of the ping method?

Code: 

```java
public static void zoop() {
  baffle();
  System.out.print("You wugga ");
  baffle();
}

public static void main(String[] args) {
  System.out.print("No, I ");
  zoop();
  System.out.print("I ");
  baffle();
}

public static void baffle() {
  System.out.print("wug");
  ping();
}

public static void ping() {
  System.out.println(".");
}
```

# Exercise 4.2

The point of this exercise is to make sure you understand how
to write and invoke methods that take parameters.

    1. Write the first line of a method named zool that takes three parameters:
    an int and two Strings.

    2. Write a line of code that calls zool, passing as arguments the value 11,
    the name of your first pet, and the name of the street you grew up on.
    
# Exercise 4.3

The purpose of this exercise is to take code from a previous
exercise and encapsulate it in a method that takes parameters. You should
start with a working solution to Exercise 2.1.

1. Write a method called printAmerican that takes the day, date, month
and year as parameters and that displays them in American format.
2. Test your method by invoking it from main and passing appropriate
arguments. The output should look something like this (except that the
date might be diferent):

    Saturday, July 22, 2015
    
3. Once you have debugged printAmerican, write another method called
printEuropean that displays the date in European format.
