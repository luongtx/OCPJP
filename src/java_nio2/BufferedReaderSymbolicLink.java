package java_nio2;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BufferedReaderSymbolicLink {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("F:", "TEMP", "msg");

		try (BufferedReader reader = Files.newBufferedReader(path)) {
			String str = null;
			while ((str = reader.readLine()) != null) {
				System.out.println(str);
			}
		}
	}
}
