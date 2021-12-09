package collections.concrete_class;
import java.util.LinkedList;
import java.util.List;

public class QueueRemove {
	public static void main(String[] args) {
		List<Integer> q = new LinkedList();
		q.add(10);
		q.add(12);
		q.remove(1);
		System.out.println(q);
	}
}
