package domaci;

public class Test {
	
	public static void main(String[] args) {
		
		Racun r1 = new Racun();
		Racun r2 = new Racun("04/04/2023", 20.0);
		Racun r3 = new Racun(1, "05/04/2023", 40.0);
		
		Stavka s1 = new Stavka();
		Stavka s2 = new Stavka(4);
		Stavka s3 = new Stavka(1,6);
		
		Proizvod p1 = new Proizvod();
		Proizvod p2 = new Proizvod("Mleko", 30.0);
		Proizvod p3 = new Proizvod(1, "Hleb", 15.0);
		
		Kategorija k1 = new Kategorija();
		Kategorija k2 = new Kategorija("Mlecni Proizvodi");
		Kategorija k3 = new Kategorija(1,"Alkohol");
		
		//Povezivanje stavke i ranua
		s1.setRacun(r1);
		s2.setRacun(r2);
		s2.setRacun(r3);
	}

}
