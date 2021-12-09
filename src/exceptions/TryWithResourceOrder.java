package exceptions;

public class TryWithResourceOrder {
    public static void main(String[] args) {
    	
    	//Resources are closed in the reverse order of their declaration. 
        try(Resource1 r1 = new Resource1(); Resource2 r2 = new Resource2()) {
            System.out.println("Test");
        }
        
    }
}