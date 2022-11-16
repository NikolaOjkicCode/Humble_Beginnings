/*If you are given three sticks, you may or may not be able to arrange them in a triangle. For example, 
 * if one of the sticks is 12 inches long and the other two are one inch long, you will not be able to get the short sticks to meet in the middle. 
 * For any three lengths, there is a simple test to see if it is possible to form a triangle:

    If any of the three lengths is greater than the sum of the other two,
    you cannot form a triangle.

Write a method named isTriangle that takes three integers as arguments and returns either true or false, 
depending on whether you can or cannot form a triangle from sticks with the given lengths. 
The point of this exercise is to use conditional statements to write a value method.*/

public class Exercise6_2{
  
  public static boolean isTriangle(int x, int y, int z){
    if(x > y + z || y > x + z || z > x + y){
      return false;
    }else{
      return true;
    }
  }
  
  public static void main(String[] arg){
  
    int x,y,z;
    
    x = 5;
    y = 5;
    z = 5;
    
    if(isTriangle(x,y,z)){
      System.out.println("It is possible to form a triangle!");
    }else{
      System.out.println("It is NOT possible to form a triangle!");
    }
  }
}