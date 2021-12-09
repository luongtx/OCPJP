//package java_io_n_nio_2.fundamentals.console;

import java.io.Console;

public class ConsoleTest2 {
	public static void main(String[] args) {
		Console console = System.console();
		if (console != null) {
			console.format("%d %x", 10);
		}
	}
}
