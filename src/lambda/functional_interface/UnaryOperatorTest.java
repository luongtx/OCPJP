package lambda.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorTest {
	public static void main(String[] args) {
		
		//example 1
		List<Integer> ell = Arrays.asList(-11, 22, 33, -44, 55);
		System.out.println("Before: " + ell);
		ell.replaceAll(Math::abs);
		System.out.println("After: " + ell);
		
		UnaryOperator<String> uop = a -> new String(a);
		
		//example 2
        UnaryOperator<String> opr = s -> s.toString().toUpperCase(); //Line n1
        System.out.println(opr.apply(new StringBuilder("Hello"))); //Line n2
        
        //example 3
        List<Integer> list = Arrays.asList (2, 3, 4);
        UnaryOperator<Long> operator = s -> s*s*s;
        list.replaceAll(operator);
        list.forEach(System.out::println);
        
        //example 4
        
        List<Integer> list2 = Arrays.asList(10, 100, 1000);
        list.replaceAll(i -> -i++);
        System.out.println(list);
	}
}
