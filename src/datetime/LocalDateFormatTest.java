package datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateFormatTest {
	public static void main(String[] args) {
		DateTimeFormatter dateFormat = DateTimeFormatter.ISO_DATE;
		 // DEF
		LocalDate dateOfBirth = LocalDate.of(2015, Month.FEBRUARY, 31);
		System.out.println(dateFormat.format(dateOfBirth));
		 
	}
}
