package java_nio2.file_n_path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FilesWriteTest {
	public static void main(String[] args) throws IOException {
		String a = "abc";
		Files.write(Paths.get("note"), a.getBytes(), StandardOpenOption.APPEND);
	}
}
