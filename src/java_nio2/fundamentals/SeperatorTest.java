package java_io_n_nio_2.fundamentals;

import java.io.File;

public class SeperatorTest {
	public static void main(String[] args) {
		File dir = new File("/home/luongtx" + System.getProperty("file.separator") + "A");
//		File dir = new File("/home/luongtx" + System.getProperty("path.separator") + "A");
		System.out.println(dir.mkdir());
		System.out.println(dir.delete());
	}
}
