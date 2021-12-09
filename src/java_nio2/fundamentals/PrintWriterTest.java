package java_io_n_nio_2.fundamentals;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest {
	public static void main(String[] args) {
		try (PrintWriter bw = new PrintWriter("F:\\test.txt")) {
			bw.close();
			bw.close();
			bw.write(1);
		} catch (IOException e) {
			System.out.println("IOException");
		}
	}
}
