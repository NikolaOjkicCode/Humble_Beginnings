/*
Write a recursive method called power that takes a double x and an integer n and returns x^n.

Hint: A recursive definition of this operation is x^n = x * x^n-1. Also, remember that anything raised to the zeroth power is 1.

Optional challenge: you can make this method more eficient, when n is even, using x^n = (x^(n/2))^2
*/

public class Exercise6_8{
  
 public static double power(double x, int n){
      if (x == 0){
         if (n == 0){
            return 1;
         } 
         else {
            return 0;
         }
      }
      else {
         if (n == 1){
            return x;
         } 
         else if (n == 2){
            return x*x;
         } 
         else {
            if (n % 2 == 0){
               return power(power(x,n/2),2);
            } 
            else {
               return x * power(x,n-1);
            }
         }
      }
   }
  
  public static void main(String[] arg){
    double x;
    int n;
    
    x = 2.0;
    n = 2;
    
    System.out.println(power(x, n));
  }
}