package datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeTest {
	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		LocalTime currentTime = LocalTime.now();
		ZoneId myZone = ZoneId.systemDefault();
		ZonedDateTime zonedDateTime = ZonedDateTime.of(currentDate, currentTime, myZone);
		System.out.println(zonedDateTime);
	}
}
