import java.io.Console;

//package java_io_n_nio_2.fundamentals.console;

public class ConsoleTest3 {
	public static void main(String[] args) {
		Console console = System.console();
		if (console != null) {
			console.format("%d %x", 10, 10, 10);
		}
	}
}
