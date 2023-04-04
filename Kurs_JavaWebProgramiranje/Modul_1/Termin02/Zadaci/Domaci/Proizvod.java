package domaci;

public class Proizvod {
	
	//nemenjajuce promenjive
	
	private long id;
	
	//menjajuce promenjive
	
	private String naziv;
	private double cena;
	
	//Konstruktori
	public Proizvod(long id, String naziv, double cena) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.cena = cena;
	}
	
	public Proizvod(String naziv, double cena) {
		super();
		this.naziv = naziv;
		this.cena = cena;
	}
	
	public Proizvod() {
		this(0,"",0.0);
	}

	
	//Getter-i i Setter-i
	
	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public long getId() {
		return id;
	}

	
}
