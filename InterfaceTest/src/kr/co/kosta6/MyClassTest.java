package kr.co.kosta6;

public class MyClassTest {
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		
		//상위 인터페이스 X형으로 대입하면 X에 선언한 메서드만 호출 가능 
		X xClass = new MyClass();
		xClass.x();
		
		//상위 인터페이스 Y형으로 대입하면 Y에 선언한 메서드만 호출 가능
		Y yClass = myClass;
		yClass.y();
		
		MyInterface iClass = myClass;
		iClass.myMethod();
		iClass.x();
		iClass.y();
		
	}
}
