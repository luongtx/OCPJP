package datetime;

import java.time.LocalDate;
import java.time.Period;

public class LocalDateOperationTest {
	public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2019, 1, 2);
        date1.minus(Period.ofDays(1));
        LocalDate date2 = LocalDate.of(2018, 12, 31);
        date2.plus(Period.ofDays(1));
        System.out.println(date1.equals(date2) + ":" + date1.isEqual(date2));
	}
}
