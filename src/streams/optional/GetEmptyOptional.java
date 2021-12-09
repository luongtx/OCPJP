package streams.optional;
import java.util.OptionalLong;

public class GetEmptyOptional {
	public static void main(String[] args) {
		OptionalLong optional = OptionalLong.empty();
		System.out.println(optional.isPresent() + " : " + optional.getAsLong());
	}
}
