package collections.set;
import java.util.Set;
import java.util.TreeSet;

class Student implements Comparable<Student> {
	String name;
	int age;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		System.out.println(this + " compareTo: " + o);
		return this.age - o.age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}

public class TreeSetWithNullValues {

	public static void main(String[] args) {
//		Set<String> set = new TreeSet<>(Arrays.asList(null, "a", "b"));
//		long count = set.stream().count();
//		System.out.println(count);
		Set<Student> set = new TreeSet<>();
		set.add(new Student("A", 10));
		set.add(new Student("B", 16));
		set.add(new Student("C", 20));
		set.add(new Student("D", 5));
//		set.add(null);
	}
}
