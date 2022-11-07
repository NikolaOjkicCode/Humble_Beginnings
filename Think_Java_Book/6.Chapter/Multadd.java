import java.lang.Math;

public class Multadd{
  
  public static double multadd(double a, double b, double c){
    return a * b + c;
  }
  
  public static double expSum(double x){
      return (multadd(x,Math.exp(-x),Math.sqrt(1-Math.exp(-x))));
   }
  
  public static void main(String[] arg){
    
    
    System.out.println(multadd(2.0,3.0,4.0));
    System.out.println(multadd(0.5,Math.cos(Math.PI/4),Math.sin(Math.PI/4)));
    System.out.println(Math.log(10)+multadd(2,Math.log(2),Math.log(5)));
    System.out.println(expSum(2.0));
    
    
  }
}