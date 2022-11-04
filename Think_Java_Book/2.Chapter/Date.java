public class Date{
  public static void main(String[] args){
    String day, mounth;
    int date, year;
    
    day = "Wednesday ";
    date = 2;
    mounth = "November";
    year = 2022;
    
    System.out.println(day);
    System.out.println(date);
    System.out.println(mounth);
    System.out.println(year);
    
    System.out.println("American format:");
    System.out.println(day + mounth + " " + date + "nd " + year + ".");
    System.out.println("European format:");
    System.out.println(day + date + "nd " + mounth + " " + year + ".");
  }
}