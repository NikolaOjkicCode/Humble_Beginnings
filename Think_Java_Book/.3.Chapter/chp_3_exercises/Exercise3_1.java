/*
 Write a program that converts a temperature from Celsius to Fahrenheit. 
 It should (1) prompt the user for input, (2) read a double value from the keyboard, 
 (3) calculate the result, and (4) format the output to one decimal place. 
 For example, it should display "24.0 C = 75.2 F". Here is the formula. 
 Be careful not to use integer division!

 F = C * (9/5) + 32

 Use "printf" to display your resaults!
*/

import java.util.Scanner;

public class Exercise3_1{
  
  public static void main(String[] arg){
    
    double cel, resault;
    
    Scanner in = new Scanner(System.in);
    
    System.out.print("Input the celsius value: ");
    cel = in.nextDouble();
    
    resault = cel * (9/5) + 32;
    
    System.out.printf("The converted value is : %.1f Fahrenheit", resault);
    
  }
}