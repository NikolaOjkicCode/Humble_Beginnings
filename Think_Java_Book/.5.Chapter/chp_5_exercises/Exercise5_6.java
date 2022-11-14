/*
You should already have a program that chooses a random number, prompts the user to guess it, and displays the diference between the guess and the chosen number.

Adding a small amount of code at a time, and testing as you go, 
make a program so it tells the user whether the guess is too high or too low, and then prompts the user for another guess.

The program should continue until the user gets it right.

Hint: Use two methods, and make one of them recursive.

*/

import java.util.Random;
import java.util.Scanner;

public class Exercise5_6{
  
  
  public static void guessNumber(int answer){
     Scanner in = new Scanner(System.in);
     int guess;
     
     System.out.println(answer); //To test
     
     System.out.print("Enter your guess (a number between 1 and 100) : ");
     guess = in.nextInt();
     
     if(guess > answer){
      System.out.println("Your guess was to high! , guess again! ");
      guessNumber(answer);
     }else if(guess < answer){
      System.out.println("Your guess was to low! , guess again! ");
      guessNumber(answer);
     } 
     else{
      System.out.println("Your guess was CORRECT!");
      return;
    }
     
  }
  
  public static void main(String[] arg){
    
     Random random = new Random();  
     int answer = random.nextInt(100) + 1; 
     guessNumber(answer);
      
  }
}