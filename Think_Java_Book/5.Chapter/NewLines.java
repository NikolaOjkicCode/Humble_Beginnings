import java.util.Scanner;

public class NewLines{
  
  public static void nLines(int n) {
    if (n > 0) {
      System.out.println();
      nLines(n - 1);
    }
  }
  
  public static void main(String[] arg){
    
    Scanner in = new Scanner(System.in);
    int nL;
    
    System.out.println("Hello World!");
    System.out.print("Enter the number of line you want to skip : ");
    nL = in.nextInt();
    nLines(nL);
    System.out.println("Goodbye!");
    
  }
}