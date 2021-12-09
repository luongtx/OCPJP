package java_nio2;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFilesWithDifferentFormatTest {
	public static void main(String[] args) throws IOException {
		Stream<Path> paths = Files.walk(Paths.get("F:/process"));
		paths.filter(path -> !Files.isDirectory(path)).forEach(path -> {
			try {
				Files.readAllLines(path).stream().forEach(System.out::println);
			} catch (IOException e) {
				System.out.println("FAILED");
			}
		});
	}
}
