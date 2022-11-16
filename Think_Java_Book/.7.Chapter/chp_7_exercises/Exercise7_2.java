/*
 In Exercise 6.8 we wrote a recursive version of power, which takes a double x and an integer n and returns . 
 Now write an iterative method to perform the same calculation.
 */

public class Exercise7_2{
  
  public static double power(double x, int n){
      double result = 1;
      for (int i=0;i<n;i++){
         result *= x;
      }
      return result;
   }
  
  public static void main(String[] arg){
    
    double x;
    int n;
    
    x = 2.0;
    n = 2;
    
    System.out.println(power(x,n));
  }
}