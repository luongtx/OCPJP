package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

class ExceptionTest {
	public static void thrower() throws Exception {
		try {
			throw new IOException();
		} finally {
			throw new FileNotFoundException();
		}
	}

	public static void main(String[] args) {
		try {
			thrower();
		} catch (Throwable throwable) {
			System.out.println(throwable);
		}
	}
}
