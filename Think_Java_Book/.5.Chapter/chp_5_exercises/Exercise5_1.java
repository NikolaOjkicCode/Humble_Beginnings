/*
Logical operators can simplify nested conditional statements. For example, can you rewrite this code using a single if statement

if (x > 0) {
 if (x < 10) {
  System.out.println("positive single digit number.");
 }
}
*/

public class Exercise5_1{
  public static void main(String[] arg){
    int x = 9;
    
    if(x > 0 && x < 10){
      System.out.println("positive single digit number.");
    }
    
  }
}