
public class Exercise5_5 {
	
	public static void baffle(String blimp) {
		System.out.println(blimp);//2 , blimp == "rattle"
		zippo("ping", -5);
	}
	
	public static void zippo(String quince, int flag) {
		if (flag < 0) {
			
			System.out.println(quince + " zoop");//3
		} else {
			
			System.out.println("ik"); //1
			baffle(quince);
			System.out.println("boo-wa-ha-ha");//4
		
		}
	}
	
	public static void main(String[] args) {
		
		zippo("rattle", 13);
		
	}
	
	/*
	 * ik
	 * rattle
	 * ping zoop
	 * boo-wa-ha-ha
	 * 
	 * */
	
}


