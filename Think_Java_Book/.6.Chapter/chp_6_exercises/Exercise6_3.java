/*Many computations can be expressed more concisely using the multadd" operation, which takes three operands and computes a * b + c. 
 * Some processors even provide a hardware implementation of this operation for floating-point numbers.

1. Create a new program called Exercise6_3.java.

2. Write a method called multadd that takes three doubles as parameters
and that returns a * b + c.

3. Write a main method that tests multadd by invoking it with a few simple
parameters, like 1.0, 2.0, 3.0.

4.Also in main, use multadd to compute the following values:

 0.5, cos(pi / 4), sin(pi / 2)
 log10 + multadd(2, log2, log5)

5.Write a method called expSum that takes a double as a parameter and
that uses multadd to calculate:

  x , exp (-x), square(1-exo(-x))

Hint: The method for raising e to a power is Math.exp.*/

public class Exercise6_3{
  
  public static double multadd(double a, double b, double c){
    return a * b + c;
  }
  
  public static double expSum(double x){
    return multadd(x, Math.exp(-x), Math.sqrt(1-Math.exp(-x)));
  }
  
  public static void main(String[] arg){
    double a,b,c,x;
    
    a = 1.0;
    b = 2.0;
    c = 3.0;
    x = 5.0;
    
    System.out.println(multadd(a,b,c));
    System.out.println(multadd(0.5,Math.cos(Math.PI/4),Math.sin(Math.PI/2)));
    System.out.println(Math.log(10) + multadd(2, Math.log(2),Math.log(5)));
    System.out.println(expSum(x));
    
  }
}