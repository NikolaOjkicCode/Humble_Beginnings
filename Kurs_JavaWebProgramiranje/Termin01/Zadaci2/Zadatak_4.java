package programski_jezik_java;

public class Zadatak_4 {

	public static void main(String[] args) {
		
		int povrsina,obim;	
		int a,b;
		
		a = 4;
		b = 5;
		
		if(a == 0 || b == 0) {
			System.out.println("Nisu inicijalizovane sve stranice");
		}else {
			povrsina = a * b;
			obim = 2*a + 2*b;
			
			System.out.println("Povrsina pravougaonika je : " + povrsina);
			System.out.println("Obim pravougaonika je : " + obim);
		}

	}

}
