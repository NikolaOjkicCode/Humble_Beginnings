/*
The point of this exercise is to make sure you understand how to write and invoke methods that take parameters.

1. Write the first line of a method named zool that takes three parameters:
an int and two Strings and it prints those parameters.

2. Write a line of code that calls zool, passing as arguments the value 11,
the name of your first pet, and the name of the street you grew up on.

*/

public class Exercise4_2{
  public static void zool(int x, String s, String s2){
    System.out.println(x);
    System.out.println(s);
    System.out.println(s2);
  } 
    
  public static void main(String[] arg){
    
    int x = 11;
    String s = "Luna";
    String s2 = "Slobodana Bajica";
    
    zool(x,s,s2);
  }
}