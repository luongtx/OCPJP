package datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DaylifeSavingTimeTest {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2018, 11, 4);
		/*
		 * Daylight saving time 2018 in United States (US) ends at 4-Nov-2018 2:00 AM.
		 */
//		LocalTime time = LocalTime.of(1, 59, 59);
		LocalTime time = LocalTime.of(1, 00, 00);
		ZonedDateTime dt = ZonedDateTime.of(date, time, ZoneId.of("America/New_York"));
//		dt = dt.plusSeconds(1);
		dt = dt.plusHours(1);
		System.out.println(dt.getHour() + ":" + dt.getMinute() + ":" + dt.getSecond());
	}
}
