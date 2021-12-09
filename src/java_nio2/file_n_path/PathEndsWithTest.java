package java_nio2.file_n_path;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

public class PathEndsWithTest {
	public static void main(String[] args) throws IOException {
		Path root = Paths.get("F:");
		BiPredicate<Path, BasicFileAttributes> predicate = (p, a) -> p.endsWith("");
//		BiPredicate<Path, BasicFileAttributes> predicate = (p, a) -> p.endsWith(null);
		try (Stream<Path> paths = Files.find(root, 2, predicate)) {
			paths.forEach(System.out::println);
		}
	}
}
