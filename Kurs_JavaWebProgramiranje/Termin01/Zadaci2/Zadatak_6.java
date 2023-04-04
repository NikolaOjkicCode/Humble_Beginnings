package programski_jezik_java;

public class Zadatak_6 {

	public static void main(String[] args) {
		int godina;
		
		godina = 2023;
		
		if(godina % 400 == 0) {
			System.out.println("Prestupna je!");
		}else if (godina % 400 != 0 && godina % 100 == 0) {
			System.out.println("Nije prestupna je!");
		}else if(godina % 100 != 0 && godina % 4 == 0) {
			System.out.println("Prestupna je!");
		}else if(godina % 100 != 0 && godina % 4 != 0) {
			System.out.println("Nije prestupna je!");
		}
			

	}

}
