package datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZoneOffSetTest {
	public static void main(String[] args) {
		ZoneId myZone = ZoneId.of("Asia/Ho_Chi_Minh");
		LocalDateTime dateTime = LocalDateTime.now();
		ZonedDateTime zonedDateTime = dateTime.atZone(myZone);
		ZoneOffset zoneOffset = zonedDateTime.getOffset();
		System.out.println(zoneOffset);
	}
}
