package exceptions;
import java.io.PrintWriter;

public class TryWithLateInitializeResource {
	public static void main(String[] args) {
		try(PrintWriter writer;) {
            writer = new PrintWriter(System.out);
            writer.println("HELLO");
        }
	}
}
