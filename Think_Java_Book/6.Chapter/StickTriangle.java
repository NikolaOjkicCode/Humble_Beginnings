import java.util.Scanner;

public class StickTriangle{
  
  public static boolean isTriangle(int x, int y, int z){
    
    if(x > y+z){
      return false;
    }else if (y > x + z){
      return false;
    }else if(z > y + x){
      return false;
    }else{
      return true;
    }
    
  }
  
  public static void main(String[] arg){
    
    Scanner in = new Scanner(System.in);
    int x, y, z;
    
    System.out.print("Input the first length of a stick");
    x = in.nextInt();
    System.out.print("Input the second length of a stick");
    y = in.nextInt();
    System.out.print("Input the third length of a stick");
    z = in.nextInt();
    
    if(isTriangle(x,y,z)){
      System.out.println("These three stick CAN be made into a triangle");
    }else{
      System.out.print("These three sticks CAN NOT be made into a triangle");
    }
    
  }
}