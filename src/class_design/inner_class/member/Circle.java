package class_design.inner_class.member;

class Circle {
	// define Point as an inner class within Circle class
	public class Point {
		// static int a = 5;
		private int xPos;
		private int yPos;

		// you can provide constructor for an inner class like this
		
		public Point() {
			xPos = 3;
			yPos = 5;
		}

		public Point(int x, int y) {
			xPos = x;
			yPos = y;
		}

		// the inner class is like any other class - you can override methods here
		public String toString() {
			return "(" + xPos + "," + yPos + ")";
		}
	}

	// make use of the inner class for declaring a field
	private Point center;
	private int radius;

	public Circle() {
		radius = 2;
	}
	public Circle(int x, int y, int r) {
		// note how to make use of the inner class to instantiate it
		center = new Point(x, y);
		radius = r;
	}

	public String toString() {
		return "mid point = " + center + " and radius = " + radius;
	}

	public static void main(String[] s) {
		System.out.println(new Circle(10, 10, 20));
	}
}

class Test {
	public static void main(String[] args) {
		// new Circle().Point();
		String print = new Circle().new Point().toString();
		System.out.println(print);
	}
}