package generics.subtypes;

import java.util.ArrayList;
import java.util.List;

public class SubtypeTest2 {
	public static void main(String[] args) {
		List<?> list = new ArrayList<Integer>();
		list.add(new Integer(10));
	}
	
}
