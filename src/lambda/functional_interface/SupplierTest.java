package lambda.functional_interface;

import java.util.function.Supplier;

class Document {
    void printAuthor() {
        System.out.println("Document-Author");
    }
}
 
class RFP extends Document {
    @Override
    void printAuthor() {
        System.out.println("RFP-Author");
    }
}
 
public class SupplierTest {
    public static void main(String[] args) {
        check(Document::new);
        check(RFP::new);
    }
    
//    private static void check(Supplier<Document> supplier) {
//        supplier.get().printAuthor();
//    }
    
    private static void check(Supplier<? extends Document> supplier) {
        supplier.get().printAuthor();
    }
}