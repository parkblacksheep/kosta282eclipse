package co.kr.kosta;

public class MyNumberTest{

	
	
	public static void main(String[] args) {
		MyNumber max = (x,y) ->(x>=y) ? x: y;
		//람다식을 인터페이스형 max 변수에 대입
//		MyNumber max1 = (x,y) -> (x>=y)? y:x;
		System.out.println(max.getMax(10, 20));
		//인터페이스형 변수로 메서드를 호출
		
	}
	
}
