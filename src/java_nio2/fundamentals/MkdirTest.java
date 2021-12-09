package java_io_n_nio_2.fundamentals;

import java.io.File;
public class MkdirTest {
	public static void main(String[] args) {
        File dirs = new File("/home/luongtx/A/B/C");
        System.out.println(dirs.mkdirs());
        File dir = new File("/home/luongtx/A");
        System.out.println(dir.mkdir());
        System.out.println(dir.delete());
        System.out.println(dirs.delete());
        
	}
}
