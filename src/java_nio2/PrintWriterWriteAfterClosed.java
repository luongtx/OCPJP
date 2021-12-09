package java_nio2;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterWriteAfterClosed {
	public static void main(String[] args) throws IOException {
		try (PrintWriter pw = new PrintWriter(new FileWriter("F:/test1.txt"))) {
			pw.close();
			pw.write(10);
		}
	}
}
