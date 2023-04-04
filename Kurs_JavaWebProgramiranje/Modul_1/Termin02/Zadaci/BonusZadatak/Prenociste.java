package bonusZadatak;

public class Prenociste {

	//nepromenjivi atributi
	
	private long id;
	
	//promenjivi atributi
	
	private double cena;
	private int brojZvezdica;
	
	
	//Kontruktori
	public Prenociste(long id, double cena, int brojZvezdica) {
		super();
		this.id = id;
		this.cena = cena;
		this.brojZvezdica = brojZvezdica;
	}
	
	public Prenociste(double cena, int brojZvezdica) {
		super();
		this.cena = cena;
		this.brojZvezdica = brojZvezdica;
	}
	
	public Prenociste() {
		this(0,0.0,0);
	}

	
	//Setter-i i Getter-i
	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public int getBrojZvezdica() {
		return brojZvezdica;
	}

	public void setBrojZvezdica(int brojZvezdica) {
		this.brojZvezdica = brojZvezdica;
	}

	public long getId() {
		return id;
	}
	
	
}
