package collections.set;

import java.util.Set;
import java.util.TreeSet;

class Student {
	private String name;
	private int age;

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int hashCode() {
		return name.hashCode() + age;
	}

	public String toString() {
		return "Student[" + name + ", " + age + "]";
	}

	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student stud = (Student) obj;
			return this.name.equals(stud.name) && this.age == stud.age;
		}
		return false;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

//    public int compareStd(Student o1, Student o2) {
//    	return o1.age - o2.age;
//    }

	public static int compareByName(Student s1, Student s2) {
		return s1.getName().compareTo(s2.getName());
	}
}

public class Test {
	public static void main(String[] args) {
//        Set<Student> students = new TreeSet<>((o1,o2) -> o1.getAge() - o2.getAge());
//        Set<Student> students = new TreeSet<>();
		Set<Student> students = new TreeSet<>(Student::compareByName);
//        Set<Student> students = new TreeSet<>((o1,o2) -> Student.compareByName(o1, o2));
		students.add(new Student("James", 20));
		students.add(new Student("James", 20));
		students.add(new Student("James", 22));

		System.out.println(students);
	}
}