/*Write a recursive method named oddSum that takes a positive odd integer n and returns the sum of odd integers from 1 to n. 
 * Start with a base case, and use temporary variables to debug your solution.
 * You might find it helpful to print the value of n each time oddSum is invoked.*/

public class Exercise6_6{
  
  public static int oddSum(int n){
    
    System.out.println(n);
    
    if(n == 1){
      return n;
    }else{
      return n + oddSum(n-2);
    }
   
  }
  
  public static void main(String[] arg){
    int n = 5;
    
    System.out.println("The sum of all the odd integers from 1 to " + n + " is : " + oddSum(n) + " !");
  }
}