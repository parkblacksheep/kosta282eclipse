package co.kr.kosta4;

/*
 * 	자바 람다식
 * 	- 함수형 프로그래밍에서 사용되는 함수를 간결하게 표현하기 위한 방법 중 하나임
 * 	-메서드에 대한 구현을 간결하게 표현
 *  - () -> {}
 * 	- (parameters) -> {expression}
 * 
*/
public class LambdaTest {
	public static void main(String[] args) {
		//람다식을 사용하여 operation() 메서드를 구현
		MathOperation mo = (x,y)-> x+y;
		int result = mo.operation(10, 20);
		System.out.println("x + y = "+ result);
		
	}
}
