package java_io_n_nio_2.fundamentals;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamTest {
	public static void main(String[] args) throws FileNotFoundException {
        System.setOut(new PrintStream("error1.log"));
        try {
            System.out.println("ONE");
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            System.err.println("TWO");
        }
	}
}
