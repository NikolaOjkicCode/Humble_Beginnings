/*
1. What is the output of this program? (Try to answer this question in a
comment frst, then run the code to check your answer.)

2. Explain in a few words what prod does (without getting into the details
of how it works).

3. Rewrite prod without the temporary variables recurse and result.

Hint: You only need one line for the else branch.
 */

public class Exercise6_5{
  public static void main(String[] args) {
    
    System.out.println(prod(1, 4));
  }
  
  public static int prod(int m, int n) {
    
    if (m == n) {
      return n; 
    } else {
      /*int recurse = prod(m, n - 1); 
      int result = n * recurse;      
      return result; 
      */
      return (n*prod(m, n - 1));
    }
    
    /*
     * 24
     * 
     * Method prod is a recursive metod that multiplies m and (n  - 1)
     */
  }
}