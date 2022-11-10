# Variables and operators

```java

public class VariablesAndOperators{
  public static void main(String[] arg){
    
    String firstName;  
    String lastName;
    
   }
}
```
     This example declares two variables with type String and two with type
     int. When a variable name contains more than one word, like firstName,
     it is conventional to capitalize the  rst letter of each word except the  rst.
     Variable names are case-sensitive, so firstName is not the same as firstname
     or FirstName.

```java
public class VariablesAndOperators{
  public static void main(String[] arg){
     int hour, minute;
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
  
   }
}
```
