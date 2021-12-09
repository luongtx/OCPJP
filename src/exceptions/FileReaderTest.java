package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderTest {
	public static void main(String[] args) {
        try(FileReader fr = new FileReader("C:/temp.txt")) {
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
	}
}
