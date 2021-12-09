package generics.methods;

class Node<T> {

	public T data;

	public Node(T data) {
		this.data = data;
	}

	public void setData(T data) {
		System.out.println("Node.setData");
		this.data = data;
	}
}

class Shape { /* ... */ }
class Circle extends Shape { /* ... */ }
class Rectangle extends Shape { /* ... */ }

public class MyNode extends Node<Integer> {
	public MyNode(Integer data) {
		super(data);
	}

	public void setData(Integer data) {
		System.out.println("MyNode.setData");
		super.setData(data);
	}

	public static void main(String[] args) {
		MyNode mn = new MyNode(5);
		Node n = mn; 
		n.setData("Hello"); 
		Integer x = mn.data;
		
		Node<Circle> nc = new Node<>();
		Node<Shape>  ns = nc;
	}
}