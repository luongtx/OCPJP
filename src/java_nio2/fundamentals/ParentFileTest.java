package java_io_n_nio_2.fundamentals;

import java.io.File;

public class ParentFileTest {
	public static void main(String[] args) {
		File dir = new File("F:" + File.separator + "A" + File.separator + "B");
		System.out.println(dir.getParentFile().getParent());
	}
}
