package java_nio2.file_n_path;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IsSymbolicLink {
	public static void main(String[] args) throws Exception {
		Path src = Paths.get("F:", "TEMP", "msg");

		Path tgt = Paths.get("F:", "TEMP", "Parent", "copy");
		Files.copy(src, tgt);

		System.out.println(Files.isSymbolicLink(src) + ":" + Files.isSymbolicLink(tgt));
	}
}
