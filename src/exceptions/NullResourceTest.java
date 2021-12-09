package exceptions;

class Resource implements AutoCloseable {
    public void close() {
        System.out.println("CLOSE");
    }
}
 
public class NullResourceTest {
	
	//For null resources, 
	//close() method is not called and hence NullPointerException is not thrown at runtime.  
    public static void main(String[] args) {
        try(Resource r = null) {
            System.out.println("HELLO");
        }
    }
}