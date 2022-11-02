/*Made in DrJava!*/

/*In DrJava you can indent the
 code by selecting all text (Ctrl+A) and pressing the Tab key.*/

/*The symbol "\" is the same as a backslash symbol*/

public class Hello{     
  /*Java programs are made up of class and method defnitions, and methods are
   made up of statements. A statement is a line of code that performs a basic
   operation.*/
  /*A class is a collection of methods.The name of the class has to match the name of the  le it is in,
   so this class has to be in a  le named Hello.java.*/
  
  
  
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
    /* 
     \n - newline
     \t - tab
     \" - double quote
     \\ - backslash
     */
    
    
    //Vocabulary
    
    /*problem solving: The process of formulating a problem,  nding a solution,
     and expressing the solution.
     
     program: A sequence of instructions that speci es how to perform tasks on
     a computer.
     
     programming: The application of problem solving to creating executable
     computer programs.
     
     computer science: The scienti c and practical approach to computation
     and its applications.
     
     algorithm: A procedure or formula for solving a problem, with or without a
     computer.
     
     bug: An error in a program.
     
     debugging: The process of  nding and removing errors.
     
     high-level language: A programming language that is designed to be easy
     for humans to read and write.
     
     low-level language: A programming language that is designed to be easy
     for a computer to run. Also called \machine language" or \assembly
     language".
     
     portable: The ability of a program to run on more than one kind of computer.
     
     interpret: To run a program in a high-level language by translating it one
     line at a time and immediately executing the corresponding instructions.
     
     compile: To translate a program in a high-level language into a low-level
     language, all at once, in preparation for later execution.
     
     source code: A program in a high-level language, before being compiled.
     
     object code: The output of the compiler, after translating the program.
     
     executable: Another name for object code that is ready to run on speci c
     hardware.
     
     byte code: A special kind of object code used for Java programs. Byte code
     is similar to a low-level language, but it is portable like a high-level
     language.
     
     statement: Part of a program that speci es one step of an algorithm.
     print statement: A statement that causes output to be displayed on the
     screen.
     
     method: A named sequence of statements.
     class: For now, a collection of related methods. (We will see later that there
     is more to it.)
     
     comment: A part of a program that contains information about the program
     but has no e ect when the program runs.
     
     string: A sequence of characters; the primary data type for text.
     12 Chapter 1 The way of the program
     
     newline: A special character signifying the end of a line of text. Also known
     as line ending, end of line (EOL), or line break.
     
     escape sequence: A sequence of code that represents a special character
     when used inside a string.*/
    
  }
}