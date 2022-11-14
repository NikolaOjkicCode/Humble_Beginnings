/*
The point of this exercise is to (1) use some of the arithmetic operators,
and (2) start thinking about compound entities (like time of day) that are represented with multiple values.

1. Create a new program called Exercise 2_2.

2. Create variables named
hour, minute, and second. Assign values that are roughly the current
time. Use a 24-hour clock so that at 2pm the value of hour is 14.

3. Make the program calculate and display the number of seconds since
midnight.

4. Calculate and display the number of seconds remaining in the day.

5. Calculate and display the percentage of the day that has passed. You
might run into problems when computing percentages with integers, so
consider using 
floating-point.

6. Change the values of hour, minute, and second to reflect the current
time. Then write code to compute the elapsed time since you started
working on this exercise.

Hint: You might want to use additional variables to hold values during the computation. 
Variables that are used in a computation but never displayed are sometimes called intermediate" or temporary" variables.

*/
public class Exercise2_2{
  public static void main(String[] arg){
    int hour,minute,seconds,sinceMidnight,remainInDay,elapsedTime,startingTime,endingTime;
    double percentage;
    
    hour = 17;
    minute = 35;
    seconds = 20;
        
    sinceMidnight = (hour * 60 * 60) + (minute*60) + (seconds);
    remainInDay = (24 * 60 * 60) - sinceMidnight;
    percentage = ((double)sinceMidnight / (double)(24 * 60 * 60)) * (double)100;
      
    System.out.println("Number of seconds since midnight: " + sinceMidnight);
    System.out.println("Number of seconds remaining in the day: " + remainInDay);
    System.out.println("Percentage of the day that has passed: " + percentage + "% !");
    
    
    startingTime = (hour * 60 * 60) + (minute*60) + (seconds);
      
    hour = 17;
    minute = 41;
    seconds = 10;
    
    endingTime = (hour * 60 * 60) + (minute*60) + (seconds);
    
    elapsedTime =  endingTime - startingTime;
    
    System.out.println("Elapsed time since i started working on this exercise: " + elapsedTime + " seconds!");
    
  }
}