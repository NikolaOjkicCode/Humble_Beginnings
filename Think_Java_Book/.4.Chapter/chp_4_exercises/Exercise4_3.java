/*
The purpose of this exercise is to take code from a previous exercise and encapsulate it in a method that takes parameters. 

1. Write a method called printAmerican that takes the day, date, month
and year as parameters and that displays them in American format.

2. Test your method by invoking it from main and passing appropriate
arguments. The output should look something like this (except that the
date might be diferent):

Saturday, July 22, 2015.

3. Once you have debugged printAmerican, write another method called
printEuropean that displays the date in European format.

*/

public class Exercise4_3{
  
  public static void printAmerican(String day,int date, String month, int year){
    System.out.println(day + ", " + month + " " + date + ", " + year + ".");
  }
  
  public static void printEuropean(String day,int date, String month, int year){
    System.out.println(day + ", " + date + " " + month + ", " + year + ".");
  }
  
  public static void main(String[] arg){
    
    String day = "Saturday";
    String month = "July";
    int date =  22;
    int year = 2015;
    
    printAmerican(day, date, month, year);
    printEuropean(day, date, month, year);
  }
}