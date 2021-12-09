package exceptions;
import java.io.PrintWriter;

public class TryWithNulResource {
	public static void main(String[] args) {
		try (PrintWriter writer = null) {
			System.out.println("HELLO");
		}
	}
}
