public class LogicalOperators{
  public static void main(String[] arg){
    
    int x = 5;
    
    if (x > 0) {
      if (x < 10) {
        System.out.println("positive single digit number.");
      }
    }
    
    if(x > 0 && x < 10){
      System.out.println("positive single digit number.");
    }
    
  }
}