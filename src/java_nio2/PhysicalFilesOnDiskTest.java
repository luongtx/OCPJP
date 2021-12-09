package java_nio2;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PhysicalFilesOnDiskTest {
	public static void main(String[] args) throws IOException {
		File f1 = new File("F:/f1.txt");// No physical files is created
		FileWriter fw = new FileWriter("F:/dir/f2.txt");// Parent dir can't be created -> exception
		PrintWriter pw = new PrintWriter("F:/f3.txt");
	}
}
