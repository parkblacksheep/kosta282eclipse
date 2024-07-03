package co.kr.kosta4;

public class MathOperationTest implements MathOperation {

	@Override
	public int operation(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) {
		MathOperation mo = new MathOperationTest();
		int result = mo.operation(10, 20);
		System.out.println("x + y = "+ result);
	}
}
