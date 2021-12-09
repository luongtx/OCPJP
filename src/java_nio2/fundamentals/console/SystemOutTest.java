package java_io_n_nio_2.fundamentals.console;

import java.io.IOException;
import java.io.PrintStream;

public class SystemOutTest {
	public static void main(String[] args) throws IOException {
		System.setOut(new PrintStream("D:\\err.log"));
		try {
			System.out.println("ONE");
			System.out.println(1 / 0);
		} catch (ArithmeticException e) {
			System.err.println("TWO");
		}
	}
}
