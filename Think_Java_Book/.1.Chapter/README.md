# The way of the program

Java programs are made up of class and method defnitions, and methods are
made up of statements. A statement is a line of code that performs a basic
operation.

A class is a collection of methods.The name of the class has to match the name of the  file it is in,
so this class has to be in a  le named Hello.java.

```java
  public static void main(String[] arg){
  /*A method is a named sequence of statements. This program defines one
     method named main, main is special: when the program runs, it starts at
     the  first statement in main and ends when it finishes the last statement.*/
    
    //Generate a simple output
    System.out.println("Hello World!");      
    /* In the hello world program, this line is a print statement that
     displays a message on the screen */
    
    System.out.println("How are you?");      
    /*Phrases that appear in quotation marks are called strings, because they con-
     tain a sequence of characters" strung together. Characters can be letters,
     numbers, punctuation marks, symbols, spaces, tabs, etc.*/
    
    System.out.print("Goodbye");             
    /*System.out.println appends a special character, called a newline, that
     moves to the beginning of the next line. If you don't want a newline at the
     end, you can use print instead of println*/
    System.out.print(",and farewell !");
    
    
    System.out.print("\nHello \nWord!\n");     
    /*It is possible to display multiple lines of output in just one line of code. You
     just have to tell Java where to put the line breaks.*/
    /*The \n is an escape sequence, which is a sequence of characters that rep-
     resents a special character. The backslash allows you to \escape" the string's
     literal interpretation. Notice there is no space between \n and How. If you add
     a space there, there will be a space at the beginning of the second line.*/
    
    
    
    System.out.print("She said \"Hello!\" to me"); 
    /*Another common use of escape sequences is to have quotation marks inside
     of strings. Since double quotes indicate the beginning and end of strings, you
     need to escape them with a backslash.*/
}
```

\n - newline

\t - tab

\" - double quote

\\ - backslash
