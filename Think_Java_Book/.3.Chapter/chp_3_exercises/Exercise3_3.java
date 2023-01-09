import java.util.Scanner;
import java.util.Random;

public class Exercise3_3 {
	
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		int guess;
		
		
		// pick a random number
		Random random = new Random();
		int number = random.nextInt(100) + 1;
		
		System.out.print("Enter your guess: ");
		guess = in.nextInt();
		
		System.out.println("The number i was tinking of is : " + number);
		System.out.println("Your guess was : " + guess);
		
		
		System.out.println("You were off by: " + Math.abs(number - guess));
	}

}
