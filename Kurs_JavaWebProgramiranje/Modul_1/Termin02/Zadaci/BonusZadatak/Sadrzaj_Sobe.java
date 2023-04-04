package bonusZadatak;

public class Sadrzaj_Sobe {
	
	//nepromenjivi atributi
	
	private long id;
	
	//promenjivi atributi
	
	private boolean klima;
	private String posteljina;
	
	//Konstruktori
	public Sadrzaj_Sobe(long id, boolean klima, String posteljina) {
		super();
		this.id = id;
		this.klima = klima;
		this.posteljina = posteljina;
	}
	
	public Sadrzaj_Sobe(boolean klima, String posteljina) {
		super();
		this.klima = klima;
		this.posteljina = posteljina;
	}
	
	public Sadrzaj_Sobe() {
		this(0,false,"");
	}
	
	//Getter-i i Setter-i

	public boolean isKlima() {
		return klima;
	}

	public void setKlima(boolean klima) {
		this.klima = klima;
	}

	public String getPosteljina() {
		return posteljina;
	}

	public void setPosteljina(String posteljina) {
		this.posteljina = posteljina;
	}

	public long getId() {
		return id;
	}
	
	

}
