package main;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class WorldClockApplication {
	
	 private final static String purple = "\u001B[35m";
	 private final static String reset = "\u001B[0m";
	
	// In this exercise, we are going to be using ZonedDateTime from the java.time package.  Like LocalDate and LocalDateTime,
	// starting from Java 8 onwards, we can easily add in timezones to our date to get the correct time information
	// from different countries.  If you chose your own countries, you may need to do a quick google search on your country
	// zone id.  The format is usually <Continent>/<City>
	
	private final static ZoneId BRISBANE = ZoneId.of("Australia/Brisbane");
	private final static ZoneId DUBLIN = ZoneId.of("Europe/Dublin");
	private final static ZoneId TORONTO = ZoneId.of("America/Toronto");
	private final static ZoneId CHICAGO = ZoneId.of("America/Chicago");
	private final static ZoneId EDMONTON = ZoneId.of("America/Edmonton");
	private final static ZoneId LOS_ANGELES = ZoneId.of("America/Los_Angeles");
	private final static ZoneId HONOLULU = ZoneId.of("Pacific/Honolulu");

	public static void main(String[] args) {
		
		// first we need to capture what the time is at this exact moment...
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		ZonedDateTime torontoZonedDateTime = zonedDateTime.withZoneSameInstant(TORONTO);
		ZonedDateTime brisbaneZonedDateTime = zonedDateTime.withZoneSameInstant(BRISBANE);
		ZonedDateTime dublinZonedDateTime = zonedDateTime.withZoneSameInstant(DUBLIN);
		ZonedDateTime chicagoZonedDateTime = zonedDateTime.withZoneSameInstant(CHICAGO);
		ZonedDateTime edmontonZonedDateTime = zonedDateTime.withZoneSameInstant(EDMONTON);
		ZonedDateTime losAngelesZonedDateTime = zonedDateTime.withZoneSameInstant(LOS_ANGELES);
		ZonedDateTime honoluluZonedDateTime = zonedDateTime.withZoneSameInstant(HONOLULU);

		
		// from here you will need to create three system outs to print out the times and dates
		
		// ZonedDateTime has a method called withZoneSameInstant(<ZoneId>) which gives you the exact date time in the
		// time zone you put in using tbe zone id.  Try putting in zonedDateTime.withZoneSameInstant(BRISBANE)...
		
		// after we grabbed the time in our country, we need to format the output using our DateTimeFormatter...
				
		System.out.println("Brisbane, Australia -> " + brisbaneZonedDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a")));
		System.out.println("Dublin, Ireland -> " + dublinZonedDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a")));
		System.out.println(purple + "My Location (" + ZoneId.systemDefault() + ") -> " + zonedDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a")) + reset);
		System.out.println("Toronto, Canada -> " + torontoZonedDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a")));
		System.out.println("Chicago, USA -> " + chicagoZonedDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a")));
		System.out.println("Edmonton, Canada -> " + edmontonZonedDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a")));
		System.out.println("Los Angeles, USA -> " + losAngelesZonedDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a")));
		System.out.println("Honolulu, USA -> " + honoluluZonedDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a")));

	}

}
