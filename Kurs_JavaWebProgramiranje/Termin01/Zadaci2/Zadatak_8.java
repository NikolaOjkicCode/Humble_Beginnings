package programski_jezik_java;

public class Zadatak_8 {

	public static void main(String[] args) {
		int x,y;
		
		x = 20;
		y = 10;
		
		String min = "min", max = "max", swap = "swap", equals = "equals";
		String operacija;
		
		operacija = "afsfals";
		
		
		if(operacija.equals(min)) {
			
			if(x > y) {
				System.out.println(y);
			}else {
				System.out.println(x);
			}
			
		}else if(operacija.equals(max)){
			
			if(x > y) {
				System.out.println(x);
			}else {
				System.out.println(y);
			}
			
		}else if(operacija.equals(swap)){
			
			int temp = x;
			x = y;
			y = temp;
			
			System.out.println(y);
			System.out.println(x);
			
		}else if(operacija.equals(equals)){
			if(x == y) {
				System.out.println(0);
			}else if(x > y) {
				System.out.println(1);
			}else {
				System.out.println(-1);
			}
		}else {
			System.out.println("You hava entered a wrog word!");
		}

	}

}
