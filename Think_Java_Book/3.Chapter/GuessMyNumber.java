import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber{
  public static void main(String[] arg){
    Scanner in = new Scanner(System.in);
    Random random = new Random();
    int guess, resault;
    
    
    int number = random.nextInt(100) + 1;
    
    System.out.print("Input the number between 1 nad 100 :");
    guess = in.nextInt();
    System.out.println("Your guess was : " + guess);
    System.out.println("Computer generated : " + number);
    
    if(guess > number){
      resault = guess - number;
      System.out.println("You were off by : " + resault);
    }else if (number > guess){
       resault = number - guess;
       System.out.println("You were off by : " + resault);
    }else{
      System.out.println("You were off by 0! GG!!!");
    }
    
  }
}