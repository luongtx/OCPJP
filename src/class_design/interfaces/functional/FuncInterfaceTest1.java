package class_design.interfaces.functional;

//interface Operation {
//	int operate(int x, int y);
////	long operate(long x, long y);
//}

interface Operation<T> {
	T operate(T x, T y);
}
public class FuncInterfaceTest1 {
	public static void main(String[] args) {
        Operation<Integer> o1 = (x, y) -> x+y; 
//        Operation<Integer> o1 = (x, y) -> {return x + y;}; 
//        Operation<Integer> o1 = (Integer x, Integer y) -> x + y;
        System.out.println(o1.operate(5, 10));
        
        //Lambda expression doesn't work without target type and target type must be a functional interface.  
//        System.out.println((x,y) -> x+y);
	}
}
