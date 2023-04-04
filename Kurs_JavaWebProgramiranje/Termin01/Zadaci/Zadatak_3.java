package java_i_okruzenje;

public class Zadatak_3 {

	public static void main(String[] args) {
		/*Napisati program koji izračunava površinu kupe prečnika 6 i visine 4? Ako nam je poznata formula:
		 r* pi * (s+r). Ispisati na ekran izračunatu vrednost.
		 */

	int R = 6;
	int H = 4;
	
	int r;
	double s, P;
	
	r = R / 2;
	s = Math.pow(r, 2) + Math.pow(H, 2);
	System.out.println(s);
	s = Math.sqrt(s);
	System.out.println(s);
	
	P = r * Math.PI * (s + r);
	
	System.out.println("Povrsina je : " + P);
	}

}
