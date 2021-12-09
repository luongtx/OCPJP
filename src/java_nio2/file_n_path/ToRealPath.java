package java_nio2.file_n_path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ToRealPath {
	public static void main(String[] args) {
		Path file = Paths.get("F:\\A\\.\\B\\C\\D\\..\\Book.java");
		System.out.println(file.toRealPath());
	}
}
