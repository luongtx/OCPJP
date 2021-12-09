package java_io_n_nio_2.file_n_path;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ToRealPathTest {
	public static void main(String[] args) throws IOException {
		Path file = Paths.get("/mnt/storage/Project/OCPJP/src/../stud.ser");
		System.out.println(file.toRealPath());
		System.out.println(file.toAbsolutePath());
	}
}
