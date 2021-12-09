package java_nio2.stream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BOSWriteAfterClosed {
	public static void main(String[] args) throws IOException {
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\file.tmp"));
		bos.close();
		bos.write(2);
	}
}
