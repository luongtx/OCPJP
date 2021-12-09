package exceptions;


public class MultiCatchTest3 {
    public static void main(String[] args) {
        try {
            throw new YourException();
        } catch(MyException | YourException e){
        	// variable in multi-catch block is implicitly final
            e = null;
        }
    }
}
