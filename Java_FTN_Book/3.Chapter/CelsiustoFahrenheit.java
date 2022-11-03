import java.util.Scanner;

public class CelsiustoFahrenheit{
  public static void main(String[] args){
    
    double fr, cl;
    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter the temerature you want to convert: ");
    cl = in.nextDouble();
    fr = cl * (9.0/5.0) + 32.0;
    
    System.out.printf("%.1f C to %.1f F\n", cl, fr);
  }
}