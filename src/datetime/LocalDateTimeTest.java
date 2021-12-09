package datetime;

import java.time.LocalDateTime;

public class LocalDateTimeTest {
	public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.parse("2018-03-16t10:15:30.22");
        System.out.println(dt.toLocalDate() + dt.toLocalTime());
	}
}
