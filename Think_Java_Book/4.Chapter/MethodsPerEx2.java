import java.util.Scanner;

public class MethodsPerEx2{
  
  public static void printAmerican(String day, int date, String month, int year){
    System.out.println("Time in the American system: " + day + " " + month + " " + date + ". " + year + ".");
  }
  
  public static void printEuropean(String month, int date, int year, String day){
    System.out.println("Time in the European system: " + day + " " + date +". "+ month + " " + year+ ".");
  }
  
  public static void main(String[] arg){
    
    Scanner in = new Scanner(System.in);
    
    String day, month;
    int date, year;
    
    System.out.print("Enter the day: ");
    day = in.nextLine();
    System.out.print("Enter the month: ");
    month = in.nextLine();
    System.out.print("Enter the date: ");
    date = in.nextInt();
    System.out.print("Enter the year: ");
    year = in.nextInt();
    
 
    printAmerican(day, date, month, year);
    printEuropean(month, date, year, day);
  }
}