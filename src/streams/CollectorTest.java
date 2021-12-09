package streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectorTest {
	public static void main(String[] args) {
		Collectors.toCollection(ArrayList::new);
		Collectors.toCollection(HashSet::new);
		Collectors.toCollection(LinkedHashSet::new);
		Collectors.toCollection(TreeSet::new);
		Collectors.toCollection(HashMap::new);
		Collectors.toCollection(TreeMap::new);
	}
}
