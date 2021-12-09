package java_io_n_nio_2.fundamentals.console;

import java.io.IOException;

public class Read {
	public static void main(String[] args) {
		System.out.print("Type a character: ");
		int val = 0;
		try {
			// the return type of read is int, but it returns a byte value!
			val = System.in.read();
		} catch (IOException ioe) {
			System.err.println("Cannot read input " + ioe);
			System.exit(-1);
		}
		System.out.println("You typed: " + val);
	}
}
