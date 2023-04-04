package programski_jezik_java;

public class Zadatak_1 {

	public static void main(String[] args) {
		int tezinaPaketa;
		String imePosiljaoca,prezimePosiljaoca,adresaPosiljaoca;
		String imePrimaoca,prezimePrimaoca,adresaPrimaoca;
		String preporuka;
		
		tezinaPaketa = 50;
		
		imePosiljaoca = "Sinisa";
		prezimePosiljaoca = "Ojkic";
		adresaPosiljaoca = "Sremski Karlovci 28";
		
		imePrimaoca = "Nikola";
		prezimePrimaoca = "Ojkic";
		adresaPrimaoca = "Novi Sad, Bate Brkica 7";
		
		preporuka = "jeste";
		
		System.out.println("Posiljac " + imePosiljaoca + " " + prezimePosiljaoca + " sa adrese " + adresaPosiljaoca + 
				" salje paket " + imePrimaoca + " " +prezimePrimaoca + " na adresu " + adresaPrimaoca);
		System.out.println("Tezina paketa je : " +  tezinaPaketa + "kg");
		System.out.println("Poslati preporuceno : " + preporuka);

	}

}
