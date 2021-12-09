package class_design.enumerations;

enum TestENum {
	tran, luong
}

enum PrinterType {
	// private int testVar;
	// enum constants always declare at the beginning
	DOTMATRIX(5), INKJET(10), LASER(50);

	private int pagePrintCapacity;

	// enum only accept private constructor, if no access modifier specified,
	// private is implied
	PrinterType(int pagePrintCapacity) {
		this.pagePrintCapacity = pagePrintCapacity;
	}

	public int getPrintPageCapacity() {
		return pagePrintCapacity;
	}
}

public class EnumTest {
	PrinterType printerType;

	public EnumTest(PrinterType pType) {
		printerType = pType;
	}

	public void feature() {
		switch (printerType) {
			case DOTMATRIX:
				System.out.println("Dot-matrix printers are economical");
				break;
			case INKJET:
				System.out.println("Inkjet printers provide decent quality prints");
				break;
			case LASER:
				System.out.println("Laser printers provide the best quality prints");
				break;
		}
		System.out.println("Print type: " + printerType.toString());
		System.out.println("Print page capacity per minute: " + printerType.getPrintPageCapacity());

		// enum Pipe {
		// AKa, tb;
		// }
	}

	public static void main(String[] args) {
		EnumTest enumTest1 = new EnumTest(PrinterType.LASER);
		enumTest1.feature();
		EnumTest enumTest2 = new EnumTest(PrinterType.INKJET);
		enumTest2.feature();
		// java.lang.Enum;
	}
}
