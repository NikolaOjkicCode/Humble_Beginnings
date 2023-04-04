package java_i_okruzenje;

public class Zadatak_2 {

	public static void main(String[] args) {
		/*Napisati program koji za date stranice a=3, b=4 i c=5 računa površinu i zapreminu kvadra. 
		 * Ispisati na ekranizračunate vrednosti. P = 2(ab+ac+bc); V = a * b * c;*/
		
	int a = 3, b = 4, c = 5;
	
	int p, v;
	
	p = 2*(a*b + a*c + b*c);
	v = a * b * c;
	
	System.out.println("Povrsina ovog kvadrata je : " + p);
	System.out.println("Zapremina ovog kvadrata je : " + v);

	}

}
