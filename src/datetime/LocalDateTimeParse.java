package datetime;

import java.time.LocalDateTime;

public class LocalDateTimeParse {
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.parse("2018-03-16t10:15:30.22");
		LocalDateTime dt2 = LocalDateTime.parse("2018-03-16t10:15:30.2200000");
//		LocalDateTime dt2 = LocalDateTime.parse("2018-03-16t10:15:30.99999999");
//		System.out.println(dt.toLocalDate() + " " + dt.toLocalTime());
		System.out.println(dt + " " + dt2);
	}
}
