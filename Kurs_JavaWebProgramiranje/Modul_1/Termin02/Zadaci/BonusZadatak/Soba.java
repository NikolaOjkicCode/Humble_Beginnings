package bonusZadatak;

public class Soba {
	
	//nepromenjivi atributi
	
	private long id;
	
	//promenjivi atributi
	
	private String tip;
	private int brojKreveta;
	private double cenaNocenja;
	
	
	//Konstruktori
	
	public Soba(long id, String tip, int brojKreveta, double cenaNocenja) {
		super();
		this.id = id;
		this.tip = tip;
		this.brojKreveta = brojKreveta;
		this.cenaNocenja = cenaNocenja;
	}
	
	public Soba( String tip, int brojKreveta, double cenaNocenja) {
		super();
		this.tip = tip;
		this.brojKreveta = brojKreveta;
		this.cenaNocenja = cenaNocenja;
	}
	
	public Soba() {
		this(0,"",0,0.0);
	}
	
	
	//Getter-i i Setter-i
	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public int getBrojKreveta() {
		return brojKreveta;
	}

	public void setBrojKreveta(int brojKreveta) {
		this.brojKreveta = brojKreveta;
	}

	public double getCenaNocenja() {
		return cenaNocenja;
	}

	public void setCenaNocenja(double cenaNocenja) {
		this.cenaNocenja = cenaNocenja;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	

}
