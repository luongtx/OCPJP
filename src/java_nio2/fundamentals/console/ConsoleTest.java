//package java_nio2.fundamentals.console;
//package java_io_n_nio_2;

import java.io.Console;

public class ConsoleTest {
	public static void main(String[] args) {
		Console console = System.console();
		if (console != null) {
			console.format("%d %<x", 10);
		}
	}
}
