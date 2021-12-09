package generics;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Example {
    public void print(Set<String> strSet) { }
    public void print(Set<Integer> intSet) { }
    
    public static <E> void rtti(List<E> list) {
        if (list instanceof ArrayList<Integer>) {  // compile-time error
            // ...
        }
    }
    
    public static <T extends Exception, J> void execute(List<J> jobs) {
        try {
            for (J job : jobs)
                // ...
        } catch (T e) {   // compile-time error
            // ...
        }
    }
    
    public static void print(List<? extends Number> list) {
        for (Number n : list)
            System.out.print(n + " ");
        System.out.println();
    }
}

class MathException<T> extends Exception {
}

class Parser<T extends Exception> {
    public void parse(File file) throws T {     // OK
        // ...
    }
}

final class Algorithm {
    public static <T> T max(T x, T y) {
        return x > y ? x : y;
    }
}