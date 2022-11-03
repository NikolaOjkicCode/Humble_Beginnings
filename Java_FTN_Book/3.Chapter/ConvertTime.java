import java.util.Scanner;

public class ConvertTime{
  public static void main(String[] arg){
    Scanner in = new Scanner(System.in);
    int input, hr, min, sec;
    
    System.out.print("Input the amount of seconds you want to convert :");
    input = in.nextInt();
    
    hr = (input / 60) / 60;
    min =(input - (hr * 60 * 60)) / 60;
    sec =(input - (hr * 60)) % 60;
    
    System.out.printf("%d seconds = %d hour %d minutes and %d seconds\n ", input, hr, min, sec);
  }
}