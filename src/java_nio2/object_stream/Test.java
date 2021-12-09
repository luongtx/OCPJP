package java_io_n_nio_2.object_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
}

public class Test {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		Student student = new Student("luong", 18);
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.data"))) {
			oos.writeObject(student);
			student.setName("huong");
			// if object is already serialized then JVM doesn't seriallize object again
			oos.writeObject(student);
		}

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.data"))) {
			student = (Student) ois.readObject();
			System.out.println(student);
		}
	}
}
