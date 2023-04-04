
public class Exercise5_4 {

	public static void song(int n) {
		
		if(n >= 1) {
			System.out.println(n + " bottles of beer on the wall,");
			System.out.println(n + " bottles of beer,");
			System.out.println(" ya' take one down, ya' pass it around,");
			if(n == 1) {
				System.out.println ("No bottles of beer on the wall.");
				return;
			}
			System.out.println(n - 1 + " bottles of beer on the wall.");
			System.out.println();
			song(n -1 );
		}
		
	}
	
	public static void songEnd() {
		System.out.println("No bottles of beer on the wall,");
		System.out.println("no bottles of beer,");
		System.out.println("ya' can't take one down, ya' can't pass it around,");
		System.out.println("'cause there are no more bottles of beer on the wall!");
	}
	
	public static void main(String[] args) {
		
		int n = 99;
		
		song(n);
		System.out.println();
		songEnd();

	}

}
