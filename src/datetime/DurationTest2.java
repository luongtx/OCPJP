package datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DurationTest2 {
	public static void main(String[] args) {
        LocalDate d1 = LocalDate.now();
        LocalDateTime d2 = LocalDateTime.now();
        System.out.println(Duration.between(d1, d2));
	}
}
