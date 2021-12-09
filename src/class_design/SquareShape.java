package class_design;

abstract class Shape {
	int s = 0;

	Shape() {
		System.out.println("Shape");
	}

	Shape(int s) {
		this.s = s;
	}

	protected void area() {
		System.out.println("Shape");
	}
}

class Square extends Shape {
	int side;

	Square(int side) {
		/* insert code here */
		super();
		this.side = side;
	}

	public void area() {
		System.out.println("Square");
	}
}

class Rectangle extends Square {
	int len, br;

	Rectangle(int x, int y) {
		/* insert code here */
//		super(x);
		len = x;
		br = y;
	}

	void area() {
		System.out.println("Rectangle");
	}
}

public class SquareShape {
	public static void main(String[] args) {
		Shape s = new Shape(10) {
		};
	}
}