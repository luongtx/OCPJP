package java_nio2.file_n_path;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathForEach {
	public static void main(String[] args) {

		Path path = Paths.get("F:/A/B/C/Book.java");
//		path.forEach(System.out::println);
//		for (Path p : path) {
//			System.out.println(p);
//		}

//		Iterator<Path> iter = path.iterator();
//		while (iter.hasNext()) {
//			System.out.println(iter.next());
//		}

		for (int i = 0; i < path.getNameCount(); i++) {
			System.out.println(path.getName(i));
		}
	}
}
