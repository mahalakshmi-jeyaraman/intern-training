package src.com.trials;
import java.time.*;
import java.util.Scanner;
public class LorryArrivalTime {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//get travel speed info in kilometer/hour
		System.out.println("ENTER THE TRAVELLING SPEED :");
		int speed = scan.nextInt();
		System.out.println("the travellling speed is : "+speed+" km/ph");
		
		//get travel distance info in kilometer
		System.out.println("ENTER THE TRAVELLING DISTANCE :");
		int distance = scan.nextInt();
		System.out.println("the travelling distance is : "+distance+" kms");
		
		//get travel date info
		System.out.println("ENTER THE TRAVELLING YEAR :");
		int year = scan.nextInt();
		System.out.println("ENTER THE TRAVELLING MONTH :");
		int month = scan.nextInt();
		System.out.println("ENTER THE TRAVELLING DATE :");
		int date = scan.nextInt();
		LocalDate travelDate = LocalDate.of(year, month, date);
		System.out.println("the travel date starts at : "+travelDate);
		
		//get travel time info 
		System.out.println("ENTER THE TRAVELLING HOUR :");
		int hour = scan.nextInt();
		System.out.println("ENTER THE TRAVELLING MINUTE :");
		int minute = scan.nextInt();
		LocalTime travelTime = LocalTime.of(hour, minute);
		System.out.println("the travel time starts at : "+travelTime);
		
		//calculate total time taken in hours
		double totalTimeHours = (double)distance/speed;
		System.out.println("the total time taken in hours : "+totalTimeHours);
		
		//calculate total time taken in minutes
		long totaltimeMinutes = Math.round(totalTimeHours*60);
		System.out.println("the total time taken in minutes : "+totaltimeMinutes);
		
		//calculate remaining total time in hours
		long remainingTotalTimeHours = (long) (totalTimeHours/60);
		System.out.println("the remaining total time in hours : "+remainingTotalTimeHours);
		
		//calculate remaining total time in minutes
		long remainingTotalTimeMinutes = totaltimeMinutes%60;
		System.out.println("the remaining total time in minutes : "+remainingTotalTimeMinutes);
		
		LocalDateTime arrivalDateTime = LocalDateTime.of(travelDate, travelTime)
										.plusHours(remainingTotalTimeHours)
										.plusMinutes(remainingTotalTimeMinutes);
		
		LocalDate arrivalDate = arrivalDateTime.toLocalDate();
		LocalTime arrivalTime = arrivalDateTime.toLocalTime();
		
		while(holidayConstraints(arrivalDate) || 
				arrivalTime.isBefore(LocalTime.of(8, 0)) ||
				arrivalTime.isAfter(LocalTime.of(16, 0)))
		{
			arrivalDateTime = arrivalDateTime.plusDays(1).withHour(8).withMinute(0);
			arrivalDate = arrivalDateTime.toLocalDate();
			arrivalTime = arrivalDateTime.toLocalTime();
			
			if(arrivalTime.plusHours(8).isAfter(LocalTime.of(16, 0))) {
				arrivalDateTime = arrivalDateTime.plusDays(1).withHour(8).withMinute(0);
				arrivalDate = arrivalDateTime.toLocalDate();
				arrivalTime = arrivalDateTime.toLocalTime();
			}
		}
		
		System.out.println("arrival date : " + arrivalDate);
		System.out.println("arrival time : " + arrivalTime);
		
		scan.close();
		
		
	}
	private static boolean holidayConstraints(LocalDate date) {
		
		if( (date.getDayOfWeek() == DayOfWeek.SUNDAY) ||
		    (date.getDayOfMonth() == 1 && date.getMonth() == Month.JANUARY) ||	
		    (date.getDayOfMonth() == 26 && date.getMonth() == Month.JANUARY)|| 
		    (date.getDayOfMonth() == 15 && date.getMonth() == Month.AUGUST) || 
		    (date.getDayOfWeek() == DayOfWeek.SATURDAY && date.getDayOfMonth() > 7 && date.getDayOfMonth()<15) ||
		    (date.getMonth()==Month.FEBRUARY && date.getDayOfMonth()==29 && !date.isLeapYear()))
		{return true;}
		
		return false;
	}
	 
	

}
