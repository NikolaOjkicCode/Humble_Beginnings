public class Exercise2_1{
  public static void main(String[] arg){
    String day,date,month;
    int year;
    
    day = "Friday";
    date = "11th";
    month = "November";
    year = 2022;
    
    System.out.println("Hello :)");
    System.out.println(day);
    System.out.println(date);
    System.out.println(month);
    System.out.println(year);
    
    System.out.println("American format:");
    System.out.println(day + ", " + month + " " + date + ", " + year + ". ");
    System.out.println("European format:");
    System.out.println(day + " " + date + " " + month + " " + year + ". ");
  }
}