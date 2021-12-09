package java_nio2.file_n_path;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSizeTest {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("F:/A/B/Book.java");
		long size1 = Files.size(path);

		File file = new File("F:/A/B/Book.java");
		long size2 = file.length();

		System.out.println(size1 == size2);
	}
}
