public class Time{
  public static void main(String[] args){
    int hour, minute, seconds;
    int previus;
    double per;
    
    hour = 19;
    minute = 1;
    seconds = 35;
    
    System.out.println("The number of seconds since midnight is : " + (hour * 60 * 60) + (minute * 60) + seconds);
    System.out.println("The number of seconds remainig in a is: " + ((24 * 60 * 60) - ((hour * 60 * 60) + (minute * 60) + seconds)));
    System.out.println("The percentage of the day that has passed.: " + ((per = (hour * 60 * 60) + (minute * 60) + seconds) / (24 * 60 * 60) * 100) + "%");
    
    previus = (hour * 60 * 60) + (minute * 60) + seconds;
    hour = 19;
    minute = 8;
    seconds = 35;
    
    System.out.println("The number of seconds that took me to complete this task : " + (((hour * 60 * 60) + (minute * 60) + seconds) - previus)) ;
  }
}