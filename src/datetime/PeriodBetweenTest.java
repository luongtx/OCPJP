package datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodBetweenTest {
	public static void main(String[] args) {
		LocalDate babyDOB = LocalDate.of(2015, Month.FEBRUARY, 20);
		LocalDate now = LocalDate.of(2016, Month.APRIL, 10);
		/*
		 * The end before start so return negative
		 */
		System.out.println(Period.between(now, babyDOB).getYears()); // PERIOD_CALC
	}
}
