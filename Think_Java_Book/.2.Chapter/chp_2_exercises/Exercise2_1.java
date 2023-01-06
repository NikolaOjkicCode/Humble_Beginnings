
public class Exercise2_1 {
	public static void main(String[] arg){
		String day, month;
		int date, year;
		
		day = "Friday";
		month = "January";
		date = 6;
		year = 2023;
		
		System.out.println(day);
		System.out.println(month);
		System.out.println(date);
		System.out.println(year);
		
		System.out.println("American format: ");
		System.out.println(day + ", " + month +  " " + date + ", " + year + "." );
		
		System.out.println("European format: ");
		System.out.println(day + " " + date +  " " + month + " " + year + "." );
		
		System.out.println("Hello World!");
	}
}
