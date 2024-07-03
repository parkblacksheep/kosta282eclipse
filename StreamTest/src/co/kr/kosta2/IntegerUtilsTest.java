package co.kr.kosta2;

public class IntegerUtilsTest {
	public static void main(String[] args) {
		//정적 메서드 참조 
		Converter<String, Integer> converter=IntegerUtils :: stringToInt;
		int result = converter.convert("153");
		System.out.println("result = "+ result);
	}
}
