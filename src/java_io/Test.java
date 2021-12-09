package java_io;

import java.io.File;

public class Test {
	public static void main(String[] args) {
		File dir = new File("F:" + File.separator + "A" + File.separator + "B");
		System.out.println(dir.getParentFile().getParent());
//		System.out.println(File.separator);
	}
}
