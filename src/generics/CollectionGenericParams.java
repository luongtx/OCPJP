package generics;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CollectionGenericParams {
	public static void main(String[] args) {
		HashSet<? super ClassCastException> hashSet = new HashSet<Exception>();
//		List<Object> list = new ArrayList<? extends Object>();
//		List<Integer> list = new ArrayList<Object>();
//		List<Number> list = new ArrayList<Integer>();
		Map<String, ? extends Number> map = new HashMap<String, Integer>();
	}
}
