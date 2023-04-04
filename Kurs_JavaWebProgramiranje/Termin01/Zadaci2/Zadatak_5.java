package programski_jezik_java;

public class Zadatak_5 {

	public static void main(String[] args) {
		
		double cenaProizvoda;
		double kolicinaProizvoda;
		
		boolean akcija = true;
		double popust, konacnaCena;
		
		cenaProizvoda = 20;
		kolicinaProizvoda = 2;
		
		if(akcija) {
			popust = cenaProizvoda / 10;
			cenaProizvoda = cenaProizvoda - popust;
			konacnaCena = cenaProizvoda * kolicinaProizvoda;
			
			System.out.println("Vas racun iznosi : " + konacnaCena);
			System.out.println("U cenu je uračunat akcijski popust od 10%. ");
		}else {
			
			konacnaCena = cenaProizvoda * kolicinaProizvoda;
			System.out.println("Vas racun iznosi : " + konacnaCena);
		}
		
	}

}
