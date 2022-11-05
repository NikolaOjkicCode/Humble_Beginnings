import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber2{
  
  public static int guessAgain(){
    Scanner in = new Scanner(System.in);
    
    int newGuess;
    System.out.print("Guess again : ");
    newGuess = in.nextInt();
    return newGuess;
  }
  
  public static void guessGame(int guess, int number){
    int newGuess;
    if(guess > number){
      System.out.print("Your guess is greater then the number you are looking for!");
      newGuess = guessAgain();
      guessGame(newGuess,number);
    }else if(guess < number){
      System.out.print("Your guess is less then the number you are looking for!");
      newGuess = guessAgain();
      guessGame(newGuess,number);
    }else{
      System.out.print("BINGO!");
    }
  }
  
  public static void main(String[] arg){
    
    Scanner in = new Scanner(System.in);
    Random random = new Random();
    
    int number = random.nextInt(100) + 1;
    int guess;
    
    System.out.print("Enter your guess : ");
    guess = in.nextInt();
    
    System.out.println(number);
    guessGame(guess, number);
    
    
  }
}