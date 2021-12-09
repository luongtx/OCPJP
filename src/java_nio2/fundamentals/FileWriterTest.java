package java_io_n_nio_2.fundamentals;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterTest {
	public static void main(String[] args) throws IOException {
		File f1 = new File("F:\\f1.txt");
		FileWriter fw = new FileWriter("F:\\dir\\f2.txt");
		PrintWriter pw = new PrintWriter("F:\\f3.txt");

//        File f1 = new File("f1.txt");
//        FileWriter fw = new FileWriter("\\home\\luongtx\\dir\\f2.txt");
//        PrintWriter pw = new PrintWriter("f3.txt");
	}
}
