package java_nio2.file_n_path;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathToAbsolutePathTest {
	public static void main(String[] args) throws IOException {
		Path file = Paths.get("Book.java");
		System.out.println(file.toAbsolutePath());
//		System.out.println(file.toRealPath(LinkOption.NOFOLLOW_LINKS));
	}
	/*
	 * toAbsolutePath() method doesn't care if given path elements are physically
	 * available or not. It just returns the absolute path.
	 */
}
