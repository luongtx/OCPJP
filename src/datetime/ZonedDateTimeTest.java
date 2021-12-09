package datetime;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeTest {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2019, 1, 1);
		LocalTime time = LocalTime.of(0, 0);
		ZoneId india = ZoneId.of("Asia/Kolkata");
		ZonedDateTime zIndia = ZonedDateTime.of(date, time, india);

		ZoneId us = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zUS = zIndia.withZoneSameLocal(us);

		System.out.println(Duration.between(zIndia, zUS)); // Line 15
	}
}
