package domaci;

public class Stavka {

	//nemenjajuce promenjive
	
	private long id;
	
	//menjajuce promenjive
	
	private int kolicina;
	Racun racun;
	
	//Kontstruktori
	
	public Stavka(long id, int kolicina) {
		super();
		this.id = id;
		this.kolicina = kolicina;
	}
	
	public Stavka(int kolicina) {
		super();
		this.kolicina = kolicina;
	}
	
	public Stavka() {
		this(0,0);
	}
	
	
	//Getter-i i Setter-i

	public long getId() {
		return id;
	}

	public int getKolicina() {
		return kolicina;
	}

	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}

	public Racun getRacun() {
		return racun;
	}

	public void setRacun(Racun racun) {
		this.racun = racun;
	}
	
	
	
}
