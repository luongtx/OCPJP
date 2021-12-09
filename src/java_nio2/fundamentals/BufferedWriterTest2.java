package java_io_n_nio_2.fundamentals;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BufferedWriterTest2 {
	public static void main(String[] args) throws IOException{
		try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("1.txt",true)))){
			bw.write("xuan");
		}
	}

	/*
	 * normal mode: destroy file content
	 * append mode: retain file, all operation (write, append) will be append 
	 *
	 */
}
