package kr.co.kosta;

public class ThreeDPrinterTest {
	public static void main(String[] args) {
		
		ThreeDPrinter3 printer = new ThreeDPrinter3();
		
		Powder p1 = new Powder();
		Plastic p2 = new Plastic();
		
		printer.setMaterial(p1); // 자동 형 변환됨(업 캐스팅)
		Powder powder = (Powder)printer.getMaterial(); 
		// 직접 형 변환을 해야함(다운 캐스팅)
		
		printer.setMaterial(p2);
		Plastic plastic = (Plastic)printer.getMaterial();
		
		
		
	}
}
