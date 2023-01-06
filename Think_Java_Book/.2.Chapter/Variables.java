
public class Variables {
	public static void main(String[] arg) {
		String massage;
		int hour, minute;
		double pi;
		
		int a = 5;
		int b = a; // a and b are now equal (a = 5, b = 5)
		System.out.println("a = " +  a  + " b = " + b);
		
		a = 3;     // a and b are no longer equal (a = 3, b = 5)
		System.out.println("a = " +  a  + " b = " + b);
		
		massage = "Hello again!";
		hour = 11;
		minute = 59;
		pi = 3.14159;
		
		System.out.println("This is a floating number : " + pi);
		
		System.out.print("The value of massage is  : ");
		System.out.println(massage);
		
		System.out.print("The current time is : ");
		System.out.print(hour);
		System.out.print(":");
		System.out.print(minute);
		System.out.println(".");
		
		System.out.print("Number of minutes since midnight: ");
		System.out.println(hour * 60 + minute);
		
		System.out.print("Precent of the hour that has passed :");
		System.out.println(minute * 100 / 60);
		
	}
}
