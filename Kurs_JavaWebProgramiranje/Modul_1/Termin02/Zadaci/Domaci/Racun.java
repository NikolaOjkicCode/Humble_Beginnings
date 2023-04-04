package domaci;

public class Racun {
	
	//nemenjajuce promenjive
	
	private long id;
	
	//menjajuce promenjive
	
	private String datum;
	private double ukupnaCena;
	
	//Kontruktori
	
	
	public Racun(long id, String datum, double ukupnaCena) {
		super();
		this.id = id;
		this.datum = datum;
		this.ukupnaCena = ukupnaCena;
	}
	public Racun(String datum, double ukupnaCena) {
		super();
		this.datum = datum;
		this.ukupnaCena = ukupnaCena;
	}
	public Racun() {
		this("",0.0);
	}
	
	
	//Getter-i i setter-i
	
	public long getId() {
		return id;
	}
	public String getDatum() {
		return datum;
	}
	public void setDatum(String datum) {
		this.datum = datum;
	}
	public double getUkupnaCena() {
		return ukupnaCena;
	}
	public void setUkupnaCena(double ukupnaCena) {
		this.ukupnaCena = ukupnaCena;
	}
	
	

}
