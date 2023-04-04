import java.util.Scanner;
import java.util.Random;

public class Exercise5_6 {
	
	public static void guess(Scanner in, int number) {
		
		int guess;
		System.out.print("Enter your guess: ");
		guess = in.nextInt();
		
		if(guess == number) {
			
			System.out.println("You guessed right!!!");
			
		}else {
			
			if(guess > number) {
				System.out.println("You guessed was too high");
			}else {
				System.out.println("You guessed was too low");
			}
			guess(in,number);
			
		}
	}
	
	
	public static void main(String[] arg) {
		
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		int number = random.nextInt(100) + 1;
		
		
		guess(in,number);
		
		
	}
	

}