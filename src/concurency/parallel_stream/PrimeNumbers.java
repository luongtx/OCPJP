package concurency.parallel_stream;

import java.util.stream.LongStream;

public class PrimeNumbers {
	private static boolean isPrime(long val) {
		for (long i = 2; i <= val / 2; i++) {
			if ((val % i) == 0) {
				return false;
			}
		}
		return true;
	}

	public static void findPrimeByParralelStream() {
		System.out.println("Finding prime by parallel stream: ");
		long numOfPrimes = LongStream.rangeClosed(2, 100_000).parallel().filter(PrimeNumbers::isPrime).count();
		System.out.println(numOfPrimes);
	}

	public static void findPrimeBySequenceStream() {
		System.out.println("Finding prime by sequential stream: ");
		long numOfPrimes = LongStream.rangeClosed(2, 100_000).filter(PrimeNumbers::isPrime).count();
		System.out.println(numOfPrimes);
	}

	public static void main(String[] args) {
		long t0 = System.currentTimeMillis();
		findPrimeByParralelStream();
		System.out.println("Execution time: " + (System.currentTimeMillis() - t0));
		
		t0 = System.currentTimeMillis();
		findPrimeBySequenceStream();
		System.out.println("Execution time: " + (System.currentTimeMillis() - t0));
	}
}
