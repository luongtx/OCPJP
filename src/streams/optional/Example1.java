package streams.optional;

import java.util.stream.Stream;

public class Example1 {
	public static void selectHighestTemperature(Stream<Double> temperatures) {
		System.out.println(temperatures.max(Double::compareTo));
		/*
		 * System.out.println(temperatures.max(new Comparator<Double>() {
		 * 
		 * @Override public int compare(Double arg0, Double arg1) { return
		 * arg0.intValue() - arg1.intValue(); } }));
		 */
	}

	public static void main(String[] args) {
		// selectHighestTemperature(Stream.of(24.5, 23.6, 27.9, 21.1, 23.5, 25.5,
		// 28.3));
		selectHighestTemperature(Stream.of());
	}
}
