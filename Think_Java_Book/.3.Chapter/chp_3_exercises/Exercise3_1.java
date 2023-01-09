import java.util.Scanner;

public class Exercise1_1 {
	
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		double cel, fer;
		
		
		System.out.print("Enter the value of celcius : ");
		cel = in.nextDouble();
		
		fer = (cel * (9.0/5.0)) + 32;
		
		System.out.printf("%f C = %.1f F", cel, fer);
	}

}
