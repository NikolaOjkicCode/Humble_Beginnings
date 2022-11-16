//Write a method named isDivisible that takes two integers, n and m, and that returns true if n is divisible by m, and false otherwise.

public class Exercise6_1{
  
  public static boolean isDivisible(int n, int m){
    if(n % m == 0){
      return true;
    }else{
      return false;
    }
  }
  
  public static void main(String[] arg){
    int m = 2;
    int n = 2;
    
    if(isDivisible(n,m)){
      System.out.println("n is divisible by m!");
    }else{
       System.out.println("n is NOT divisible by m!");
    }
  
  }
}