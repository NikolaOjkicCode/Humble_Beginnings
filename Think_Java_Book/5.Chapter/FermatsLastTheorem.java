import java.lang.Math;

public class FermatsLastTheorem{
  
  public static void checkFermat(int a, int b, int c, int n){
    if(n > 2 && ((Math.pow(a, n) + Math.pow(b, n)) == Math.pow(c, n) )){
      System.out.println("Holy smokes, Fermat was wrong!");
    }else if(n <= 2 && ((Math.pow(a, n) + Math.pow(b, n)) == Math.pow(c, n) )){
      System.out.println("Correct!");
    }
    else{
      System.out.println("No, that doesn't work.");
    }
  }
  
  public static void main(String[] arg){
    
    int a, b, c, n;
    double rez, rez2, rez3;
    
    a = 5;
    b = 3;
    c = 8;
    
    n = 3;
    
   checkFermat(a, b, c, n);
  }
}