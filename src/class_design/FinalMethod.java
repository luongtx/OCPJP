package class_design;

class Player {
	String name;
	int age;

	Player() {
		this.name = "Yuvraj";
		this.age = 36;
	}

	public String toString() {
		return name + ", " + age;
	}

	public Class getClass() {
		return super.getClass();
	}
}

public class FinalMethod {

}
