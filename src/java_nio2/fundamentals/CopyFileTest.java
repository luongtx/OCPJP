package java_io_n_nio_2.fundamentals;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileTest {
	public static void main(String[] args) throws IOException {
		try (FileInputStream fis = new FileInputStream("F:\\orig.png");
				FileOutputStream fos = new FileOutputStream("F:\\copy.png")) {
			int res;
			byte[] arr = new byte[500000]; // Line 10
			while ((res = fis.read(arr)) != -1) { // Line 11
				fos.write(arr); // Line 12
			}
		}
	}
}
