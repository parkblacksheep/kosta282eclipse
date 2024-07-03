package co.kr.kosta4;

//익명 클래스를 사용하여 MathOperation 구현체 구현
public class MathOperationTest2 {

	public static void main(String[] args) {
		MathOperation mo = new MathOperation() {
			
			@Override
			public int operation(int x, int y) {
				return x+y;
			}
		};
		
		int result = mo.operation(10, 20);
		System.out.println("x + y = "+ result);
		
	}

}
