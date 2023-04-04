package programski_jezik_java;

public class Zadatak_3 {

	public static void main(String[] args) {
		double obimKruga;
		double povrsinaKruga;
		
		double r;
		
		r = 20.0;
		
		if(r != 0.0) {
			obimKruga = 2*r*Math.PI;
			povrsinaKruga = Math.pow(r, 2);
			
			System.out.println("Obim kruga je : " + obimKruga);
			System.out.println("Povrsina kruga je : " + povrsinaKruga);
		}else {
			System.out.println("Nije inicijalizovana vrednost za poluprecnik!");
		}

		
	}

}
