package bonusZadatak;

public class Rezervacija {
	
	//nepromenjivi atributi
	
	private long id;
	
	//promenjivi atributi
	
	private String datumVremeUlaska;
	private String imePrezimeGosta;
	
	
	//Konstruktori
	
	public Rezervacija(long id, String datumVremeUlaska, String imePrezimeGosta) {
		super();
		this.id = id;
		this.datumVremeUlaska = datumVremeUlaska;
		this.imePrezimeGosta = imePrezimeGosta;
	}
	
	public Rezervacija(String datumVremeUlaska, String imePrezimeGosta) {
		super();
		this.datumVremeUlaska = datumVremeUlaska;
		this.imePrezimeGosta = imePrezimeGosta;
	}
	
	public Rezervacija() {
		this(0,"","");
	}
	
	//Getter-i i Setter-i
	
	public String getDatumVremeUlaska() {
		return datumVremeUlaska;
	}
	public void setDatumVremeUlaska(String datumVremeUlaska) {
		this.datumVremeUlaska = datumVremeUlaska;
	}
	public String getImePrezimeGosta() {
		return imePrezimeGosta;
	}
	public void setImePrezimeGosta(String imePrezimeGosta) {
		this.imePrezimeGosta = imePrezimeGosta;
	}
	public long getId() {
		return id;
	}
	
	

}
