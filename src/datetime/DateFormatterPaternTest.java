package datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateFormatterPaternTest {
	public static void main(String[] args) {
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("M", Locale.US);
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("m", Locale.US);
		DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("GGGG", Locale.US);
		System.out.println(formatter1.format(LocalDateTime.now()));
		System.out.println(formatter2.format(LocalDateTime.now()));
		System.out.println(formatter3.format(LocalDateTime.now()));
	}
}
