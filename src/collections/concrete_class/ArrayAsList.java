package collections.concrete_class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAsList {
	public static void main(String[] args) {
//		Double[] temperatureArray = { 31.1, 30.0, 32.5, 34.9, 33.7, 27.8 };
//		System.out.println("The original array is: " + Arrays.toString(temperatureArray));
//		List<Double> temperatureList = Arrays.asList(temperatureArray);
//		temperatureList.set(0, 35.2);
//		System.out.println("The modified array is: " + Arrays.toString(temperatureArray));
		
//		List<String> list = new ArrayList<>(Arrays.asList("A", "E", "I", "O"));
//		List<String> list = Arrays.asList("A", "E", "I", "O");
//        list.add("U");
//        list.replaceAll(s -> s + "R");
//        list.forEach(System.out::print);
        
        List<Integer> list2 = Arrays.asList(0,2,4,6,8);
        list2.replaceAll(i -> i + 1);
        System.out.println(list2);
	}
}
