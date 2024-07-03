package co.kr.kosta3;

interface PrintString{
	void showString(String str);
}

public class LambdaTest {
	public static void main(String[] args) {
		//람다식을 인터페이스 형 (참조)변수에 대입
		PrintString lamdaStr = (str) -> System.out.println(str);
		lamdaStr.showString("Hello Kosta!");
		
		LambdaTest.returnString().showString("출력");
	}
	
	public static void showMyString(PrintString p) {
		p.showString("Hello Kost2! ");
	}
	
	public static PrintString returnString() {
//		PrintString str = s-> System.out.println(s);
//		return  str;
		
		return s-> System.out.println(s);
	}
}
