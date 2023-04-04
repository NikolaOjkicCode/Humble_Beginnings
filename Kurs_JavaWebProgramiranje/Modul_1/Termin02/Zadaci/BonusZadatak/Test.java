package bonusZadatak;

public class Test {
	
	public static void main(String[] args) {
		
		Prenociste p1 = new Prenociste();
		Prenociste p2 = new Prenociste(200.0, 4);
		Prenociste p3 = new Prenociste(1, 300.0, 5);
		
		Soba s1 = new Soba();
		Soba s2 = new Soba("Pogled na more", 2, 30.0);
		Soba s3 = new Soba(1,"Pobled na sumu", 3, 50.0);
		
		Sadrzaj_Sobe sd1 = new Sadrzaj_Sobe();
		Sadrzaj_Sobe sd2 = new Sadrzaj_Sobe(true,null);
		Sadrzaj_Sobe sd3 = new Sadrzaj_Sobe(1,true,null);
		
		Rezervacija r1 = new Rezervacija();
		Rezervacija r2 = new Rezervacija(null,null);
		Rezervacija r3 = new Rezervacija(1,null,null);
		

	}
}
