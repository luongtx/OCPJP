package java_io_n_nio_2.file_n_path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class PathTest {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("/mnt/storage/Project/OCPJP/");
		System.out.println(Files.isDirectory(path));
		System.out.println(path.toFile().isDirectory());
		System.out.println(Files.getAttribute(path, "isDirectory"));
		System.out.println(Files.getAttribute(path, "creationTime"));
		System.out.println(Files.readAttributes(path, "*").get("creationTime"));
		System.out.println(Files.readAttributes(path, BasicFileAttributes.class).creationTime());
	}
}
