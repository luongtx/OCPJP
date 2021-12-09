package java_nio2.file_n_path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathToFile {
	public static void main(String[] args) {
		Path path = Paths.get("F:/A/B");
		System.out.println(path.toFile().isDirectory());
	}
}
