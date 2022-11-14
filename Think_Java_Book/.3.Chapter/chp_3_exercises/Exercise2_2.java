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