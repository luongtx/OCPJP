package datetime;

import java.time.Duration;
import java.time.LocalDate;

public class DatePlusDurationTest {
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2019, 1, 1);
		Duration d = Duration.ofDays(1);
		System.out.println(d);
		System.out.println(date1.plus(d));
	}
}
