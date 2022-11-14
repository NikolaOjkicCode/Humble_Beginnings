/*
 The point of this exercise is to practice reading code and to make sure that you understand the ow of execution through a program with multiple methods.

 
 2. What happens if you invoke baffle(); at the end of the ping method?
 
 */
public class Exercise4_1{
  
  public static void zoop() {
    baffle();
    System.out.print("You wugga ");
    baffle();
  }
  
  public static void baffle() {
    System.out.print("wug");
    ping();
  }
  
  public static void ping() {
    System.out.println(".");
    //baffle();  - "java.lang.StackOverflowError"
  }
  
  public static void main(String[] arg){
    
    System.out.print("No, I ");
    zoop();
    System.out.print("I ");
    baffle();
    
    /* 1. What is the output of the following program? Be precise about where there are spaces and where there are newlines. 
    Hint: Start by describing in words what ping and baffle do when they are invoked.*/
    
    /* 
     * No, I wug.
     * You wugga wug.
     * I wug.
     */
    
     // 2. What happens if you invoke baffle(); at the end of the ping method?
    
    /* No, I wug..
     * wug.
     * wug.
     * .
     * .
     * .
     * wug.
     * 
     * It prints wug. until we can an error "java.lang.StackOverflowError"
     */
    
  }
}