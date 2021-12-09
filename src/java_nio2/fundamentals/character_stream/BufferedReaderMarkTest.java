package java_nio2.fundamentals.character_stream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class BufferedReaderMarkTest {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("F:/version.txt")))) {
			if (br.markSupported()) {
				System.out.println((char) br.read());
				br.mark(2);
				System.out.println((char) br.read());
				br.reset();
				System.out.println((char) br.read());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
