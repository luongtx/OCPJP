package streams;

import java.io.IOException;
import java.util.List;
import java.util.function.Supplier;

class ExceptionCaseStudyTest {
	public static List<String> create() throws IOException {
		throw new IOException();
	}

}

public class ExceptionCaseStudy {
	public static void main(String[] args) {
		ExceptionCaseStudyTest.create().stream().count();
		Supplier<List<String>> s = ExceptionCaseStudyTest::create;
	}
}
