package datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodExample {
	public static void main(String[] args) {
		LocalDate manufacturingDate = LocalDate.of(2016, Month.JANUARY, 1);
		LocalDate expiryDate = LocalDate.of(2018, Month.JULY, 18);
		Period expiry = Period.between(manufacturingDate, expiryDate);
		System.out.printf("Medicine will expire in: %d years, %d months, and %d days (%s)\n",
		expiry.getYears(), expiry.getMonths(), expiry.getDays(), expiry);
	}
}
