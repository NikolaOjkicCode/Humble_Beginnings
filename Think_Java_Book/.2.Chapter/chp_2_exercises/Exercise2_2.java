
public class Exercise2_2 {
	public static void main(String[] arg) {
		
		int hour, minute, seconds;
		double timeOfDay, totalTime, newTimeOfDay;
		
		hour = 7;
		minute = 3;
		seconds = 30;
		
		System.out.println("The number of seconds since midnight: " + ((hour * 60 * 60) + (minute * 60) + seconds));
		System.out.println("The number of seconds left in a day : " + ((24*60*60) - ((hour * 60 * 60) + (minute * 60) + seconds)));
		
		//Percentage = (Value/Total Value)×100
		
		timeOfDay = ((hour * 60 * 60) + (minute * 60) + seconds);
		totalTime = 24.0*60.0*60.0;
		System.out.println("Percentage of the day that has passed : " + ((timeOfDay/totalTime) * 100));
		
		hour = 7;
		minute = 15;
		seconds = 30;
		
		newTimeOfDay = ((hour * 60 * 60) + (minute * 60) + seconds);
		System.out.println("Elapsed time since i starte working on this exercise : " + (newTimeOfDay - timeOfDay) + " seonds!");
	}
}
