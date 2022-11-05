import java.util.Scanner;

public class BottlesOfBeer{
  
  public static void songOfBeers(int n){
    if(n > 0){
      System.out.println(n + " bottles of beer on the wall,");
      System.out.println(n + " bottles of beer,");
      System.out.println("ya' take one down, ya' pass it around,");
      songOfBeers(n - 1);
    }else{
      System.out.println("No bottles of beer on the wall,");
      System.out.println("no bottles of beer,");
      System.out.println("ya' can't take one down, ya' can't pass it around,");
      System.out.println("'cause there are no more bottles of beer on the wall!");
    }
    
  }
  
  public static void main(String[] arg){
    
    Scanner in = new Scanner(System.in);
    int n;
    
    System.out.print("Enter the number of bottles :");
    n = in.nextInt();
    
    songOfBeers(n);
    
  }
}