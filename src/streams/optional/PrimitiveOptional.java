package streams.optional;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class PrimitiveOptional {

	public static void selectHighestTemperature(Stream<Double> temperatures) {
		Optional<Double> max = temperatures.max(Double::compareTo);
		if (max.isPresent()) {
			System.out.println(max.get());
		}
	}

	public static void selectHighestTemperature(DoubleStream temperatures) {
		OptionalDouble max = temperatures.max();
		max.ifPresent(System.out::println);
	}

	public static void main(String[] args) {
					
	}
}
