public class Exercise_3 {
	
	public static void printAmerican(int date, int year, String day, String month) {
		System.out.println("American format: ");
		System.out.println(day + ", " + month +  " " + date + ", " + year + "." );
	}
	
	public static void printEuropean(int date, int year, String day, String month) {
		System.out.println("European format: ");
		System.out.println(day + " " + date +  " " + month + " " + year + "." );
	}
	
	public static void main(String[] arg){
		String day, month;
		int date, year;
		
		day = "Friday";
		month = "January";
		date = 6;
		year = 2023;
		
		printAmerican(date,year,day,month);
		printEuropean(date,year,day,month);
		
	}
	
}