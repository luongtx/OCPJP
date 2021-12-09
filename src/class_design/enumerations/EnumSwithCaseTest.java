package class_design.enumerations;

public class EnumSwithCaseTest {
	enum TrafficLight {
		RED, YELLOW, GREEN;
	}

	public static void main(String[] args) {
		TrafficLight tl = TrafficLight.valueOf(args[1]);
		switch (tl) {
		case TrafficLight.RED:
			System.out.println("STOP");
			break;
		case TrafficLight.YELLOW:
			System.out.println("SLOW");
			break;
		case TrafficLight.GREEN:
			System.out.println("GO");
			break;
		}
	}
	/*
	 * case labels accept constant names only.
	 */
}
