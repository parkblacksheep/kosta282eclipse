package kr.co.kosta5;

public class GenericthreeDPrinterTest {
	public static void main(String[] args) {
		GenericThreeDPrinter<Powder> powderPrinter =new GenericThreeDPrinter<>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter);
		
		GenericThreeDPrinter<Plastic> plasticPrinter =new GenericThreeDPrinter<>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plastic);
		
		
		
		
		
	}
}
