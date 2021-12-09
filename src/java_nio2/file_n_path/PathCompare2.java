package java_io_n_nio_2.file_n_path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathCompare2 {
	public static void main(String[] args) throws IOException {
		Path path1 = Paths.get("temp/file.docx");
		Path path2 = Paths.get("/mnt/storage/Project/OCPJP/temp/file.docx");
		System.out.println("Files.isSameFile(path1, path2) is: " + Files.isSameFile(path1, path2));
	}
}
