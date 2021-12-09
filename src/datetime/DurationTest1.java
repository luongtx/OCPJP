package datetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest1 {
	public static void main(String[] args) {

		/*
		 * If the Temporal objects are of different types as in this case, calculation
		 * is based on 1st argument and 2nd argument is converted to the type of 1st
		 * argument.
		 */
		LocalTime t1 = LocalTime.now();
		LocalDateTime t2 = LocalDateTime.now();
		System.out.println(Duration.between(t2, t1));
	}
}
