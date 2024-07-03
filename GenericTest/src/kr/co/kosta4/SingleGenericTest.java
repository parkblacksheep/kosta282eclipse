package kr.co.kosta4;

class  MyClass<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
};
public class SingleGenericTest {
	public static void main(String[] args) {
		//String 타입을 저장하거나 꺼내 올 수 있는 객체로 지정
		MyClass<String> mc1 = new MyClass<>();
		mc1.setT("아 졸리당");
		System.out.println(mc1.getT());
		//Inteager 타입을 저장하거나 꺼내 올 수 있는 객체로 지정
		MyClass<Integer> mc2 = new MyClass<>();
		mc2.setT(5000);
		System.out.println(mc2.getT());
		
//		MyClass<Integer> mc3 = new MyClass<>();
//		mc3.setT("코스타");				
		// 강한 타입 체크로 문법 오류 발생( 컴파일 단계에서 손봄)
//		System.out.println(mc3.getT());
	}
}
