/*

The goal of this exercise is to program a Guess My Number" game. When it's finished, it will work like this:

I'm thinking of a number between 1 and 100
(including both). Can you guess what it is?
Type a number: 45
Your guess is: 45
The number I was thinking of is: 14
You were off by: 31

To choose a random number, you can use the Random class in java.util.

      Random random = new Random();
      int answer = random.nextInt(100) + 1;

Like the Scanner class we saw in this chapter, Random has to be imported before we can use it. And as we saw with Scanner, 
we have to use the new operator to create a Random (number generator).

Then we can use the method nextInt to generate a random number. 
In this example, the result of nextInt(100) will be between 0 and 99, including both. 
Adding 1 yields a number between 1 and 100, including both.

1. Make a basic "guessing the number" program

2. Compile and run this program.

3. Compute and display the diference between the user's guess and the
number that was generated.

*/

import java.util.Random;
import java.util.Scanner;

public class Exercise3_2{
  public static void main(String[] arg){
    
    Scanner in = new Scanner(System.in);
    Random random = new Random();
    int answer = random.nextInt(100) + 1;
    int guess, diference;
      
    System.out.print("Enter your guess (a number between 1 and 100) : ");
    guess = in.nextInt();
    
    System.out.println(answer);//for testing purposes
    
    if(guess > answer){
      System.out.println("You guess was wrong! , the nuber was " + answer);
      diference = guess - answer;
      System.out.println("The diference between your guess and the number that was generated is : " + diference);
    }else if(guess < answer){
       System.out.println("You guess was wrong! , the nuber was " + answer);
       diference = answer - guess;
       System.out.println("The diference between your guess and the number that was generated is : " + diference);
    }else{
      System.out.println("You guess was CORRECT!");
    }
      
  }
}