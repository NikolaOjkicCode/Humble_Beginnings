/*The goal of this exercise is to translate a recursive definition into a Java method. The Ackermann function is defined for non-negative integers as follows:

A(m; n) = 
                 n + 1     if   m = 0
                 A(m - 1; 1)   if m > 0 and n = 0
                 A(m - 1;A(m; n - 1))  if m > 0 and n > 0

Write a method called ack that takes two ints as parameters and that computes and returns the value of the Ackermann function. 
Test your implementation of Ackermann by invoking it from main and displaying the return value. Note the return value gets very big very quickly. 
You should try it only for small values of m and n (not bigger than 3).
*/

public class Exercise6_7{
  
  public static int ack(int m, int n){
    if(m == 0){
      return n + 1;
    }else if(m > 0 && n == 0){
      return ack(m - 1, 1);
    }else if(m > 0 && n > 0){
      return ack(m-1,ack(m,n-1));
    }else{
      return 0;
    }
  }
  
  public static void main(String[] arg){
    int m,n;
    
    m = 1;
    n = 3;
    
    System.out.println(ack(m,n));
  }
}