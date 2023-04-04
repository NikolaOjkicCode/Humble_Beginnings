package domaci;

public class Kategorija {
	
	//nemenjajuce promenjive
	
	private long id;
	
	//menjajuce promenjive
	
	private String naziv;

	public Kategorija(long id, String naziv) {
		super();
		this.id = id;
		this.naziv = naziv;
	}
	
	public Kategorija(String naziv) {
		super();
		this.naziv = naziv;
	}
	
	public Kategorija() {
		this(0,"");
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public long getId() {
		return id;
	}

}
