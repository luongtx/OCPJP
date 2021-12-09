//package java_io_n_nio_2.fundamentals.console;

import java.io.Console;

public class Test {
	public static void main(String[] args) {
		Console console = System.console();
		// x: hexa
		// o: octa
		// 1: argument number
		console.printf("%d %1$x %1$o %1$b", 16, 20);

		System.out.printf("%2$d + %1$d", 10, 20, 30);
	}
}
