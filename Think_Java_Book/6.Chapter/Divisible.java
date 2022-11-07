import java.util.Scanner;

public class Divisible{
  
  public static boolean isDivisible(int n, int m){
    
    if(n % m == 0){
      return true;
    }else 
      return false;
  }
  
  
  public static void main(String[] arg){
    
    Scanner in = new Scanner(System.in);
    int n, m;
    
    System.out.print("Input the value for n :");
    n = in.nextInt();
    System.out.print("Input the value for m :");
    m = in.nextInt();

    if(isDivisible(n,m)){
      System.out.println("N is devisible by m !");
    }else{
      System.out.println("N is NOT devisible by m !");
    }
    
  }
}