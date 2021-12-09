package exceptions;

public class NullPointerTest {
    private static String s;
    
    public static void main(String[] args) {
        try {
            System.out.println(s.length());
        } catch(NullPointerException ex) {
            System.out.println("DONE");
        }
    }
}
