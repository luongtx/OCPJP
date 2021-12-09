package exceptions;

import java.io.PrintWriter;

public class TryWithResource4Test {
	public static void main(String[] args) {
		try(PrintWriter writer = new PrintWriter(System.out)) {
            writer.println("Hello");
        } catch(Exception ex) {
            writer.close();
        }
	}
}
