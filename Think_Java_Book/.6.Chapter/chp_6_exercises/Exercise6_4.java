//What is the output of the following program?
//The purpose of this exercise is to make sure you understand logical operators and the flow of execution through value methods.

public class Exercise6_4{
  public static void main(String[] args) {
    boolean flag1 = isHoopy(202); 
    boolean flag2 = isFrabjuous(202); 
    System.out.println(flag1); //true
    System.out.println(flag2); //true
    
    if (flag1 && flag2) {
      System.out.println("ping!"); //ping!
    }
    
    if (flag1 || flag2) {
      System.out.println("pong!"); //ping!
    }
  }
  
  public static boolean isHoopy(int x) {
    boolean hoopyFlag;
    
    if (x % 2 == 0) {
      hoopyFlag = true;
    } else {
      hoopyFlag = false;
    }
    
    return hoopyFlag;
  }
  
  public static boolean isFrabjuous(int x) {
    boolean frabjuousFlag;
    
    if (x > 0) {
      frabjuousFlag = true;
    } else {
      frabjuousFlag = false;
    }
    
    return frabjuousFlag;
    
    /* true
     * true
     * ping!
     * ping!      -- This will be the output of this program!
     */
  }
}