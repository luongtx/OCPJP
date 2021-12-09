package streams;

import java.util.Optional;

public class OptionalOfNullable {
	public static void main(String[] args) {
        Optional<Integer> optional = Optional.ofNullable(null);
        System.out.println(optional);
	}
}
