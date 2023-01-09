import java.util.Scanner;

public class TheScannerBug {
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		int age;
		String name;
		
		System.out.print("What is your age?");
		age = in.nextInt();
		in.nextLine();  /* add this to not get a "Scanner bug" (scanner bug happens when trying to get a 
		string value right after an int value)*/
				
		System.out.print("What is your name?");
		name = in.nextLine();
		
		System.out.printf("%s, age %d\n", name, age);
		
	}

}
