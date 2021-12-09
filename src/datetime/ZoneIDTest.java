package datetime;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIDTest {
	public static void main(String[] args) {
		Set<String> zones = ZoneId.getAvailableZoneIds();
		System.out.println("Number of available time zones is: " + zones.size());
		zones.forEach(System.out::println);
		ZoneId AsiaKolkataZoneId = ZoneId.of("Asia/Kolkata");
	}
}
