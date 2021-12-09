package java_nio2;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCopySrcTargetTest {
	public static void main(String[] args) throws IOException {
		Path src = Paths.get("F:/A/B/C/Book.java");
		Path tgt = Paths.get("F:/A/X/");
		Files.copy(src, tgt);
	}

	/*
	 * Files.copy(src, tgt) copies the farthest element. 'Book.java' can't be copied
	 * to 'B' as it is a directory and it is not allowed to have file and directory
	 * of same name to be present at same location. Hence,
	 * java.nio.file.FileAlreadyExistsException is thrown at runtime.
	 */
}
