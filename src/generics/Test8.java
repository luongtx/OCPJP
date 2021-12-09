package generics;


public class Test8<T> {
    T [] obj;
 
    public Test() {
        obj = new T[100];
    }
 
    public T [] get() {
        return obj;
    }
 
    public static void main(String[] args) {
        Test<String> test = new Test<>();
        String [] arr = test.get();
        System.out.println(arr.length);
    }
}