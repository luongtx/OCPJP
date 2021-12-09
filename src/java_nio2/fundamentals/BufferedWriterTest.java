package java_io_n_nio_2.fundamentals;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {
	public static void main(String[] args) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\test.txt"))) {
			bw.close();
			bw.newLine();
		} catch (IOException e) {
			System.out.println("IOException");
		}
	}
}
