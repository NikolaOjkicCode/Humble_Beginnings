public class Variables{
  public static void main(String[] arg){
    
    String firstName;  
    String lastName;
    int hour, minute;
    /*This example declares two variables with type String and two with type
     int. When a variable name contains more than one word, like firstName,
     it is conventional to capitalize the  rst letter of each word except the  rst.
     Variable names are case-sensitive, so firstName is not the same as firstname
     or FirstName.*/
    
    firstName = "Nikola";
    lastName = "Ojkic";
    hour = 11;
    minute = 15;
    /*Now that we have declared variables, we want to use them to store values. We
     do that with an assignment statement.*/
    
    /*When you declare a variable, you create a named storage location.
     When you make an assignment to a variable, you update its value.*/
    
    int a = 5;
    int b = a; // a and b are now equal
    a = 3;    // a and b are no longer equal
    
    String firstLine = "Hello, again!";
    System.out.println(firstLine);
    
    
    hour = 11;
    minute = 59;
    System.out.print("The current time is ");
    System.out.print(hour);
    System.out.print(":");
    System.out.print(minute);
    System.out.println(".");
    
    /*To output multiple values on the same line, it's common to use several print
     statements followed by println at the end. But don't forget the println!
     On many computers, the output from print is stored without being displayed
     until println is run; then the entire line is displayed at once. If you omit the
     println, the program might display the stored output at unexpected times or
     even terminate without displaying anything.*/
    
    
    //The following program converts a time of day to minutes:
    System.out.print("Number of minutes since midnight: ");
    System.out.println(hour * 60 + minute);
    /*Operators are symbols that represent simple computations. For example, the
     addition operator is +, subtraction is -, multiplication is *, and division is /.*/
    
    /*Addition, subtraction, and multiplication all do what you expect, but you
     might be surprised by division. For example, the following fragment tries to
     compute the fraction of an hour that has elapsed:*/
    
    System.out.print("Fraction of the hour that has passed: ");
    System.out.println(minute / 60);
    
    /*The output is:  Fraction of the hour that has passed: 0
     This result often confuses people. The value of minute is 59, and 59 divided
     by 60 should be 0.98333, not 0. The problem is that Java performs \integer
     division" when the operands are integers. By design, integer division always
     rounds toward zero, even in cases like this one where the next integer is close.
     */
    
    //As an alternative, we can calculate a percentage rather than a fraction:
    System.out.print("Percent of the hour that has passed: ");
    System.out.println(minute * 100 / 60 + "%");
    
    double pi;
    pi = 3.14159;
    
    /*Java performs \ oating-point division" when one or more operands are double
     values. So we can solve the problem we saw in the previous section:*/
    double minute2 = 59.0;
    System.out.print("Fraction of the hour that has passed: ");
    System.out.println(minute / 60.0);
    
    /*The + operator works with strings, but it might not do what you expect. For
     strings, the + operator performs concatenation, which means joining end-to-
     end. So "Hello, " + "World!" yields the string "Hello, World!".*/
    
    
    //Since addition is de ned for both numbers and strings, Java performs auto-matic conversions you may not expect:
    System.out.println(1 + 2 + "Hello");
    // the output is 3Hello
    System.out.println("Hello" + 1 + 2);
    // the output is Hello12
    
    /*Java executes these operations from left to right. In the  rst line, 1 + 2 is
     3, and 3 + "Hello" is "3Hello". But in the second line, "Hello" + 1 is
     "Hello1", and "Hello1" + 2 is "Hello12".*/
    
    /*Don't work too hard to remember the order of operations, especially for other
     operators. If it's not obvious by looking at the expression, use parentheses to
     make it clear.*/
    
    //Vocabulary
    
    /*variable: A named storage location for values. All variables have a type,
     which is declared when the variable is created.
     
     value: A number, string, or other data that can be stored in a variable. Every
     value belongs to a type (for example, int or String).
     
     declaration: A statement that creates a new variable and speci es its type.
     
     type: Mathematically speaking, a set of values. The type of a variable deter-
     mines which values it can have.
     
     syntax: The structure of a program; the arrangement of the words and sym-
     bols it contains.
     
     keyword: A reserved word used by the compiler to analyze programs. You
     cannot use keywords (like public, class, and void) as variable names.
     
     assignment: A statement that gives a value to a variable.
     
     initialize: To assign a variable for the  rst time.
     
     state: The variables in a program and their current values.
     
     state diagram: A graphical representation of the state of a program at a
     point in time.
     
     operator: A symbol that represents a computation like addition, multiplica-
     tion, or string concatenation.
     
     operand: One of the values on which an operator operates. Most operators
     in Java require two operands.
     
     expression: A combination of variables, operators, and values that repre-
     sents a single value. Expressions also have types, as determined by their
     operators and operands.
     
     oating-point: A data type that represents numbers with an integer part
     and a fractional part. In Java, the default  oating-point type is double.
     
     rounding error: The di erence between the number we want to represent
     and the nearest  oating-point number.
     
     concatenate: To join two values, often strings, end-to-end.
     
     order of operations: The rules that determine in what order operations are
     evaluated.
     
     composition: The ability to combine simple expressions and statements into
     compound expressions and statements.
     
     compile-time error: An error in the source code that makes it impossible
     to compile. Also called a \syntax error".
     
     parse: To analyze the structure of a program; what the compiler does  rst.
     
     run-time error: An error in a program that makes it impossible to run to
     completion. Also called an \exception".
     
     logic error: An error in a program that makes it do something other than
     what the programmer intended.*/
  }
}