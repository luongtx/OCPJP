package exceptions;

class MyException extends RuntimeException {
    public void log() {
        System.out.println("Logging MyException");
    }
}
 
class YourException extends RuntimeException {
    public void log() {
        System.out.println("Logging YourException");
    }
}
 
public class MultiCatchTest2 {
    public static void main(String[] args) {
        try {
            throw new MyException();
        } catch(MyException | YourException ex){
        	/*
        	 * type of reference variable (ex in this case) 
        	 * is the common base class of all the Exception types mentioned,
        	 */
            ex.log();
        }
    }
}
