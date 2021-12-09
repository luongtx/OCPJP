package lambda.functional_interface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person {
	String name;

	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
}

public class CollectionsSortNonComparable {
	public static void main(String[] args) {
		List<Person> emps = new ArrayList<>();
		Collections.sort(emps);
	}
}
