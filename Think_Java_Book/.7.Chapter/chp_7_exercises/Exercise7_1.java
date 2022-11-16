//Consider the following methods:
//What is the output of this program?

public class Exercise7_1{
  
  public static void loop(int n) {
    int i = n;
    while (i > 1) {
      System.out.println(i);
      
      if (i % 2 == 0) {
        i = i / 2;
      } else {
        i = i + 1;
      }
    }
  }
  public static void main(String[] arg){
    
    int n;
    n = 10;
    
    loop(n);
    
    /*
     * The output would be:
     *10
     * 5
     * 6
     * 3
     * 4
     * 2
     */
      
  }
}