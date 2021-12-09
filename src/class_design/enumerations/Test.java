package class_design.enumerations;

enum Vehicle {
	CAR("car"), MOTORBIKE("motor");

	String description;

	private Vehicle(String desc) {
		this.description = desc;
	}

	public String getDescription() {
		return description;
	}

}

public class Test {
	public static void main(String[] args) {
		System.out.println(Vehicle.CAR.name());
		System.out.println(Vehicle.CAR.getDescription());
	}
}
