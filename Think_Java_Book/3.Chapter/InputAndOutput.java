/*This import statement tells the compiler that when you say Scanner, you
 mean the one de ned in java.util. It's necessary because there might be
 another class named Scanner in another package.*/
import java.util.Scanner;

public class InputAndOutput{
  public static void main(String[] arg){
    int inch, remainder,quotient, feet;
    double cm;
    String line;
    Scanner in = new Scanner(System.in); //This line declares a Scanner variable named in and creates a new Scanner that takes input from System.in.
    
    System.out.println("Type something: ");
    line = in.nextLine(); //Scanner provides a method called nextLine that reads a line of input from the keyboard and returns a String.
    System.out.println("You said : " + line);
    
    System.out.println("Type something else: ");
    line = in.nextLine();
    System.out.println("You also said : " + line);
    
    
    System.out.print("How many inches? ");
    inch = in.nextInt(); //Scanner method nextInt, which reads input from the keyboard and converts it to an integer
    final double CM_PER_INCH = 2.54;
    /*Declaring that a variable is final means that it cannot be reassigned once
     it has been initialized. If you try, the compiler reports an error. Variables
     declared as final are called constants.*/
    cm = inch * CM_PER_INCH;
    
    System.out.printf("%d in = %f cm\n", inch, cm); 
    /*The format speci er %d displays integer values (\d" stands for \decimal"). The
     values are matched up with the format speci ers in order, so inch is displayed
     using %d, and cm is displayed using %f.*/
    
    /*
     %d decimal integer                                     12345
     %08d padded with zeros, at least 8 digits wide         00012345
     %f  oating-point                                       6.789000
     %.2f rounded to 2 decimal places                       6.79
     */
    
    inch = (int) (cm / CM_PER_INCH);
    /*The simplest way to convert a  oating-point value to an integer is to use a type
     cast, so called because it molds or \casts" a value from one type to another.*/
    System.out.printf("%f cm = %d in\n", cm, inch);
    /*The parentheses after the cast operator require the division to happen before
     the type cast.*/
    
    
    quotient = 76 / 12; // division
    remainder = 76 % 12; // modulus
    /*The  rst line yields 6. The second line, which is pronounced \76 mod 12",
     yields 4.*/
    
    //Converts centimeters to feet and inches.
    final int IN_PER_FOOT = 12;
    feet = inch / IN_PER_FOOT;
    System.out.printf("%.2f cm = %d ft, %d in\n",cm, feet, remainder);
    
    
    
    //Vocabulary
    
    /*
     
     package: A group of classes that are related to each other.
     
     address: The location of a value in computer memory, often represented as
     a hexadecimal integer.

     library: A collection of packages and classes that are available for use in other
     programs.
     
     import statement: A statement that allows programs to use classes de ned
     in other packages.
     
     token: A basic element of a program, such as a word, space, symbol, or
     number.
     
     literal: A value that appears in source code. For example, "Hello" is a string
     literal and 74 is an integer literal.
     
     magic number: A number that appears without explanation as part of an
     expression. It should generally be replaced with a constant.
     
     constant: A variable, declared final, whose value cannot be changed.
     
     format string: A string passed to printf to specify the format of the output.
     format specifier: A special code that begins with a percent sign and speci es
     the data type and format of the corresponding value.
     
     type cast: An operation that explicitly converts one data type into another.
     In Java it appears as a type name in parentheses, like (int).
     
     modulus: An operator that yields the remainder when one integer is divided
     by another. In Java, it is denoted with a percent sign; for example,
     5 % 2 is 1.
     
     */
  }
}