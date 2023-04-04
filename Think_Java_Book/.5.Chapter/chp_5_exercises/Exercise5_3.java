
public class Exercise5_3 {

	public static void checkFermat(int a, int b, int c, int n) {
		if(   (n > 2)      &&    ( Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) ) {
			System.out.println("Holy smokes, Fermat was wrong!");
		}else {
			System.out.println("No, that doesn't work");
		}
	}
	
	public static void main(String[] args) {
		
		int a = 4;
		int b = 5;
		int c = 6;
		
		int n = 3;
		
		checkFermat(a,b,c,n);
	}

}
