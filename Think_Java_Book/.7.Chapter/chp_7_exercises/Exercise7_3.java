/*
 Section 6.7 presents a recursive method that computes the factorial function. Write an iterative version of factorial.
 */

public class Exercise7_3{
  
  public static int factorial(int n){
      int result = 1;
      for (int i=1;i<=n;i++){
         result = result * i;
      }
      return result;
   }
  
  public static void main(String[] arg){
    int n;
    
    n = 3;
    
    System.out.println(factorial(n));
  }
}