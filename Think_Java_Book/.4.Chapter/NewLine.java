public class NewLine {
	
	public static void newLine() {
		System.out.println();
	}
	
	public static void threeLines() {
		newLine();
		newLine();
		newLine();
	}
	
	public static void printTwice(String s) {
		System.out.println(s);
		System.out.println(s);
	}
	
	public static void main(String[] arg) {
		
		System.out.print("Sample Text 1");
		newLine();
		System.out.print("Sample Text 2");
		threeLines();
		System.out.println("Sample Text 3");
		
		newLine();
		String argument = "Dont make me repeat myself!";
		printTwice(argument);
		
	}
}
