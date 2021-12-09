package trash;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCopy {
	public static void main(String[] args) throws IOException {
		Path src = Paths.get("F:/A/B/C/Book.java");
		Path tgt = Paths.get("F:/A/B");
		Files.copy(src, tgt);
	}
}
