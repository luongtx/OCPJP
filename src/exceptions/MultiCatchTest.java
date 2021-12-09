package exceptions;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultiCatchTest {
	public static void fooThrower() throws FileNotFoundException {
		throw new FileNotFoundException();
	}

	public static void barThrower() throws SQLException {
		throw new SQLException();
	}

	public static void main(String[] args) {
		try {
			fooThrower();
			barThrower();
		} catch (FileNotFoundException | SQLException multie) {
			System.out.println(multie);
		}
	}
}
