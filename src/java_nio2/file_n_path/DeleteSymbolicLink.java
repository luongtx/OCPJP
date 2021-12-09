package java_nio2.file_n_path;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteSymbolicLink {
	public static void main(String[] args) throws Exception {
		Path src = Paths.get("C:", "TEMP", "msg");
		Files.delete(src);// delete just symbolic link file not the file itself
	}
}
