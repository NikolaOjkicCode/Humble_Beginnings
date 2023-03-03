
public class Exercise_2 {
	
	public static void information(int x, String s, String s2) {
		System.out.println("Hello your pets name is : " + s + " you grew up on : " + s2);
		System.out.println("The age of your pet is : " + x);
	}
	
	public static void main(String[] arg) {
		
		int x = 11;
		String s = "Luna";
		String s2 = "Slobodana Bajica";
		
		information(x,s,s2);
		
	}
}
