package java_nio2;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterWriteAfterClosed {
	public static void main(String[] args) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("F:/test.txt"))) {
			bw.close();
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace();
//			System.out.println("IOException");
		}
	}
}
