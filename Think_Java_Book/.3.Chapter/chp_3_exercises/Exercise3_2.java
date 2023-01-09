import java.util.Scanner;

public class Exercise2_2 {
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		int totalSeconds, seconds, minutes, hours;
		
		System.out.print("Enter the amaunt of seconds to convert : ");
		totalSeconds = in.nextInt();
		
		hours = totalSeconds / 60 / 60;
		minutes = (totalSeconds / 60) % 60;
		seconds = totalSeconds - (hours * 60 * 60) - (minutes * 60);

		
		
		System.out.printf("%d  seconds = %d hours %d minutes %d seconds !", totalSeconds, hours, minutes, seconds);
	}

}
